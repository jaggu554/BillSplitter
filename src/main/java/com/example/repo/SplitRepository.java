package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Split;

@Repository
public interface SplitRepository extends JpaRepository<Split,Long>{

}
