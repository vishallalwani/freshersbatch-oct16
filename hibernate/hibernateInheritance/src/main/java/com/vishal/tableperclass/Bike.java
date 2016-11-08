package com.vishal.tableperclass;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="BIKE")
@AttributeOverrides({  
    @AttributeOverride(name="vehicleId", column=@Column(name="id")),  
    @AttributeOverride(name="price", column=@Column(name="price")),  
    @AttributeOverride(name="name", column=@Column(name="name"))  
})
public class Bike extends Vehicle {
	
	@Column
	private double bike_cc;
	
	public Bike(String name,long price,double bike_cc){
		super(name,price);
		this.bike_cc = bike_cc;
	}

	public Bike(){
		
	}

	public double getBike_cc() {
		return bike_cc;
	}

	public void setBike_cc(double bike_cc) {
		this.bike_cc = bike_cc;
	}
	
	
}

