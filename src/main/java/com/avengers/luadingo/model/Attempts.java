package com.avengers.luadingo.model;

import org.springframework.stereotype.Indexed;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.annotation.Generated;
import jakarta.persistence.*;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Attempts {
    @EmbeddedId
    private AttemptsPK id;
    

    public Attempts() {
       
    }

    public AttemptsPK getId() {
        return id;
    }

    public void setId(AttemptsPK id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Attempts that = (Attempts) o;
        return id.equals(that.id);
    }


    @Override
    public int hashCode() {
        return id.hashCode();
    }

}
