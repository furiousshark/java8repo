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
import com.cjc.model.Student;

@RestController
@CrossOrigin("*")
public class MyController {

	@Autowired
	ServiceInter si;

	@PostMapping(value = "/savedata")
	public ResponseEntity<Student> savedata(@RequestBody Student s) {

		si.savedata(s);

		return new ResponseEntity<Student>(s, HttpStatus.OK);

	}

}
