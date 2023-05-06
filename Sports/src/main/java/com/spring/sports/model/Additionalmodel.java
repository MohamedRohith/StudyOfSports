package com.spring.sports.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Additionalmodel {
	@Id
	@Column(name = "add_id")
	private int am;;
	private int wide;
	private int extras;
	
	public int getAdditionalmodel() {
		return am;
	}
	public void setAdditionalmodel(int additionalmodel) {
		this.am = additionalmodel;
	}
	public int getWide() {
		return wide;
	}
	public void setWide(int wide) {
		this.wide = wide;
	}
	public int getExtras() {
		return extras;
	}
	public void setExtras(int extras) {
		this.extras = extras;
	}
	
	

}
