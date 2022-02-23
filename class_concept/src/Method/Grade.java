package Method;

public class Grade {
	private int score;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getGrade() {
		char grade = 0;
		if (score > 100 || score < 0) {
			return " 잘못 입력하였습니다. 0~100 사이의 점수를 입력해주세요.";
		}
		else if (score >= 90) return "A";
		else if (score >= 80) return "B";
		else if (score >= 70) return "C";
		else if (score >= 60) return "D";
		else return "F";
	}
	
	
}
