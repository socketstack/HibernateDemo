package hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory=null; //保存static块获取的SessionFactory实例
	private static Session session=null;
	
	//Hibernater初始化，并得到SessionFactory实例
	static {
		try{
			sessionFactory = new Configuration().configure().buildSessionFactory();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	//属性sessionFactory的getter方法
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	//获取Session实例，注意，这里的Session不是线程安全的，多个并发线程操作同一个Session，可能会引起数据混乱
	public static Session getSession(){
		session=HibernateUtil.getSessionFactory().openSession();
		return session;
	}
	
	//关闭Session实例
	public static void closeSession(){
		session.close();;
	}
	
	//关闭sessionFactory实例
	public static void closeSessionFactory(){
		sessionFactory.close();
	}
}
