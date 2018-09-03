package com.capgemini.icici.domain.domain;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
class SalesManagerTest {

	
	@Test
	void testSales() {
		//fail("Not yet implemented");
		assertEquals(1680.3, new SalesManager(1500, 1566, "priyanka").calculateNetSalary(),0.3);
		assertEquals(3798.3,new President(1800,5645,"poudel",8).calculateNetSalary(),0.2);
	}

}
