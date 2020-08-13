package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import stu_dao.Manager;
import stu_dao.StudentInfo;

public class ManagerTest {

	Manager m = new Manager();
	StudentInfo sinfo = new StudentInfo(1,"方成龙","男",100);
	List<StudentInfo> studentList = new ArrayList<StudentInfo> ();
	
	
	@Before
	public void setUp() throws Exception {
		System.out.println("测试开始");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("测试结束");
	}

	@Test
	public void testGetStudentScore() {
		m.getStudentScore(sinfo);
//		fail("Not yet implemented");
	}

	@Test
	public void testGetStudentNumber() {
		studentList.add(sinfo);
		m.getStudentNumber(studentList);
//		fail("Not yet implemented");
	}

	@Test
	public void testGetStudentNameByMaxScore() {
		studentList.add(sinfo);
		m.getStudentNameByMaxScore(studentList);
//		fail("Not yet implemented");
	}

}
