package com.omriyahoo.flywaydemo.model.repository;

import com.omriyahoo.flywaydemo.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    Customer findByName(String name);

}
