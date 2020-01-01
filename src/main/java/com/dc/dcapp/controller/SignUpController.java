package com.dc.dcapp.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dc.dcapp.dao.ADUserRepository;
import com.dc.dcapp.dao.PartnerRepository;
import com.dc.dcapp.model.ADUser;
import com.dc.dcapp.model.CBPartner;
import com.dc.dcapp.request.ADDUser;

@RestController
public class SignUpController {

	private Logger log = LoggerFactory.getLogger(SignUpController.class);
	private static final String VENDOR = "vendor";
	private static final String SPONSER = "sponser";
	private static final String BENEFICIARY = "beneficiary";

	@Autowired
	ADUserRepository adUserRepo;
	
	@Autowired
	PartnerRepository partnerRepo;

	@GetMapping(path = "/checkaccountexists/{email}")
	public boolean getUsers(@PathVariable String email) {
		log.info("Checking if account already available " + email);
		ADUser userExists = adUserRepo.findByEmail(email);
		if (null != userExists) {
			return true;
		} else {
			return false;
		}
	}
	
	@PostMapping(path = "/adduser")
	public ADDUser addUser(@RequestBody ADDUser adduser) {
		log.info("Add new account ");
		CBPartner newPartner = new CBPartner();
		try
		{
		newPartner.setCreatedDate(new Date());
		if(adduser.getProfileType().equals(VENDOR)) {
			newPartner.setIsVendor("Y");
			newPartner.setIsSponser("N");
			newPartner.setIsBeneficiary("N");
		} else if (adduser.getProfileType().equals(SPONSER)) {
			newPartner.setIsSponser("Y");
			newPartner.setIsVendor("N");
			newPartner.setIsBeneficiary("N");
		} else if (adduser.getProfileType().equals(BENEFICIARY)){
			newPartner.setIsBeneficiary("Y");
			newPartner.setIsSponser("N");
			newPartner.setIsVendor("N");
		}
		String firstName = "";
		String lastName = "";
		String name = adduser.getName();
		if(null != name && name.length() > 0) {
			if(name.trim().contains(" ")) {
				firstName = name.substring(0, name.indexOf(" "));
				lastName = name.substring(name.indexOf(" "), name.length()).trim();
			} else {
				firstName = name;
			}
		}
		newPartner.setName(name);
		newPartner.setFirstname1(firstName);
		newPartner.setLastname1(lastName);
		newPartner.setGovernmentId1(adduser.getGovernmentId());
		newPartner.setAdClientId(11);
		newPartner.setAdOrgId(11);
		newPartner.setCreatedDate(new Date());
		newPartner.setUpdatedDate(new Date());
		newPartner.setIsActive("Y");
		newPartner.setCreatedBy(111);
		newPartner.setUpdatedBy(111);
		newPartner.setValue("Test");
		newPartner.setIsSummary("N");
		newPartner.setIsonetime("N");
		newPartner.setIsprospect("N");
		newPartner.setIsCustomer("N");
		newPartner.setIsEmployee("N");
		newPartner.setIsSalesRep("N");
		newPartner.setSendemail("N");
		newPartner.setIsPoTaxExempt("N");
		newPartner.setIs1099Vendor("N");
		newPartner.setIsUseTaxIdDigit("N");
		newPartner.setIsDetailedNames("N");
		newPartner.setIsManager("N");
		newPartner.setBpGroupId(104);
		partnerRepo.save(newPartner);
		}catch(Exception e)
		{
			log.error("Error saving user " + e);
			e.printStackTrace();
		}
		return adduser;
	}
}
