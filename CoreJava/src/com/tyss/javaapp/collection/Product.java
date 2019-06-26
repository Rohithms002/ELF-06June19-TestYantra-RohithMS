package com.tyss.javaapp.collection;

import lombok.Data;

@Data
public class Product implements Comparable<Product> {

	String name;
	Integer cost;
	Double rating;
	/*
	 * @Override public int compareTo(Product p) {
	 * 
	 * if(getRating()<p.getRating()) { return -1; }else if
	 * (getRating()>p.getRating()) { return 1;
	 * 
	 * }else { return 0; } }
	 */
	
	
	//based on cost
	/*@Override
	 * public int compareTo(Product p) {
		
		if(getCost()<p.getCost()) {
			return -1;
		}else if (getCost()>p.getCost()) {
			return 1;
			
		}else {
			return 0;
		}
	}*/

	  @Override
	  public int compareTo(Product o) { 
		  return o.getName().compareTo(getName());
	  
	  }
	  
	
	 
	
	
	
}
