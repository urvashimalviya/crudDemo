package com.maven.demo.QuickStart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Student;
import com.springcore.collections.A;
import com.springcore.collections.Employee;
import com.springcore.constructor.injection.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
      /*  ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/config.xml");
        Student s1=(Student) context.getBean("student");
        System.out.println(s1);
        Student s2=(Student) context.getBean("student2");
        System.out.println(s2);*/
        
     /*   ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/emp-config.xml");
        Employee e1= (Employee)context.getBean("employee");
        System.out.println(e1.getId()+" "+e1.getName());*/
        
       /* ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/emp-config.xml");
        A temp= (A)context.getBean("aref");
        System.out.println(temp.getX());
        System.out.println(temp.getOb().getY());*/
        
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/constructor/injection/ci-config.xml");
        Person p1=(Person)context.getBean("person");
        System.out.println(p1);
        Person p2=(Person)context.getBean("person2");
        System.out.println(p2);
    }
}
