package hibernate.dao;

import hibernate.entity.Student;

public interface StudentDAO {
	
	void save(Student stu);  //�־û�stu�����ݿ�
	void delete(Student stu);  //�����ݿ���ɾ��stu
	void update(Student stu);  //�������ݿ��е�stu
	Student findById(int id);	//����id�����ݿ��в���Studentʵ��
	
}
