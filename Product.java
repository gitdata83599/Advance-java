package com.sunbeam.entities;

import com.sunbeam.entities.Category;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/*
 * Refer - products table - id , category (BAKERY|SHOES|CLOTHES|STATIONAY) ,
 * product name(unique)  ,
 *  price , available quantity
 */
@Entity
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Enumerated(EnumType.STRING)
@Column(length = 20)
private  Category category;
@Column(length=20,unique=true)
private String pName;
private double price;
private Long qty;
public Product() {
	
}
public Product(Category category, String pName, double price, Long qty) {
	super();
	
	this.category = category;
	this.pName = pName;
	this.price = price;
	this.qty = qty;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
public double getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public Long getQty() {
	return qty;
}
public void setQty(Long qty) {
	this.qty = qty;
}
@Override
public String toString() {
	return "Product [id=" + id + ", category=" + category + ", pName=" + pName + ", price=" + price + ", qty=" + qty
			+ "]";
}








}
