package com.springbootattempt.springbootattempt1;

import javax.persistence.*;

@Entity
public class Home {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    @ManyToMany
    public String books;
    public String roomNumber;
    
    public Home() {
        super();
    }

    public Home(String title, String roomNumber)
            
    }

 }