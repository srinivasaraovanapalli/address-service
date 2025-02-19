package com.address.net.response;

import com.address.net.entity.Address;

import lombok.Data;

@Data
public class AddressResponse {

	private long addressId;
	
	private String street;
	
	private String city;
	
	public AddressResponse(Address address) {
		this.addressId = address.getId();
		this.street = address.getStreet();
		this.city = address.getCity();
	}
}
