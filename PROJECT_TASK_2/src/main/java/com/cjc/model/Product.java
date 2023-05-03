package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor 
@Entity
public class Product {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int productid;
private String productname;
private String productprice;
	
}
