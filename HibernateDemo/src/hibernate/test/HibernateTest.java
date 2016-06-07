package hibernate.test;

import hibernate.dao.StudentDAOImpl;
import hibernate.entity.Student;
import hibernate.util.HibernateUtil;

//测试类
public class HibernateTest {

	public static void main(String[] args) {
		
		Student stu=null;
		StudentDAOImpl sdi=new StudentDAOImpl();
		
		//调用DAO层方法，将stu2持久化到数据库
		stu=new Student();
		stu.setId(4);
		stu.setName("溜溜");
		stu.setSex("女");
		stu.setMajor("信息与信号处理");
		stu.setDept("电子系");
		sdi.save(stu);
		
		//调用DAO层方法，根据主键id从数据库删除记录
		stu=new Student();
		stu.setId(1);
		sdi.delete(stu);
		
		//调用DAO层方法，更新数据库id=2的记录
		stu=new Student();
		stu.setId(2);
		stu.setName("加多宝");
		stu.setSex("女");
		stu.setMajor("生物技术");
		stu.setDept("生物系");
		sdi.update(stu);
		
		//调用DAO层方法，依据id查询记录
		stu=new StudentDAOImpl().findById(2);
		System.out.println(stu);
		
		//关闭SessionFactory实例
		HibernateUtil.closeSessionFactory();
	}

}
