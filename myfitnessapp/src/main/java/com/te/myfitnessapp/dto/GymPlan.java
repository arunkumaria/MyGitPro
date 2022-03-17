package com.te.myfitnessapp.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.engine.internal.Cascade;

@Entity
@Table(name = "GymPlans")
public class GymPlan implements Serializable {

	@Id
	private Integer pId;
	private String training;
	private String classes;

	@OneToOne(targetEntity = GymCoach.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "PlanCoach", joinColumns = @JoinColumn(referencedColumnName = "pId"), inverseJoinColumns = @JoinColumn(referencedColumnName = "cId"))
	private GymCoach gymCoach;

	@OneToOne(mappedBy = "proId")
	private GymProduct gymProduct;

	@OneToOne(targetEntity = GymNotification.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "PlanNotification", joinColumns = @JoinColumn(referencedColumnName = "pId"), inverseJoinColumns = @JoinColumn(referencedColumnName = "nId"))
	private GymNotification gymNotification;

	public GymPlan() {
		super();
	}

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getTraining() {
		return training;
	}

	public void setTraining(String training) {
		this.training = training;
	}

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public GymCoach getGymCoach() {
		return gymCoach;
	}

	public void setGymCoach(GymCoach gymCoach) {
		this.gymCoach = gymCoach;
	}

	public GymProduct getGymProduct() {
		return gymProduct;
	}

	public void setGymProduct(GymProduct gymProduct) {
		this.gymProduct = gymProduct;
	}

	public GymNotification getGymNotification() {
		return gymNotification;
	}

	public void setGymNotification(GymNotification gymNotification) {
		this.gymNotification = gymNotification;
	}

}
