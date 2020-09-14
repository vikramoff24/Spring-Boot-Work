package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Aliens;

public interface AlienRepo extends CrudRepository<Aliens, Integer>
{

}
