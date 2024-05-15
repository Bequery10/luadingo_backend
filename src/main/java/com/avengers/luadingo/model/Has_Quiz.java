package com.avengers.luadingo.model;

import org.springframework.stereotype.Indexed;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.annotation.Generated;
import jakarta.persistence.*;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})


public class Has_Quiz {
    @EmbeddedId
    private Has_QuizPK id;

    public Has_Quiz() {
       
    }

    public Has_QuizPK getId() {
        return id;
    }

    public void setId(Has_QuizPK id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Has_Quiz that = (Has_Quiz) o;
        return id.equals(that.id);
    }


    @Override
    public int hashCode() {
        return id.hashCode();
    }
    
}
