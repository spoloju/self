package com.association.onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Association_OnetoMany_Item")
public class Item {
	
	@Id	
	@Column(name="ItemID")
	private int itemId;
	@Column(name="ItemName")
	private String name;
	@Column(name="ItemPrice")
	private double price;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(int itemId, String name, double price) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.price = price;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
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

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
	


}
