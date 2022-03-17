package com.te.myfitnessapp.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CoachDetails")

public class GymCoach implements Serializable {

	@Id
	private Integer cId;
	private String cName;
	private String cEmail;
	private String cImage;
	private String cSpecialization;
	private Long cPhno;

	@OneToOne(mappedBy = "pid")
	private GymPlan gymPlan;

	@OneToOne(targetEntity = GymNotification.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "CoachNotification", joinColumns = @JoinColumn(referencedColumnName = "cId"), inverseJoinColumns = @JoinColumn(referencedColumnName = "nId"))
	private GymNotification gymNotification;

	public GymCoach() {
		super();
	}

	public Integer getcId() {
		return cId;
	}

	public void setcId(Integer cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcEmail() {
		return cEmail;
	}

	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}

	public String getcImage() {
		return cImage;
	}

	public void setcImage(String cImage) {
		this.cImage = cImage;
	}

	public String getcSpecialization() {
		return cSpecialization;
	}

	public void setcSpecialization(String cSpecialization) {
		this.cSpecialization = cSpecialization;
	}

	public Long getcPhno() {
		return cPhno;
	}

	public void setcPhno(Long cPhno) {
		this.cPhno = cPhno;
	}

	public GymPlan getGymPlan() {
		return gymPlan;
	}

	public void setGymPlan(GymPlan gymPlan) {
		this.gymPlan = gymPlan;
	}

	public GymNotification getGymNotification() {
		return gymNotification;
	}

	public void setGymNotification(GymNotification gymNotification) {
		this.gymNotification = gymNotification;
	}

}
