package aisw.ui;

import aisw.entity.Exam;

public class GridDisplayExam implements DisplayExam {

	private Exam exam;

	@Override
	public void display() {
		System.out.println("----------------");
		System.out.printf("total   | %d\n", exam.getTotal());
		System.out.printf("avg     | %.2f\n", exam.getAvg());
		System.out.println("----------------");
	}

	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
	}

}
