package com.cjc.RepoInter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Supplier;

@Repository
public interface SupplierRepo extends JpaRepository<Supplier, Integer>{

}
