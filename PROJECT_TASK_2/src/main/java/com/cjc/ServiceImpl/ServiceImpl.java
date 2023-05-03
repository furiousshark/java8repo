package com.cjc.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.RepoInter.RepoInter;
import com.cjc.ServiceInter.ServiceInter;
import com.cjc.model.Product;

@Service
public class ServiceImpl implements ServiceInter {

@Autowired
private RepoInter ri;

	@Override
	public void savedata(Product p) {
		
		ri.save(p);
		
	}

	@Override
	public void deletedata(int id) {
		ri.deleteById(id);
		
	}

}
