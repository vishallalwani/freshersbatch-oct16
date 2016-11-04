package com.vishal.hibernateMapping;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="STOCK")
public class Stock {

	@Id
	@GeneratedValue
	@Column(name="id")
	private Long stockId;

	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private double price;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="MARKET_ID")
	private Market market;
	
	public Stock() {
		
	}
	
	public Stock(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public Market getDepartment() {
		return market;
	}

	public void setMarket(Market market) {
		this.market = market;
	}

	public Long getStockId() {
		return stockId;
	}

	public void setStockId(Long stockId) {
		this.stockId = stockId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setSal(double price) {
		this.price = price;
	}
	public String toString() {
		return stockId + " - " + name + " - " + price;
	}
	
}