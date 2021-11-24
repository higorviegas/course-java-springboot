package com.higorviegas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.higorviegas.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
