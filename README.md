#关于HibernateDemo
这个Demo只是为了演示如何实现一个Student类的实例持久化到MySQL数据库。

###Hibernate的工作原理：
* Hibernate的初始化，创建Configuration实例
<br>初始化工作主要就是，读取配置文件和映射文件，并将读取到的信息存放到Configuration实例中。
* 创建SessionFactory实例
<br>通过Configuration实例创建SessionFactory实例，同时Configuration的使命结束；SessionFactory负责创建Session对象。
* 创建Session实例，建立数据库的连接
* 创建Transaction实例，开始一个事务
<br>Transaction负责事务管理；在使用Hibernate进行增删改操作，必须先创建Transaction实例。
* 利用Session的方法进行持久化操作
* 提交结果并结束事务
<br>对实体对象持久化操作之后，必须提交事务。
* 关闭Session，与数据库断开连接
* 关闭SessionFactory

###Hibernate实现持久化的基本流程：
* 准备开发环境，创建Hibernate项目
<br>主要是导入JDBC驱动包和Hibernate的核心包
* 在数据库中创建数据表
* 创建持久化类
* 设计映射文件hibernate.hbm.xml
<br>映射文件可以有多个，指定持久化类与数据表之间的映射规则
* 设计配置文件hibernate.cfg.xml
<br>配置连接到数据库的相关参数
* 编写辅助工具类HibernateUtil
<br>主要用来实现对Hibernate的初始化工作以及获取Session
* 编写DAO层类及实现DAO层
* 编写测试类
<br>可以使用Junit或者main方法实现测试

###文件说明：
* HibernateDemo需要用到的第三方库文件，都已经存放在lib文件夹内
* student.sql文件，创建表student的SQL脚本
* student_data.sql文件，向表student中插入几条记录的SQL脚本
* student.cvs文件，初始化表student的几条记录
* student_last.cvs文件，持久化完成后，表student的几条记录
<br>**注意：***cvs文件建议使用文本编辑器打开，如Sublime Text*

###如何复现HibernateDemo
* 在MySQL中创建数据库college和数据表student,并导入文件提供的数据
* 将工程导入Eclipse
* 运行包hibernate.test下的文件HibernateTest.java或者使用Junit运行包hibernate.junit下的文件HibernateJunit.java
* 完成上面三步即可复现demo

###更多问题可以联系[wyue_email@163.com](wyue_email@163.com)