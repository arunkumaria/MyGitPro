package com.te.myfitnessapp.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "GymData")

public class UserAccessBean implements Serializable {
	
	@Id
	private Integer uId;
	
	@OneToMany(targetEntity = GymProduct.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "userproducts", joinColumns = @JoinColumn(referencedColumnName = "uId"), inverseJoinColumns = @JoinColumn(referencedColumnName = "proId"))
	private List<GymProduct> gymProduct;
	

	public Integer getuId() {
		return uId;
	}

	public void setuId(Integer uId) {
		this.uId = uId;
	}

	public List<GymProduct> getGymProduct() {
		return gymProduct;
	}

	public void setGymProduct(List<GymProduct> gymProduct) {
		this.gymProduct = gymProduct;
	}


}
