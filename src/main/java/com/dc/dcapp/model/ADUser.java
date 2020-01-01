package com.dc.dcapp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ad_user")
public class ADUser {
	
	@Id
	@Column(name="ad_user_id")
	@GeneratedValue
	private Long adUserId;
	
	@Column(name="c_bpartner_id")
	private Long cbPartnerId;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="description")
	private String description;
	
	@Column(name="name")
	private String name;
	
	@Column(name="isactive")
	private String isActive;
	
	@Column(name="created")
	private Date createdDate;
	
	@Column(name="createdby")
	private Long createdBy;
	
	@Column(name="updated")
	private Date updatedDate;
	
	@Column(name="updatedby")
	private Long updatedBy;
	
	@Column(name="securityquestion")
	private String securityQuestion;
	
	@Column(name="answer")
	private String answer;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="phone2")
	private String phone2;
	
	
	public Long getAdUserId() {
		return adUserId;
	}

	public void setAdUserId(Long adUserId) {
		this.adUserId = adUserId;
	}

	public Long getCbPartnerId() {
		return cbPartnerId;
	}

	public void setCbPartnerId(Long cbPartnerId) {
		this.cbPartnerId = cbPartnerId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Long getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
	
	

}
