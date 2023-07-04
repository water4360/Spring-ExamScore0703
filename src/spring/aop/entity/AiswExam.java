package spring.aop.entity;

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
//		//부가업무1(시간측정)
//		long start = System.currentTimeMillis();

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//주업무
		int result = kor+eng+math;
//		//부가업무2(시간측정)
//		long end = System.currentTimeMillis();
//		long duration = end - start;
//		System.out.printf("총 소요시간 : %d ms \n", duration);
//		System.out.println(this.getClass().getMethod(this.getClass(), String));
		
		return result;
	}

	@Override
	public double getAvg() {
		return (float)(getTotal())/3;
	}
	
	
}
