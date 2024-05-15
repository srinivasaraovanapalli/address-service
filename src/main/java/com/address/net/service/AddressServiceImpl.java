package com.address.net.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.address.net.entity.Address;
import com.address.net.repositry.AddressRepository;
import com.address.net.request.CreateAddressRequest;
import com.address.net.response.AddressResponse;

@Service
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public AddressResponse createAddress(CreateAddressRequest createAddressRequest) {
		
		Address address = new Address();
		address.setStreet(createAddressRequest.getStreet());
		address.setCity(createAddressRequest.getCity());
		
		addressRepository.save(address);
		
		return new AddressResponse(address);
	}

	@Override
	public AddressResponse getById(long id) {
		// TODO Auto-generated method stub
		Address address = addressRepository.findById(id).get();
		AddressResponse addressResponse = new AddressResponse(address);
		addressResponse.setAddressId(address.getId());
		addressResponse.setStreet(address.getStreet());
		addressResponse.setCity(address.getCity());
		System.out.println(address);
		return addressResponse;//new AddressResponse(address);
	}
	
	

}
