package com.avengers.luadingo.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

public class Has_QuizPK implements Serializable {
    private int quiz_id;
    private int course_id;

    public Has_QuizPK() {
    }

    public Has_QuizPK(int quiz_id, int course_id) {
        this.quiz_id = quiz_id;
        this.course_id = course_id;
    }

    public int getQuiz_id() {
        return quiz_id;
    }

    public void setQuiz_id(int quiz_id) {
        this.quiz_id = quiz_id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(quiz_id, course_id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Has_QuizPK other = (Has_QuizPK) obj;
        return quiz_id == other.quiz_id && course_id == other.course_id;
    }

}
