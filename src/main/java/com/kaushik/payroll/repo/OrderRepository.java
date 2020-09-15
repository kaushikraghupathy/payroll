package com.kaushik.payroll.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaushik.payroll.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {}
