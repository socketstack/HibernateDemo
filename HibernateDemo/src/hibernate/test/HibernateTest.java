package hibernate.test;

import hibernate.dao.StudentDAOImpl;
import hibernate.entity.Student;
import hibernate.util.HibernateUtil;

//������
public class HibernateTest {

	public static void main(String[] args) {
		
		Student stu=null;
		StudentDAOImpl sdi=new StudentDAOImpl();
		
		//����DAO�㷽������stu2�־û������ݿ�
		stu=new Student();
		stu.setId(4);
		stu.setName("����");
		stu.setSex("Ů");
		stu.setMajor("��Ϣ���źŴ���");
		stu.setDept("����ϵ");
		sdi.save(stu);
		
		//����DAO�㷽������������id�����ݿ�ɾ����¼
		stu=new Student();
		stu.setId(1);
		sdi.delete(stu);
		
		//����DAO�㷽�����������ݿ�id=2�ļ�¼
		stu=new Student();
		stu.setId(2);
		stu.setName("�Ӷ౦");
		stu.setSex("Ů");
		stu.setMajor("���＼��");
		stu.setDept("����ϵ");
		sdi.update(stu);
		
		//����DAO�㷽��������id��ѯ��¼
		stu=new StudentDAOImpl().findById(2);
		System.out.println(stu);
		
		//�ر�SessionFactoryʵ��
		HibernateUtil.closeSessionFactory();
	}

}
