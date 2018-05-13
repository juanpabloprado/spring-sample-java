package com.juanpabloprado;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Value("${dbusername}")
	private String dbUsername;
	
	/* (non-Javadoc)
	 * @see com.juanpabloprado.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		System.out.println(dbUsername);
		
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstName("Juan");
		customer.setLastName("Prado");
		customers.add(customer);
		
		return customers;
	}
}

