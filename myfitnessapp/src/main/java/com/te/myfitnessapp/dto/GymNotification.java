package com.te.myfitnessapp.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="GymNotifications")

public class GymNotification implements Serializable{
	
	@Id
	
	private Integer nId;
	
	private String nMsg;
	

	@OneToOne(mappedBy = "proId")
	private GymProduct gymProduct ;
	
	@OneToOne(mappedBy = "pId")
	private GymPlan gymPlan;
	
	@OneToOne(mappedBy = "cId")
	private GymCoach gymCoach;
	

	
	public GymNotification() {
		super();
	}
	
	public Integer getnId() {
		return nId;
	}
	public void setnId(Integer nId) {
		this.nId = nId;
	}
	public String getnMsg() {
		return nMsg;
	}
	public void setnMsg(String nMsg) {
		this.nMsg = nMsg;
	}
	
	
	

}
