package com.pedroblome.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedroblome.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
