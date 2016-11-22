package com.vishal.entity;

public class Advertisement {
	private int advertiseId;
	private String title;
	private String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	private String name;
	private String category;
	private String description;
	private String photo;
	public int getAdvertiseId() {
		return advertiseId;
	}
	public void setAdvertiseId(int advertiseId) {
		this.advertiseId = advertiseId;
	}

	public Advertisement() {
		// TODO Auto-generated constructor stub
	}
	public Advertisement(int id,String status,String name, String category, String description, String photo) {
		super();
		this.advertiseId=id;
		this.status=status;
		this.name = name;
		this.category = category;
		this.description = description;
		this.photo = photo;
	}


	@Override
	public String toString() {
		return "Advertisement [advertiseId=" + advertiseId + ", name=" + name + ", category=" + category + ", description="
				+ description + ", photo=" + photo + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
