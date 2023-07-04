package spring.aop.entity;

public class HitechExam implements Exam {

	protected int kor;
	protected int eng;
	protected int math;
	protected int com;
	
	
	
	
	public HitechExam() {
		super();
	}

	public HitechExam(int kor, int eng, int math, int com) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.com = com;
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

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	@Override
	public int getTotal() {
		return kor + math + eng + com;
	}

	@Override
	public double getAvg() {
		return (float)getTotal()/4;
	}

	
}
