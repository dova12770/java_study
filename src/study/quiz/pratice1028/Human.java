package study.quiz.pratice1028;

public class Human {

	String name;
	String gender;
	int age;
	int tall;
	int kg;
	String work;
	String blood;
	String health;
	String sleep;
	
	Human(String name,String gender,int age, int tall,int kg,String work,String blood,String health,String sleep){
		this.name=name;
		this.gender=gender;
		this.age=age;
		this.tall=tall;
		this.kg=kg;
		this.work=work;
		this.blood=blood;
		this.health=health;
		this.sleep=sleep;
		}
	void humaninfo() {
		System.out.printf("이름:%s 성별:%s 나이:%d 키:%d 몸무게:%d 직업: %s 혈액형: %s 건강상태: %s 수면중여부: %s\n",name,gender,age,tall,kg,work,blood,health,sleep);
	}
	}

