package com.higorviegas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.higorviegas.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
