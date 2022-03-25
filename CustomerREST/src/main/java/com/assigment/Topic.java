
package com.assigment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer topicId;
    private String topicName;
    private String topicGradeLevel;

    public Topic() {
    }
    
    public Topic(Integer topicId, String topicName, String topicGradeLevel) {
        this.topicId = topicId;
        this.topicName = topicName;
        this.topicGradeLevel = topicGradeLevel;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicGradeLevel() {
        return topicGradeLevel;
    }

    public void setTopicGradeLevel(String topicGradeLevel) {
        this.topicGradeLevel = topicGradeLevel;
    }
    
    
}
