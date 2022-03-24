package com.ejb.services;
import java.util.List;

import com.jpa.entities.TestRecord;
public interface TestService {
	public void addTestRecord(TestRecord emp);
	public List<TestRecord> listTestRecords();
}

