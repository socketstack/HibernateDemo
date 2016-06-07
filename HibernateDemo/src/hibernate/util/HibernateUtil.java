package hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory=null; //����static���ȡ��SessionFactoryʵ��
	private static Session session=null;
	
	//Hibernater��ʼ�������õ�SessionFactoryʵ��
	static {
		try{
			sessionFactory = new Configuration().configure().buildSessionFactory();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	//����sessionFactory��getter����
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	//��ȡSessionʵ����ע�⣬�����Session�����̰߳�ȫ�ģ���������̲߳���ͬһ��Session�����ܻ��������ݻ���
	public static Session getSession(){
		session=HibernateUtil.getSessionFactory().openSession();
		return session;
	}
	
	//�ر�Sessionʵ��
	public static void closeSession(){
		session.close();;
	}
	
	//�ر�sessionFactoryʵ��
	public static void closeSessionFactory(){
		sessionFactory.close();
	}
}
