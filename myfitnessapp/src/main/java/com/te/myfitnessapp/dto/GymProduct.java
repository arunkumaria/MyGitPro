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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Table(name = "GymProducts")
public class GymProduct implements Serializable {

	@Id
	private Integer proId;

	private String productType;

	@OneToOne(targetEntity = GymPlan.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "ProductPlan", joinColumns = @JoinColumn(referencedColumnName = "proId"), inverseJoinColumns = @JoinColumn(referencedColumnName = "pid"))
	private GymPlan gymPlan;

	@OneToOne(targetEntity = GymNotification.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "ProductNotification", joinColumns = @JoinColumn(referencedColumnName = "proId"), inverseJoinColumns = @JoinColumn(referencedColumnName = "nId"))
	private GymNotification gymNotification;

	public GymProduct() {
		super();
	}

	public Integer getProId() {
		return proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
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
