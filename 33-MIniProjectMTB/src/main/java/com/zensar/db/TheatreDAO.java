package com.zensar.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.bean.Theatre;

@Repository
public interface TheatreDAO extends JpaRepository<Theatre, Integer>{

}
