package com.dani.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dani.course.entities.OrderItem;
import com.dani.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
