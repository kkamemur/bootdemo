package com.heroku.demo;

import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {
}
