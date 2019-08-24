package com.calicoder.springpostgres.SpringPostgresExample.repository;

import com.calicoder.springpostgres.SpringPostgresExample.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
