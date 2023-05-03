package com.cjc.model;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor 
@Entity
public class Student {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String stufirstname;
private String stulastname;
private String stuemail;
private String stumobno;
private String username;
private String password;



	
}
