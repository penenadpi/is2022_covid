package com.ejb.services.impl;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.ejb.services.TestService;
import com.jpa.entities.TestRecord;
@Stateless
public class TestServiceImpl implements TestService {
	@PersistenceContext(name = "EmployeeApp")
	private EntityManager em;
	@Override
	public void addTestRecord(TestRecord emp) {
		em.persist(emp);
	}
		
	@Override
	public List<TestRecord> listTestRecords() {

		List<TestRecord> allEmployees = em.createQuery("SELECT t FROM TestRecord t", TestRecord.class).getResultList();
		return allEmployees;
	}

	
}

