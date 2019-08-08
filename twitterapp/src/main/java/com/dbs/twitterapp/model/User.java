package com.dbs.twitterapp.model;


import lombok.Data;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;



import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import lombok.Builder;

@Data
@Entity
@Table
public class User {

    public User(){}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    
   
    private String name;
    
   
    private String password;

    private String email;
    private String city;
    private String street;
    private String state;
    private int zipcode;
    
   
    public User(long id, String name,String password,String email,String city,String street,String state,int zipcode){
        this.id = id;
        this.name = name;
        this.password=password;
        this.city=city;
        this.email=email;
        this.street=street;
        this.state=state;
        this.zipcode=zipcode;
    }

  
}