package com.address.net.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.address.net.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
