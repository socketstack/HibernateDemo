package hibernate.junit;

import org.junit.Test;
import hibernate.dao.StudentDAOImpl;
import hibernate.entity.Student;

public class HibernateJunit {

	@Test
	public void testSave() {
		Student stu=new Student();
		StudentDAOImpl sdi=new StudentDAOImpl();
		
		stu.setId(4);
		stu.setName("溜溜");
		stu.setSex("女");
		stu.setMajor("信息与信号处理");
		stu.setDept("电子系");
		sdi.save(stu);
	}

	@Test
	public void testDelete() {
		Student stu=new Student();
		StudentDAOImpl sdi=new StudentDAOImpl();
		stu=new Student();
		stu.setId(1);
		sdi.delete(stu);
	}

	@Test
	public void testUpdate() {
		Student stu=new Student();
		StudentDAOImpl sdi=new StudentDAOImpl();
		stu=new Student();
		stu.setId(2);
		stu.setName("加多宝");
		stu.setSex("女");
		stu.setMajor("生物技术");
		stu.setDept("生物系");
		sdi.update(stu);
	}

	@Test
	public void testFindById() {
		Student stu=new Student();
		stu=new StudentDAOImpl().findById(2);
		System.out.println(stu);
	}

}
