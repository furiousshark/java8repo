package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.ServiceInter.ServiceInter;
import com.cjc.model.Product;

@RestController
@CrossOrigin("*")
public class MyController {

@Autowired
ServiceInter si;

@PostMapping("/savedata")
public ResponseEntity<Product> savedata(@RequestBody Product p)
{
	si.savedata(p);
	
	return new ResponseEntity<Product>(HttpStatus.OK);
	
	
}

@DeleteMapping("/deletedata/{id}")
public ResponseEntity<Product> deletedata(int id )
{
si.deletedata(id);
	
return new ResponseEntity<>(HttpStatus.ACCEPTED);
}
}
