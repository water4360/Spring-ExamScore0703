package aisw.entity;

public class AiswExam implements Exam{

	protected int kor;
	protected int eng;
	protected int math;
	
	
	
	public AiswExam(int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public AiswExam() {
		super();
	}

	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		this.kor = kor;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public int getTotal() {
		int result = kor+eng+math;
		return result;
	}

	@Override
	public double getAvg() {
		return (float)(getTotal())/3;
	}
	
	
}
