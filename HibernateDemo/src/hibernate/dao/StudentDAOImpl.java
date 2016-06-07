package hibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import hibernate.entity.Student;
import hibernate.util.HibernateUtil;

//实现StudentDAO
public class StudentDAOImpl implements StudentDAO {
	
	
	@Override
	//将stu持久化到数据库
	public void save(Student stu) {
		Session session=HibernateUtil.getSession();  //获取Session实例
		
		Transaction tr= session.beginTransaction();  //开启一个事务
		session.save(stu);  //向数据库中插入一条记录，相当于insert
		tr.commit();  //提交事务
		
		HibernateUtil.closeSession();  //关闭Session
	}

	@Override
	//从数据库中删除stu
	public void delete(Student stu) {
		Session session=HibernateUtil.getSession();  //获取Session实例
		
		Transaction tr= session.beginTransaction();  //开启一个事务
		session.delete(stu);  //从数据库中删除一条记录，相当于delete
		tr.commit();  //提交事务
		
		HibernateUtil.closeSession();  //关闭Session

	}

	@Override
	//更新数据库中的stu
	public void update(Student stu) {
		Session session=HibernateUtil.getSession();  //获取Session实例
		
		Transaction tr= session.beginTransaction();  //开启一个事务
		session.update(stu);  //更新数据库一条记录，相当于update
		tr.commit();  //提交事务
		
		HibernateUtil.closeSession();  //关闭Session

	}

	@Override
	//依据主键查找Student实例
	public Student findById(int id) {
		Session session=HibernateUtil.getSession();  //获取Session实例
		
		Transaction tr= session.beginTransaction();  //开启一个事务
		Student stu=(Student)session.get(Student.class, id);  //根据id获取一条记录，并保存到Student实例中
		tr.commit();    //提交事务
		
		HibernateUtil.closeSession();  //关闭Session
		return stu;  //返回查找到的Student实例
	}

}
