package hibernate.entity;


//持久化类Student
public class Student{
	private int id;  //学号
	private String name;  //姓名
	private String sex;  //性别
	private String major;  //专业
	private String dept;  //院系
	
	@Override
	//重写toString
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex + ", major=" + major + ", dept=" + dept + "]";
	}
	
	//属性id的getter和setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//属性name的getter和setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//属性sex的getter和setter
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	//属性major的getter和setter
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	//属性dept的getter和setter
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
