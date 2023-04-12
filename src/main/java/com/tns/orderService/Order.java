package com.tns.orderService;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Order {
	private Integer order_id;
	private String order_name;
	private String customer_name;
	private Integer payment;
	private String payment_type;
	private Integer quantity;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(Integer order_id, String order_name, String customer_name, Integer payment, String payment_type,
			Integer quantity) {
		super();
		this.order_id = order_id;
		this.order_name = order_name;
		this.customer_name = customer_name;
		this.payment = payment;
		this.payment_type = payment_type;
		this.quantity = quantity;
	}
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	public Integer getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	public String getOrder_name() {
		return order_name;
	}
	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public Integer getPayment() {
		return payment;
	}
	public void setPayment(Integer payment) {
		this.payment = payment;
	}
	public String getPayment_type() {
		return payment_type;
	}
	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", order_name=" + order_name + ", customer_name=" + customer_name
				+ ", payment=" + payment + ", payment_type=" + payment_type + ", quantity=" + quantity + "]";
	}
	
	

}
