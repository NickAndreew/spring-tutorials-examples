package com.calicoder.springpostgres.SpringPostgresExample.repository;

import com.calicoder.springpostgres.SpringPostgresExample.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {

    List<Answer> findByQuestionId(Long questionId);
}
