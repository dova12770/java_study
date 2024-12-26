package study.quiz.practice1224_1;

public class ExcerciseInstanceof {

    public static void main(String[] args) {
        // 배열 생성
        Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
        for (int i = 0; i < arr.length; i++) {
            action(arr[i]);
        }
    } // main

    public static void action(Robot robot) {
        if (robot instanceof DanceRobot) {
            ((DanceRobot) robot).dance();
        } else if (robot instanceof SingRobot) {
            ((SingRobot) robot).sing();
        } else if (robot instanceof DrawRobot) {
            ((DrawRobot) robot).draw();
        }
    }
}

class Robot {
}

class DanceRobot extends Robot {
    void dance() {
        System.out.println("춤을 춥니다.");
    }
}

class SingRobot extends Robot {
    void sing() {
        System.out.println("노래를 합니다.");
    }
}

class DrawRobot extends Robot {
    void draw() {
        System.out.println("그림을 그립니다.");
    }
}
