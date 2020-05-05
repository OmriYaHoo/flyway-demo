package com.omriyahoo.flywaydemo.model.repository;

import com.omriyahoo.flywaydemo.model.Customer;
import com.omriyahoo.flywaydemo.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {

    Order findByCustomer(Customer customer);

}
