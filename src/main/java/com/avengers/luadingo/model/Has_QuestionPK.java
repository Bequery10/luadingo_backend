package com.avengers.luadingo.model;

import java.io.Serializable;
import jakarta.persistence.Embeddable;


@Embeddable
public class Has_QuestionPK implements Serializable {
    private int quiz_id;
    private int question_id;
    
    public Has_QuestionPK() {
    }
    
    public int getQuiz_id() {
        return quiz_id;
    }

    public void setQuiz_id(int quiz_id) {
        this.quiz_id = quiz_id;
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

}