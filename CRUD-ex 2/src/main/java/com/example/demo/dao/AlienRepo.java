package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Aliens;

public interface AlienRepo extends CrudRepository<Aliens, Integer>
{
  List<Aliens> findByTech(String tech);
  List<Aliens> findByaidGreaterThan(int Aid);
 @Query("from Aliens where tech=?1 order by aname")
  List<Aliens> findByTechSorted(String tech);
}

