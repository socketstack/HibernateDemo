package hibernate.dao;

import hibernate.entity.Student;

public interface StudentDAO {
	
	void save(Student stu);  //持久化stu到数据库
	void delete(Student stu);  //从数据库中删除stu
	void update(Student stu);  //更新数据库中的stu
	Student findById(int id);	//根据id从数据库中查找Student实例
	
}
