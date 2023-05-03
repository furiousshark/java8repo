package com.cjc.ServiceInter;

import java.util.List;

import com.cjc.model.Product;
import com.cjc.model.Supplier;

public interface ServiceInter {

public 	void savesupplier(Supplier ss);

public void saveproduct(Product ss);

public List<Supplier> getsupplier();

public List<Product> getall();

public void deletedata(int id);



}
