package SubjectException;

public class Subject {
	private String name;
	private int score;
	public Subject(String name, int score) throws NumberRangeOverException, NegativeNumberException {
		super();
		this.name = name;
		setScore(score);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) throws NumberRangeOverException, NegativeNumberException {
//		if(true) {
//			return; 리턴있으면 밑에throw실행안하고 종료
//		}
//		throw new NegativeNumberException("0이상의ㅁㄴㅇㅁㄴㅇ해라");
		
		if(score<0 ) {
			throw new NegativeNumberException("0이상의 값을 입력해라");
		}
		else if(score>100) {
			throw new NumberRangeOverException("0~100사이로 입력하세요");
		}
		this.score = score;
	}
	@Override
	public String toString() {
		return this.name +" 점수: "+this.score;
	}
	
	public Subject greatThen(Subject s2) {
		if(this.score>=s2.score) return this;
		else return s2;
		
	}
	

}
