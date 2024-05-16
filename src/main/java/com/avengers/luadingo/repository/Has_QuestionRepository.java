package com.avengers.luadingo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.avengers.luadingo.model.Has_Question;
import com.avengers.luadingo.model.Has_QuestionPK;

@Repository
public interface Has_QuestionRepository extends JpaRepository<Has_Question, Has_QuestionPK> {

}
