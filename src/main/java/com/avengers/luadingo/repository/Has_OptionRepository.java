package com.avengers.luadingo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.avengers.luadingo.model.Has_Option;
import com.avengers.luadingo.model.Has_OptionPK;

@Repository
public interface Has_OptionRepository extends JpaRepository<Has_Option, Has_OptionPK> {

}
