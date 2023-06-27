package com.visitorledger.app.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.visitorledger.app.entity.Visitor;

import jakarta.persistence.EntityManager;

@Repository
@Transactional
/*public class VisitorRepository {
	
	@Autowired
	EntityManager em;
	
    public Visitor findbyID(int id) {
    	return em.find(Visitor.class, id);
    }
    
    public void save(Visitor visitor) {
    	em.persist(visitor);
    }
	*/
public interface VisitorRepository extends JpaRepository<Visitor,Integer>{}

