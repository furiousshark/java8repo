package com.cjc.RepoInter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.cjc.model.Student;

@Repository
public interface Studentrepo extends JpaRepository<Student, Integer> {

}
