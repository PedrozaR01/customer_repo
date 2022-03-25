package com.assigment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GradeLevel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gradeLevelId;
    private String gradeLevelName;

    public GradeLevel() {
    }

    public GradeLevel(Integer gradeLevelId, String gradeLevelName) {
        this.gradeLevelId = gradeLevelId;
        this.gradeLevelName = gradeLevelName;
    }

    public Integer getGradeLevelId() {
        return gradeLevelId;
    }

    public void setGradeLevelId(Integer gradeLevelId) {
        this.gradeLevelId = gradeLevelId;
    }

    public String getGradeLevelName() {
        return gradeLevelName;
    }

    public void setGradeLevelName(String gradeLevelName) {
        this.gradeLevelName = gradeLevelName;
    }

}
