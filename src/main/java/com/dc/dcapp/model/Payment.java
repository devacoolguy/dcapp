package com.dc.dcapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="c_payment")
public class Payment {
	
	@Id
	@Column(name="c_payment_id")
	@GeneratedValue
	private Long paymentId;
	
	@Column(name="c_bpartner_id")
	private Long cbPartnerId;
	
	@Column(name="description")
	private String description;
	
	@Column(name="customerpaymentprofileid")
	private Long customerPaymentProfileId;
	
	@Column(name="creditcardnumber")
	private String creditCardNumber;
	
	@Column(name="creditcardexpmm")
	private int creditCardExpMM;
	
	@Column(name="creditcardexpyy")
	private int creditCardExpYY;
	
	@Column(name="creditcardtype")
	private String creditCardType;

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public Long getCbPartnerId() {
		return cbPartnerId;
	}

	public void setCbPartnerId(Long cbPartnerId) {
		this.cbPartnerId = cbPartnerId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getCustomerPaymentProfileId() {
		return customerPaymentProfileId;
	}

	public void setCustomerPaymentProfileId(Long customerPaymentProfileId) {
		this.customerPaymentProfileId = customerPaymentProfileId;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public int getCreditCardExpMM() {
		return creditCardExpMM;
	}

	public void setCreditCardExpMM(int creditCardExpMM) {
		this.creditCardExpMM = creditCardExpMM;
	}

	public int getCreditCardExpYY() {
		return creditCardExpYY;
	}

	public void setCreditCardExpYY(int creditCardExpYY) {
		this.creditCardExpYY = creditCardExpYY;
	}

	public String getCreditCardType() {
		return creditCardType;
	}

	public void setCreditCardType(String creditCardType) {
		this.creditCardType = creditCardType;
	}
	
	
}
