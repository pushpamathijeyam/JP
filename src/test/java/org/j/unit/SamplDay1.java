package org.j.unit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class SamplDay1 {
	@Test
	public void tc1() {
		System.out.println("test case 1");
		Assert.assertTrue("check aain tc1", 10 > 20);
		System.out.println("test case 11");

	}
@Test
	public void tc2() {
		System.out.println("test case 2");
		Assert.assertTrue("check c2", 20 > 10);
		System.out.println("test cse 22");

	}
@Test
	public void tc3() {
		System.out.println("test case 3");
		Assert.assertEquals("check tc3",100 ,110);
		System.out.println("test case 33");

	}
	

}
