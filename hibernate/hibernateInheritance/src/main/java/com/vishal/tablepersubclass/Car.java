package com.vishal.tablepersubclass;

import javax.persistence.*;

@Entity
@Table(name="CAR")
@PrimaryKeyJoinColumn(name="ID")
public class Car extends Vehicle {
	@Column
	private double car_cc;
	
	public Car(String name,long price,double car_cc){
		super(name,price);
		this.car_cc = car_cc;
	}

	public double getCar_cc() {
		return car_cc;
	}

	public void setCar_cc(double car_cc) {
		this.car_cc = car_cc;
	}
	
}
