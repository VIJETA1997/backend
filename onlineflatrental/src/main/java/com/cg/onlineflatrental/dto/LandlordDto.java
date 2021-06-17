package com.cg.onlineflatrental.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.cg.onlineflatrental.model.Flat;
import com.cg.onlineflatrental.model.Landlord;


public class LandlordDto {
	private Integer landlordId;
	private String landlordName;
	private Integer landlordAge;
	private Flat flat;
	
	public LandlordDto() {
		super();
	}
	
	public LandlordDto(Integer landlordId, String landlordName, Integer landlordAge,Flat flat) {
		super();
		this.landlordId = landlordId;
		this.landlordName = landlordName;
		this.landlordAge = landlordAge;
		this.flat = flat;
		
	}
	public Integer getLandlordId() {
		return landlordId;
	}

	public void setLandlordId(Integer landlordId) {
		this.landlordId = landlordId;
	}
   
	public String getLandlordName() {
		return landlordName;
	}

	public void setLandlordName(String landlordName) {
		this.landlordName = landlordName;
	}

	public Integer getLandlordAge() {
		return landlordAge;
	}

	public void setLandlordAge(Integer landlordAge) {
		this.landlordAge = landlordAge;
	}
	
	public Flat getFlat() {
		return flat;
	}

	public void setFlat(Flat flat) {
		this.flat = flat;
	
	}

}
