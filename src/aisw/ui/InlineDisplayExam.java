package aisw.ui;

import aisw.entity.Exam;

public class InlineDisplayExam implements DisplayExam {

	private Exam exam;
	
	public InlineDisplayExam() {
		super();
	}
	
	@Override
	public void display() {
		System.out.printf("total : %d, avg : %.2f \n", exam.getTotal(), exam.getAvg());
	}

	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
		
	}

}
