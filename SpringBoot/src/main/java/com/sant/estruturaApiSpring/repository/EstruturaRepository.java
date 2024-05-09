package com.sant.estruturaApiSpring.repository;

import com.sant.estruturaApiSpring.model.EstruturaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstruturaRepository extends JpaRepository<EstruturaModel, Long> {
}
