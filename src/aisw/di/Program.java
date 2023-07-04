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
		//����ٰ��� �������̽��� �ؾ���. �ȱ׷��� ������ð� �� �����ϱ�(?)
		//���� ���
		DisplayExam de = (DisplayExam)ac.getBean("displayExam");
//		DisplayExam de = ac.getBean(DisplayExam.class);
		de.display();
		
		//0704 �̰ɷ� �ϴٰ� ������
		de = ac.getBean("displayExam2", DisplayExam.class);
		de.display();
		
	}

}
