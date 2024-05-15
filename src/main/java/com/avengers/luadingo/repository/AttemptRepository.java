package com.avengers.luadingo.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.avengers.luadingo.model.Attempt;

@Repository
public interface AttemptRepository extends JpaRepository<Attempt, String> {
    
}
