package com.address.net.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.address.net.request.CreateAddressRequest;
import com.address.net.response.AddressResponse;

public interface AddressService {

	public AddressResponse createAddress(@RequestBody CreateAddressRequest createAddressRequest);
	
	public AddressResponse getById(long id);
}
