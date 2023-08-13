package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Post {
	@Id
	private Integer id;
	private String description;
	@JoinColumn(name="customer_id")
	private User u;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	
	@Override
	public String toString() {
		return "Post [id=" + id + ", description=" + description + ", u=" + u + "]";
	}
}
