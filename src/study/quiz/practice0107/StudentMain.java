package study.quiz.practice0107;

import java.time.LocalDate;
import java.util.ArrayList;
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
		
		StudentDTO saveList = new StudentDTO(99, "하나", "hana", 1, "123456-789123", LocalDate.of(2000,05,31) , "010-123-4567", 165, 70, 101, 201, 1001);
		int result = studentDAO.saveStudent(saveList);
		System.out.println("입력완료");
	}

}
