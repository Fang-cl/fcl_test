package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import stu_dao.StudentInfo;

public class StudentInfoTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("测试开始");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("测试结束");
	}

	StudentInfo sinfo = new StudentInfo(1,"方成龙","男",100);
	
	@Test
	public void testGetNo() {
		sinfo.getNo();
//		fail("Not yet implemented");
	}

	@Test
	public void testSetNo() {
		sinfo.setNo(2);
		assertEquals(2, sinfo.getNo());
//		fail("Not yet implemented");
	}

	@Test
	public void testGetName() {
		sinfo.getName();
//		fail("Not yet implemented");
	}

	@Test
	public void testSetName() {
		sinfo.setName("方");
		assertEquals("方", sinfo.getName());
//		fail("Not yet implemented");
	}

	@Test
	public void testGetSex() {
		sinfo.getSex();
//		fail("Not yet implemented");
	}

	@Test
	public void testSetSex() {
		sinfo.setSex("man");
		assertEquals("man", sinfo.getSex());
//		fail("Not yet implemented");
	}

	@Test
	public void testGetScore() {
		sinfo.getScore();
//		fail("Not yet implemented");
	}

	@Test
	public void testSetScore() {
		sinfo.setScore(99);
		assertEquals(99, sinfo.getScore());
//		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		sinfo.toString();
//		fail("Not yet implemented");
	}

}
