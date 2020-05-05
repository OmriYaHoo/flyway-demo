package com.omriyahoo.flywaydemo.model.repository;

import com.omriyahoo.flywaydemo.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    Product findByName(String name);

}
