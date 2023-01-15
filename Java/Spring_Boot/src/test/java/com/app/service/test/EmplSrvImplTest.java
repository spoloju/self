package com.app.service.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.matchers.Any;

import com.app.pojo.Employee;
import com.app.repository.EmpRepoImpl;
import com.app.service.EmpSrvImpl;
import static org.mockito.Mockito.when;

public class EmplSrvImplTest {
	
	private EmpSrvImpl srvObj = new EmpSrvImpl();
	private EmpRepoImpl repoMockObj;
	
	@Before
	public void setUp() {
		repoMockObj = mock(EmpRepoImpl.class);
		srvObj.setDbvar(repoMockObj);
	}
	

	@Test	
	public void m1() {
		
		assertEquals("Hi", "Hi");
		
	}
	
	@Test
	public void insertEmployeeTestForSuccess() {
		Employee emp = new Employee();
		when(repoMockObj.insertEmployee(emp)).thenReturn(1);
		String result = srvObj.insertEmployee(emp);
		assertEquals(result, "Total Rows Impacted with Insert Query ==> 1");
	}
	
	@Test
	public void insertEmployeeTestForError() {
		Employee emp = new Employee();
		when(repoMockObj.insertEmployee(emp)).thenReturn(0);
		String result = srvObj.insertEmployee(emp);
		assertEquals(result, "Insert Query Failed");
	}
}
