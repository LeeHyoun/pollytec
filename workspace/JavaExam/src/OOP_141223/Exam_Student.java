package OOP_141223;

public class Exam_Student {

	public static void main(String[] args) {
		Student stu1 = new Student("이현", "1201026"	);
		
		stu1.setBirthday(141223);
		stu1.setDepartment("자바");
		
		System.out.println("이름 : "+stu1.getName());
		System.out.println("학번 : "+stu1.getHakbun());
		System.out.println("생년 : "+stu1.getBirthday());
		System.out.println("과목 : "+stu1.getDepartment());
		
		System.out.println("------------------------------------------");
		Student stu2 = new Student("홍길동", "1401225");
		
		stu2.setBirthday(870303);
		stu2.setDepartment("오라클");
		
		System.out.println("이름 : "+stu2.getName());
		System.out.println("학번 : "+stu2.getHakbun());
		System.out.println("생년 : "+stu2.getBirthday());
		System.out.println("과목 : "+stu2.getDepartment());
	}

}
