package com.vishal.tablepersubclass;

import javax.persistence.*;

@Entity
@Table(name="VEHICLE")
@Inheritance(strategy=InheritanceType.JOINED)
public class Vehicle {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private long vehicleId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private long price;
	
	public Vehicle(String name,long price) {
		this.name = name;
		this.price = price;
	}
	public Vehicle(){
		
	}
	public long getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(long vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
	

}
