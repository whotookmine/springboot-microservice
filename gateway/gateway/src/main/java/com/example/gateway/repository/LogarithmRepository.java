package com.example.gateway.repository;

import com.example.gateway.entity.LogarithmAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogarithmRepository extends JpaRepository<LogarithmAnswer,Long> {
}
