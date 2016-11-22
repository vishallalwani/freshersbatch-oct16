	package com.vishal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADVERTISE")
public class Advertise {
	
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;

	@Column(name = "NAME")
	private String name;
	
	@Column(name = "TITLE")
	private String title;

	@Column(name = "CATEGORY")
	private String category;

	@Column(name = "DESCRIPTION")
	private String description;

	public Advertise(String name, String title, String category, String description) {
		super();
	//	this.id = id;
		this.title = title;
		this.category = category;
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Advertise() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Advertise [id=" + id + ", title=" + title + ", category=" + category + ", description=" + description
				+ "]";
	}
}
