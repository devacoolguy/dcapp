package com.dc.dcapp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "c_bpartner")
public class CBPartner {
	
	@Id
	@Column(name="c_bpartner_id")
	@GeneratedValue
	private int cbPartnerId;
	
	@Column(name="isactive")
	private String isActive;
	
	@Column(name="created")
	private Date createdDate;
	
	@Column(name="createdby")
	private int createdBy;
	
	@Column(name="updted")
	private Date updatedDate;
	
	@Column(name="updatedby")
	private int updatedBy;
	
	@Column(name="firstname1")
	private String firstname1;
	
	@Column(name="lastname1")
	private String lastname1;
	
	@Column(name="issponser")
	private String isSponser;
	
	@Column(name="isvendor")
	private String isVendor;
	
	@Column(name="isbeneficiary")
	private String isBeneficiary;
	
	@Column(name="isbeneficiarycontactexist")
	private String isBeneficiaryContactExist;
	
	@Column(name="governmentid1")
	private String governmentId1;
	
	@Column(name="governmentid2")
	private String governmentId2;
	
	@Column(name="ad_client_id", nullable = false)
	private int adClientId;
	
	@Column(name="ad_org_id", nullable = false)
	private int adOrgId;
	
	@Column(name="value", nullable = false)
	private String value;
	
	@Column(name="name", nullable = false)
	private String name;
	
	@Column(name="issummary", nullable = false)
	private String isSummary;
	
	@Column(name="c_bp_group_id", nullable = false)
	private int bpGroupId;
	
	@Column(name="isonetime", nullable = false)
	private String isonetime;
	
	@Column(name="isprospect", nullable = false)
	private String isprospect;
	
	@Column(name="iscustomer", nullable = false)
	private String isCustomer;
	
	@Column(name="isemployee", nullable = false)
	private String isEmployee;
	
	@Column(name="issalesrep", nullable = false)
	private String isSalesRep;
	
	@Column(name="sendemail", nullable = false)
	private String sendemail;
	
	@Column(name="ispotaxexempt", nullable = false)
	private String isPoTaxExempt;
	
	@Column(name="is1099vendor", nullable = false)
	private String is1099Vendor;
	
	@Column(name="isusetaxiddigit", nullable = false)
	private String isUseTaxIdDigit;
	
	@Column(name="isdetailednames", nullable = false)
	private String isDetailedNames;
	
	@Column(name="ismanager", nullable = false)
	private String isManager;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsSummary() {
		return isSummary;
	}

	public void setIsSummary(String isSummary) {
		this.isSummary = isSummary;
	}

	public int getBpGroupId() {
		return bpGroupId;
	}

	public void setBpGroupId(int bpGroupId) {
		this.bpGroupId = bpGroupId;
	}

	public String getIsonetime() {
		return isonetime;
	}

	public void setIsonetime(String isonetime) {
		this.isonetime = isonetime;
	}

	public String getIsprospect() {
		return isprospect;
	}

	public void setIsprospect(String isprospect) {
		this.isprospect = isprospect;
	}

	public String getIsCustomer() {
		return isCustomer;
	}

	public void setIsCustomer(String isCustomer) {
		this.isCustomer = isCustomer;
	}

	public String getIsEmployee() {
		return isEmployee;
	}

	public void setIsEmployee(String isEmployee) {
		this.isEmployee = isEmployee;
	}

	public String getIsSalesRep() {
		return isSalesRep;
	}

	public void setIsSalesRep(String isSalesRep) {
		this.isSalesRep = isSalesRep;
	}

	public String getSendemail() {
		return sendemail;
	}

	public void setSendemail(String sendemail) {
		this.sendemail = sendemail;
	}

	public String getIsPoTaxExempt() {
		return isPoTaxExempt;
	}

	public void setIsPoTaxExempt(String isPoTaxExempt) {
		this.isPoTaxExempt = isPoTaxExempt;
	}

	public String getIs1099Vendor() {
		return is1099Vendor;
	}

	public void setIs1099Vendor(String is1099Vendor) {
		this.is1099Vendor = is1099Vendor;
	}

	public String getIsUseTaxIdDigit() {
		return isUseTaxIdDigit;
	}

	public void setIsUseTaxIdDigit(String isUseTaxIdDigit) {
		this.isUseTaxIdDigit = isUseTaxIdDigit;
	}

	public String getIsDetailedNames() {
		return isDetailedNames;
	}

	public void setIsDetailedNames(String isDetailedNames) {
		this.isDetailedNames = isDetailedNames;
	}

	public String getIsManager() {
		return isManager;
	}

	public void setIsManager(String isManager) {
		this.isManager = isManager;
	}

	public int getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(int adOrgId) {
		this.adOrgId = adOrgId;
	}

	public int getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(int adClientId) {
		this.adClientId = adClientId;
	}

	public int getCbPartnerId() {
		return cbPartnerId;
	}

	public void setCbPartnerId(int cbPartnerId) {
		this.cbPartnerId = cbPartnerId;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public int getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(int updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getFirstname1() {
		return firstname1;
	}

	public void setFirstname1(String firstname1) {
		this.firstname1 = firstname1;
	}

	public String getLastname1() {
		return lastname1;
	}

	public void setLastname1(String lastname1) {
		this.lastname1 = lastname1;
	}

	public String getIsSponser() {
		return isSponser;
	}

	public void setIsSponser(String isSponser) {
		this.isSponser = isSponser;
	}

	public String getIsVendor() {
		return isVendor;
	}

	public void setIsVendor(String isVendor) {
		this.isVendor = isVendor;
	}

	public String getIsBeneficiary() {
		return isBeneficiary;
	}

	public void setIsBeneficiary(String isBeneficiary) {
		this.isBeneficiary = isBeneficiary;
	}

	public String getIsBeneficiaryContactExist() {
		return isBeneficiaryContactExist;
	}

	public void setIsBeneficiaryContactExist(String isBeneficiaryContactExist) {
		this.isBeneficiaryContactExist = isBeneficiaryContactExist;
	}

	public String getGovernmentId1() {
		return governmentId1;
	}

	public void setGovernmentId1(String governmentId1) {
		this.governmentId1 = governmentId1;
	}

	public String getGovernmentId2() {
		return governmentId2;
	}

	public void setGovernmentId2(String governmentId3) {
		this.governmentId2 = governmentId3;
	}

}
