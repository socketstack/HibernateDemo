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
		stu.setName("����");
		stu.setSex("Ů");
		stu.setMajor("��Ϣ���źŴ���");
		stu.setDept("����ϵ");
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
		stu.setName("�Ӷ౦");
		stu.setSex("Ů");
		stu.setMajor("���＼��");
		stu.setDept("����ϵ");
		sdi.update(stu);
	}

	@Test
	public void testFindById() {
		Student stu=new Student();
		stu=new StudentDAOImpl().findById(2);
		System.out.println(stu);
	}

}
