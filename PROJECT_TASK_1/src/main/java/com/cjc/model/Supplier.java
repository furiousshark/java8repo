package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

public class Supplier {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String suppliername;
	private long suppliercontactno;

	
}
