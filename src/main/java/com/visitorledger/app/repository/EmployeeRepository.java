package com.visitorledger.app.repository;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.visitorledger.app.entity.Employee;

import jakarta.persistence.EntityManager;
@Component
@Transactional
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
}
