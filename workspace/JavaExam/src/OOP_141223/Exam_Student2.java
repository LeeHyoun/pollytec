package OOP_141223;

public class Exam_Student2 {

	public static void main(String[] args) {
		Student stu1 = new Student("홍길동", "s001" );
		stu1.setKor(80);
		System.out.println("이름 : "+stu1.getName()+" 학점 : "+stu1.getKorGrade());
		
		Student stu2 = new Student("고길동", "s002" );
		stu2.setKor(45);
		System.out.println("이름 : "+stu2.getName()+" 학점 : "+stu2.getKorGrade());		
	}

}
