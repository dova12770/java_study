package study.quiz.practice1029;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle();
		circle.setRadius(5);
		System.out.println("넓이 : " + circle.getArea());
		
		Rectangle rec = new Rectangle(10, 5);
		System.out.println("넓이 : " + rec.getArea());
		
		Triangle tri = new Triangle();
		tri.setSize(6, 8);
		System.out.println("넓이 : " + tri.getArea());
	}

}
