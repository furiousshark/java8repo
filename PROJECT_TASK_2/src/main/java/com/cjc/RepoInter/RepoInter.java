package com.cjc.RepoInter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Product;

@Repository
public interface RepoInter extends JpaRepository<Product, Integer> {

}
