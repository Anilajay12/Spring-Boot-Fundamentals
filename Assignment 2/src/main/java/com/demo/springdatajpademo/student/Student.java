package com.demo.springdatajpademo.student;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * @author Anil Narlapally
 * @version JAVA 17
 * @since 5/12/2023
 */

@Entity
public class Student {
    @Id
    private Long id;
    private String name;
    private int score;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
