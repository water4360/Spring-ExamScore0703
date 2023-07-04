package aisw.di;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aisw.entity.AiswExam;
import aisw.entity.Exam;
import aisw.ui.DisplayExam;
import aisw.ui.GridDisplayExam;
import aisw.ui.InlineDisplayExam;

public class Program{

	

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("aisw/di/setting.xml");
		//여기다가는 인터페이스를 해야함. 안그러면 디펜던시가 못 가지니까(?)
		//같은 방법
		DisplayExam de = (DisplayExam)ac.getBean("displayExam");
//		DisplayExam de = ac.getBean(DisplayExam.class);
		de.display();
		
		//0704 이걸로 하다가 말았음
		de = ac.getBean("displayExam2", DisplayExam.class);
		de.display();
		
	}

}
