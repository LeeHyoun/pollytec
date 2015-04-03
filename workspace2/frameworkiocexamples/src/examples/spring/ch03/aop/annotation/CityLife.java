package examples.spring.ch03.aop.annotation;

public class CityLife implements Life {

	public void comebackHome() {
		System.out.println("퇴근한다.");

	}

	public void date() {
		System.out.println("데이트한다.");

	}

	public void eatBreakfast() {
		System.out.println("아침을 먹는다.");

	}

	public void eatDinner() {
		System.out.println("저녁을 먹는다.");

	}

	public void eatLunch() {
		System.out.println("점심을 먹는다.");

	}

	public void gotoWork() {
		System.out.println("출근한다.");

	}

}
