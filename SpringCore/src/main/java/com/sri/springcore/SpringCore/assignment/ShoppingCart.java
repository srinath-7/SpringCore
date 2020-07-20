package com.sri.springcore.SpringCore.assignment;

import java.util.List;

public class ShoppingCart {
	
	private List<Items> item;



	public List<Items> getItem() {
		return item;
	}



	public void setItem(List<Items> item) {
		this.item = item;
	}



	@Override
	public String toString() {
		return "ShoppingCart [item=" + item + "]";
	}
	

}
