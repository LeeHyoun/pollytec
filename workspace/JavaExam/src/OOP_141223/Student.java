package OOP_141223;

public class Student {
	private String hakbun;
	private String name;
	private int birthday;
	private String department;
	
	private int kor;
	private int eng;
	private int math;
	
	public Student(String name, String hakbun) {
		this.name = name;
		this.hakbun = hakbun;
	}
	
	// korGrade 
	public String getKorGrade(){
		String grade = getGrade(kor);
		return grade;
	}
	public String getEngGrade(){
		String grade = getGrade(eng);
		return grade;
	}
	public String getMathGrade(){
		String grade = getGrade(math);
		return grade;
	}

	private String getGrade(int score) {
		String grade = "";
		
		// 국어 점수가 90이상이고 100이하일 경우
		if(score >= 90 && score <= 100){
			grade="A";
		}else if(score >= 80 && score < 90){
			grade="B";
		}else if(score >= 70 && score < 80){
			grade="C";
		}else if(score >= 60 && score < 70){
			grade="D";
		}else {
			grade="F";
		}
		return grade;
	}
	
	public String getHakbun() {
		return hakbun;
	}

	/*public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}*/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
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
	
	
}
