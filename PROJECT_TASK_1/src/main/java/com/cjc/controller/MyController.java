package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.ServiceInter.ServiceInter;
import com.cjc.model.Product;
import com.cjc.model.Supplier;

@RestController
@CrossOrigin("*")
public class MyController {

	@Autowired
	private ServiceInter si;

	@PostMapping(value = "/savesupplier")
	public String savesupplier(@RequestBody Supplier ss) {
		si.savesupplier(ss);

		return "success";
	}

	@PostMapping(value = "/saveproduct")
	public String saveproduct(@RequestBody Product ss) {

		si.saveproduct(ss);

		return "success";
	}

	@GetMapping(value = "/getsupplier")
	public List<Supplier> getsupplier() {
		List<Supplier> sl = si.getsupplier();

		return sl;

	}

	@GetMapping(value = "/viewall")
	public List<Product> getall() {
		List<Product> pl = si.getall();

		return pl;

	}

	@DeleteMapping(value = "/deletedata/{id}")
	public String deletedata(@PathVariable int id) {
		si.deletedata(id);

		return "success";

	}

	@PutMapping(value = "/updatedata/{id}")
	public String updatedata(@PathVariable int id, @RequestBody Product p) {
		si.saveproduct(p);
		return " delete success";
	}

}
