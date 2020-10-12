package com.rkb.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rkb.api.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

	Order findByOrderId(int orderId);

}
