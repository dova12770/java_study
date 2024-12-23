package study.quiz.practice1223;

public class SuperTest {
	public static void main(String[] args) {
		/* 1. Orc 객체를 만들고 정보를 출력하시오. */
		Orc orc = new Orc("피언",250);
		System.out.println(orc.toString());
//		System.out.println(orc);
		/* 2. OrcWarrior 객체를 만들고 정보를 출력하시오. */
		OrcWarrior ow1 = new OrcWarrior("그런트",700,1);
		System.out.println(ow1.toString());
//		System.out.println(ow1);
	}
}
class Orc {
	protected String name;
	protected int hp;

	public Orc(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public String toString() {
//		System.out.printf("Orc{name:%s , hp : %d}\n",name,hp);
//		String str = "Orc{name:%s , hp : %d}\n",name,hp;
//		return str;
		return String.format("Orc{name:%s , hp : %d}\n",name,hp);
	}
}

class OrcWarrior extends Orc{
	protected int amor;

	public OrcWarrior(String name, int hp, int amor) {
		super(name, hp);
		this.amor = amor;
	}

// 메소드 오버라이딩!
	public String toString() {
		
		return String.format("OrcWarrior{name:%s , hp : %d, armor : %d}\n",name,hp,amor);
	}
}
//class Orc {
//	protected String name;
//	protected int hp;
//
//	public Orc(String name, int hp) {
//		this.name = name;
//		this.hp = hp;
//	}
//
//	public String toString() {
//		System.out.println("유닛명 : "+name);
//		System.out.println("체력 : "+hp);
//		return "";
//	}
//}
//
//class OrcWarrior extends Orc{
//	protected int amor;
//
//	public OrcWarrior(String name, int hp, int amor) {
//		super(name, hp);
//		this.amor = amor;
//	}
//
//// 메소드 오버라이딩!
//	public String toString() {
//		System.out.println("유닛명 : "+name);
//		System.out.println("체력 : "+hp);
//		System.out.println("방어력 : "+amor);
//		return "";
//	}
//}