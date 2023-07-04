package spring.aop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.entity.Exam;

public class Program{

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/aop/setting.xml");
		Exam exam = ac.getBean("exam", Exam.class);
		
		System.out.printf("total : %d\n", exam.getTotal());
		System.out.printf("avg : %.2f\n", exam.getAvg());
	}

}
