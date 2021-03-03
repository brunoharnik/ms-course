package com.brunoharnik.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunoharnik.hrworker.domain.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
