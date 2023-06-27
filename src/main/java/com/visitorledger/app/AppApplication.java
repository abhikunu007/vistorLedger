package com.visitorledger.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.visitorledger.app.entity.Visitor;
import com.visitorledger.app.repository.EmployeeRepository;
import com.visitorledger.app.repository.VisitorRepository;

@SpringBootApplication
public class AppApplication implements CommandLineRunner{
    @Autowired
    private VisitorRepository repo;
    @Autowired
    private EmployeeRepository empRepo;
	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Visitor visitor = new Visitor();
		visitor.setId(600003);
		visitor.setName("Kunal");
		visitor.setAge(23);
		visitor.setEmploy(empRepo.getById(1));
		repo.save(visitor);
	}

}
