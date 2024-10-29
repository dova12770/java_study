package study.quiz.practice1029;

public class Rectangle {
	int sita;
	int height;
	
	Rectangle(int sita, int height){
		this.sita=sita;
		this.height=height;
	}
	
	double getArea() {
		double result=sita*height;
				return result;
	}
}
