package org.jaykyung.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class TestGitSample {

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		System.out.println("first test");
	}
	@Test
	public void test2() {
		System.out.println("second test");
	}

}
