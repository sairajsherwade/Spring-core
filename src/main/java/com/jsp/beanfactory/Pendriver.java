package com.jsp.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.cache.interceptor.BeanFactoryCacheOperationSourceAdvisor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Pendriver {
	
	public static void main(String[] args) {
		ClassPathResource classPathResource=new ClassPathResource("myspring.xml");
		
	BeanFactory beanFactory=new XmlBeanFactory(classPathResource);
	Pen pen=  (Pen) beanFactory.getBean("myPen");
	pen.write();
	
System.out.println(pen.getBrand());
System.out.println(pen.getColour());
System.out.println(pen.getPrice());
//	
	     
//		
//		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myspring.xml");
//		Pen pen = (Pen)  applicationContext.getBean("myPen");
//		pen.write();
	}

}
