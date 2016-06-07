package hibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import hibernate.entity.Student;
import hibernate.util.HibernateUtil;

//ʵ��StudentDAO
public class StudentDAOImpl implements StudentDAO {
	
	
	@Override
	//��stu�־û������ݿ�
	public void save(Student stu) {
		Session session=HibernateUtil.getSession();  //��ȡSessionʵ��
		
		Transaction tr= session.beginTransaction();  //����һ������
		session.save(stu);  //�����ݿ��в���һ����¼���൱��insert
		tr.commit();  //�ύ����
		
		HibernateUtil.closeSession();  //�ر�Session
	}

	@Override
	//�����ݿ���ɾ��stu
	public void delete(Student stu) {
		Session session=HibernateUtil.getSession();  //��ȡSessionʵ��
		
		Transaction tr= session.beginTransaction();  //����һ������
		session.delete(stu);  //�����ݿ���ɾ��һ����¼���൱��delete
		tr.commit();  //�ύ����
		
		HibernateUtil.closeSession();  //�ر�Session

	}

	@Override
	//�������ݿ��е�stu
	public void update(Student stu) {
		Session session=HibernateUtil.getSession();  //��ȡSessionʵ��
		
		Transaction tr= session.beginTransaction();  //����һ������
		session.update(stu);  //�������ݿ�һ����¼���൱��update
		tr.commit();  //�ύ����
		
		HibernateUtil.closeSession();  //�ر�Session

	}

	@Override
	//������������Studentʵ��
	public Student findById(int id) {
		Session session=HibernateUtil.getSession();  //��ȡSessionʵ��
		
		Transaction tr= session.beginTransaction();  //����һ������
		Student stu=(Student)session.get(Student.class, id);  //����id��ȡһ����¼�������浽Studentʵ����
		tr.commit();    //�ύ����
		
		HibernateUtil.closeSession();  //�ر�Session
		return stu;  //���ز��ҵ���Studentʵ��
	}

}
