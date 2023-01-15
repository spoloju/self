package com.association.onetomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Association_OnetoMany_Cart")
public class Cart {

	@Id
	@Column(name="CartId")
	private int id;
	@Column(name="UserName")
	private String userName;
	@Column(name="bill")
	private double bill;
	@OneToMany
	@JoinColumn(name="CartId")
	private List<Item> items;
	
	
	public Cart() {
		// TODO Auto-generated constructor stub
	}


	public Cart(int id, String userName, double bill, List<Item> items) {
		super();
		this.id = id;
		this.userName = userName;
		this.bill = bill;
		this.items = items;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public double getBill() {
		return bill;
	}


	public void setBill(double bill) {
		this.bill = bill;
	}


	public List<Item> getItems() {
		return items;
	}


	public void setItems(List<Item> items) {
		this.items = items;
	}


	@Override
	public String toString() {
		return "Cart [id=" + id + ", userName=" + userName + ", bill=" + bill + ", items=" + items + "]";
	}
	
	
	
	
	
	
	
	
}
