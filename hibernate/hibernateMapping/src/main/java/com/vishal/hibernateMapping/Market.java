package com.vishal.hibernateMapping;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="MARKET")
public class Market {

	@Id
	@GeneratedValue
	@Column(name="MARKET_ID")
	private int market_id;
	
	@Column(name="MARKET_NAME")
	private String marketName;
	
	@OneToMany(mappedBy="market", cascade={CascadeType.ALL})
	private Set<Stock> stocks;

	public int getMarket_id() {
		return market_id;
	}

	public void setMarket_id(int market_id) {
		this.market_id = market_id;
	}

	public String getMarketName() {
		return marketName;
	}

	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}

	public Set<Stock> getStocks() {
		return stocks;
	}

	public void setStocks(Set<Stock> stocks) {
		this.stocks = stocks;
	}

	public String toString() {
		return market_id + " - " + marketName + " - " + stocks;
	}
}

