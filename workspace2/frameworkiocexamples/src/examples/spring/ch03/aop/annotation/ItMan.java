package examples.spring.ch03.aop.annotation;

public class ItMan {

	private Life life;

	public void setLife(Life life) {
		this.life = life;
	}

	public void myLife() {
		life.eatBreakfast();
		life.gotoWork();
		life.eatLunch();
		life.eatDinner();
		life.eatBreakfast();
		life.comebackHome();
		life.date();
	}
}
