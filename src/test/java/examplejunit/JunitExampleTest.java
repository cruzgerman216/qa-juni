package examplejunit;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class JunitExampleTest {

	// @Test
	// @BeforeAll, @AfterAll - runs at start and end - once each, these methods must
	// be static!
	// @BeforeEach, @AfterEach - runs before and after each @Test

//	@BeforeAll
//	public static void start() {
//		System.out.println("Start of test\n");
//	}
//
//	@BeforeEach
//	public void beforeEach() {
//		System.out.println("TEST STARTING");
//	}
//
//	@AfterEach
//	public void afterEach() {
//		System.out.println("TEST ENDING");
//	}

	@Test
	public void test1() {
		System.out.println("Hello World - 1");
//		fail();
	}

	@Test
//	@Disabled
	public void test2() {
		System.out.println("Hello World - 2");
//		fail();
	}

//	@AfterAll
//	public static void end() {
//		System.out.println("Hello World - all");
//	}
}
