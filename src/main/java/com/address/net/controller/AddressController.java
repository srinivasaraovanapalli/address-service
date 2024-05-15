package com.address.net.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.address.net.request.CreateAddressRequest;
import com.address.net.response.AddressResponse;
import com.address.net.service.AddressService;

@RestController
@RequestMapping("v1/api/address")
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	@PostMapping
	public AddressResponse createAddress(@RequestBody CreateAddressRequest createAddressRequest) {
		return addressService.createAddress(createAddressRequest);
	}

	@GetMapping("/get/{id}")
	public AddressResponse getById(@PathVariable long id) {
		return addressService.getById(id);
	}
}
