package com.app.repository.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.jdbc.core.JdbcTemplate;

import com.app.pojo.Employee;
import com.app.repository.EmpRepoImpl;

public class EmpRepoImplTest {
	
	private static EmpRepoImpl empRepo;
	private JdbcTemplate jdbcTempMockObj;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		 empRepo = new EmpRepoImpl();
		 jdbcTempMockObj = mock(JdbcTemplate.class);
		empRepo.setJdbcvar(jdbcTempMockObj);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void insertEmployeeTest() {
		 Employee emp = new Employee(1,"shravan",900.5,90.5,10,5);
		 when(jdbcTempMockObj.update(Mockito.anyString(), 
				 new Object[] {Mockito.anyInt(), Mockito.anyString(), Mockito.anyDouble(),
						 Mockito.anyDouble(), Mockito.anyInt(), Mockito.anyInt()})).thenReturn(1);
		 int result = empRepo.insertEmployee(emp);
		 System.out.println(result);
		 assertEquals(result, 1);
	}

}
