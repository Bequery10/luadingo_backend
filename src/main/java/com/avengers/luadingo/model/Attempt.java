package com.avengers.luadingo.model;

import java.time.LocalDate;

import org.springframework.stereotype.Indexed;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.annotation.Generated;
import jakarta.persistence.*;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Attempt {
    @Id
    private int attempt_id;
    private int attempt_current;
    private int attempt_score;
    private LocalDate attempt_timestamp;

    public Attempt() {
       
    }

    public int getAttempt_current() {
        return attempt_current;
    }

    public void setAttempt_current(int attempt_current) {
        this.attempt_current = attempt_current;
    }

    public int getAttempt_score() {
        return attempt_score;
    }

    public void setAttempt_score(int attempt_score) {
        this.attempt_score = attempt_score;
    }

    public LocalDate getAttempt_timestamp() {
        return attempt_timestamp;
    }

    public void setAttempt_timestamp(LocalDate attempt_timestamp) {
        this.attempt_timestamp = attempt_timestamp;
    }

    public int getAttempt_id() {
        return attempt_id;
    }

    public void setAttempt_id(int attempt_id) {
        this.attempt_id = attempt_id;
    }

}
