package testng.day3;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class TestCase {
	
	@Test(groups = {"functional"}, dependsOnGroups = "smoke", alwaysRun = true)
	public void test1() {
		System.out.println("testcase1");

	}
	@Test(groups = {"regression"})
	public void test2() {
		System.out.println("testcase2");

	}
	@Test(groups = {"functional","regression"}, dependsOnGroups = "smoke", alwaysRun = true)
	public void test3() {
		System.out.println("testcase3");

	}
	
	@Test(groups = {"regression"})
	public void test4() {
		System.out.println("testcase4");

	}@Test(groups = {"regression","smoke"})
	public void test5() {
		System.out.println("testcase5");

	}
	
	@Test(groups = {"smoke"})
	public void test6() {
		System.out.println("testcase6");
		throw new NoSuchElementException();

	}

}
