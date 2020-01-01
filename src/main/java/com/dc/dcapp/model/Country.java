package com.dc.dcapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="c_country")
public class Country {
	
	@Id
	@Column(name="c_contry_id")
	private Long countryId;

}
