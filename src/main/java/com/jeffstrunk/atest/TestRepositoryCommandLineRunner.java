package com.jeffstrunk.atest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jeffstrunk.dao.CustomerDao;
import com.jeffstrunk.dao.ProductDao;
import com.jeffstrunk.dao.TransactionDao;
import com.jeffstrunk.entities.Customer;
import com.jeffstrunk.entities.Product;
import com.jeffstrunk.entities.Transaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class TestRepositoryCommandLineRunner implements CommandLineRunner {
	
	private static final Logger log = 
			LoggerFactory.getLogger(TestRepositoryCommandLineRunner.class);
	
	@Autowired
	private TestRepository testRepository;
	private TransactionDao tranRepo;
	private ProductDao prodRepo;	
	private CustomerDao customerDao;

	@Autowired
	public void CustomerService(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	@Autowired
	public void TransactionService(TransactionDao tranRepo) {
		this.tranRepo = tranRepo;
	}
	
	@Autowired
	public void ProductService(ProductDao prodRepo) {
		this.prodRepo = prodRepo;
	}

	@Override
	public void run(String... args) throws Exception {

		
//		ArrayList list = new ArrayList<Product>();
//		Product prod = new Product("prodID3", "prod3", 1.99);
//		Product prod2 = new Product("prodID4", "prod4", 1.99);
//		prodRepo.save(prod);
//		prodRepo.save(prod2);
//		list.add(prod);
//		list.add(prod2);
//		
//		
//		Transaction tran = new Transaction("Tran_3", LocalDateTime.now(), "custID", list, 6.99); 
//		tranRepo.save(
//				tran);
//		log.info("NEW Transaction created XXXXXXXXXXXXXXXXXXXXXXXX : " + tran);
//		
//		List<Transaction> trans = (List<Transaction>) tranRepo.findAll();
//		log.info("All tranactionss : " + trans);
		
//		public Person(String firstName, String lastName, String id, String phoneNum, String address)
		
//		Customer cust = new Customer("John", "Doe", "CustID_1", "5133334444", "1 main st.");
//		customerDao.save(cust);
//		
//		log.info("NEW Customer created XXXXXXXXXXXXXXXXXXXXXXXX : " + cust);
//		List<Customer> custs = (List<Customer>) customerDao.findAll();
//		log.info("All customers : " + custs);
//		
	}

}
