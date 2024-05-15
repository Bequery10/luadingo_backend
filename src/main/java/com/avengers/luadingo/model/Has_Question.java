package com.avengers.luadingo.model;

import org.springframework.stereotype.Indexed;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.annotation.Generated;
import jakarta.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Has_Question {
    @EmbeddedId
    private Has_QuestionPK id; 

    public Has_Question() {
       
    }

    public Has_QuestionPK getId() {
        return id;
    }

    public void setId(Has_QuestionPK id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Has_Question that = (Has_Question) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

}
