package com.cjc.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Product {

@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
private int id;
private String productname;
private String productprice;

@ManyToOne(cascade = CascadeType.MERGE.PERSIST)
private Supplier s;





	
}
