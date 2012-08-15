package com.example.cdifire;

/**
 * @author ceefour
 *
 */
public class Booking {
	
	private Double qty;

	public Booking(Double qty) {
		super();
		this.qty = qty;
	}

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return String.format("Booking [qty=%s]", qty);
	}
	
}
