package hibernate.entity;


//�־û���Student
public class Student{
	private int id;  //ѧ��
	private String name;  //����
	private String sex;  //�Ա�
	private String major;  //רҵ
	private String dept;  //Ժϵ
	
	@Override
	//��дtoString
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex + ", major=" + major + ", dept=" + dept + "]";
	}
	
	//����id��getter��setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//����name��getter��setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//����sex��getter��setter
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	//����major��getter��setter
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	//����dept��getter��setter
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
