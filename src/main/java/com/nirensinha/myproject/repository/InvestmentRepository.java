package com.nirensinha.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nirensinha.myproject.model.Investment;

public interface InvestmentRepository extends JpaRepository<Investment, Long> {

}
