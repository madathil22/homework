package com.gransara.gemstore.model;

import java.util.List;

public class ProductVO {

	  
	  private String name;
	  private int price;
	  private String color;
	  private Boolean buyable;
	  private String desc;
	  private List<ReviewVO> reviews;
	  
	  
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Boolean getBuyable() {
		return buyable;
	}
	public void setBuyable(Boolean buyable) {
		this.buyable = buyable;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public List<ReviewVO> getReviews() {
		return reviews;
	}
	public void setReviews(List<ReviewVO> reviews) {
		this.reviews = reviews;
	}
      
      
}
