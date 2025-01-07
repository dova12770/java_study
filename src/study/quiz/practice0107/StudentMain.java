package study.quiz.practice0107;

import java.util.List;

public class StudentMain {

	public static void main(String[] args) {

		StudentDAO studentDAO =new StudentDAO();
		
		List<StudentDTO> sList = studentDAO.findStudent();
		List<StudentDTO> sList2 = studentDAO.findStudentListByGrade(2);

		System.out.println("전체 리스트");
		for(StudentDTO s1 : sList) {
		System.out.println(s1.toString());
		
		}
		System.out.println("2학년 리스트");
		for(StudentDTO s2 : sList2) {
		System.out.println(s2.toString());
		}
	}

}
