package com.spring.sports.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Cricket {
	@Id

	@Column(name ="cri_id")
	private int runs;
	private int ball;
	private String batsman;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_add_id")
	private Additionalmodel additionalmodel;
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getBall() {
		return ball;
	}
	public void setBall(int ball) {
		this.ball = ball;
	}
	public String getBatsman() {
		return batsman;
	}
	public void setBatsman(String batsman) {
		this.batsman = batsman;
	}
	public Additionalmodel getAdditionalmodel() {
		return additionalmodel;
	}
	public void setAdditionalmodel(Additionalmodel additionalmodel) {
		this.additionalmodel = additionalmodel;
	}

	
	
	
	
	

}
