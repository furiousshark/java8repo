package com.cjc.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cjc.RepoInter.Studentrepo;
import com.cjc.ServiceInter.ServiceInter;
import com.cjc.model.Student;


@Service
public class ServiceImpl implements ServiceInter {

@Autowired
private Studentrepo ri;

@Override
public void savedata(Student s) {
	
	ri.save(s);
	
}


}
