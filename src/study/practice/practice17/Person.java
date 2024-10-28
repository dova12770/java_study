package study.practice.practice17;

public class Person {
	
	
	String name;
	String gender;
	int age;
	double tall;
	double weight;
	String job;
	String bloodType;
	int healthState;
	boolean isSleeping;
	
	Person(){}
		Person(String name,String gender,int age,double tall,double weight,String job,String bloodType,int healthState,boolean isSleeping){
			this.name =name;
			this.gender = gender;
			this.age=age;
			this.tall=tall;
			this.weight=weight;
			this.job=job;
			this.bloodType=bloodType;
			this.healthState=healthState;
			this.isSleeping=isSleeping;
		}
	void printPersonInfo() {
		System.out.printf("이름:%s 성별:%s 나이:%d 키:%d 몸무게:%d 직업: %s 혈액형: %s 건강상태: %d 수면중여부: %s\n",name,gender,age,tall,weight,job,bloodType,healthState,isSleeping);
	}

}
