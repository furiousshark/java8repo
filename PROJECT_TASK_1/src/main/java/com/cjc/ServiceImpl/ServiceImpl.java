package com.cjc.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.RepoInter.ProductRepo;
import com.cjc.RepoInter.SupplierRepo;
import com.cjc.ServiceInter.ServiceInter;
import com.cjc.model.Product;
import com.cjc.model.Supplier;

@Service
public class ServiceImpl implements ServiceInter {
	

@Autowired
private SupplierRepo sr;

@Autowired
private ProductRepo pr;

@Override
public void savesupplier(Supplier ss) {

 sr.save(ss);
	
}

@Override
public void saveproduct(Product ss) {
	
	pr.save(ss);
}

@Override
public List<Supplier> getsupplier() {
	
	List<Supplier> sl=sr.findAll();
	return sl;
}

@Override
public List<Product> getall() {
	
	List<Product> pl =pr.findAll();
	return pl;
}

@Override
public void deletedata(int id) {
	
	pr.deleteById(id);
	
}





}
