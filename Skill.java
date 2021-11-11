package com.springbootattempt.springbootattempt1;
 
import javax.persistence.*;
 
@Entity
public class Skill {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String label;
    private String description;
   
    public Skill() {
        super();
    }
 
    public Skill(String label, String description) {
        super();
        this.label = label;
        this.description = description;
    }
 
    public long getId() {
        return id;
    }
 
    public void setId(long id) {
        this.id = id;
    }
 
    public String getLabel() {
        return label;
    }
 
    public void setLabel(String label) {
        this.label = label;
    }
 
    public String getDescription() {
        return description;
    }
 
    public void setDescription(String description) {
        this.description = description;
    }
}
 

