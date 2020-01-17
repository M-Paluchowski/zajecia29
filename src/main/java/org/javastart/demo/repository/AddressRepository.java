package org.javastart.demo.repository;

import org.javastart.demo.model.Address;
import org.javastart.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
