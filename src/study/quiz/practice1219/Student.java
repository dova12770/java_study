
package study.quiz.practice1219;

public class Student {

    private String department;
    private int deptNum;


    public Student() {
        this.department = department;
        this.deptNum = deptNum;
    }

    public void deptInfo() {
        System.out.println("학과: " + this.department);
        System.out.println("학번: " + this.deptNum);
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDeptNum(int deptNum) {
        this.deptNum = deptNum;
    }

    
}
