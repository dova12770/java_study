package study.quiz.practice1029;

public class Triangle {
	int sita;
	int height;
	
	Triangle(){}
	Triangle(int sita, int height){
		this.sita=sita;
		this.height=height;
	}
	public void setSize(int input1, int input2) {
		sita=input1;
		height=input2;
	}
	
	double getArea() {
		double result=sita*height/2;
				return result;
	}
	
}
