package quiz;

public class Sample {
	public static void main(String[] args) {
        // 타자 등록
        String playerArr[] = { "일번타자", "이번타자", "삼번타자", "사번타자",
                "오번타자", "육번타자", "칠번타자", "팔번타자", "구번타자" };

        boolean isHit = false; // 안타 여부
        int totalRound = 3; // 총횟수
        int playerIndex = 0; // 타자 순서 인덱스

        int batCntArr[] = new int[9]; // 선수별 타석수
        int hitCntArr[] = new int[9]; // 선수별 안타수
        double battingAvg = 0; // 타율

        System.out.println("===4단계 게임을 시작합니다===");

        // 총횟수만큼만 게임 진행
        for (int i = 1; i <= totalRound; i++) {
            System.out.printf("***%d회차\n", i);
            System.out.println();

            // 한 선수 게임이 끝나면 안타/아웃 초기화
            int hitCnt = 0; // 안타수
            int outCnt = 0; // 아웃수

            while (outCnt < 3) { // 아웃 3번이면 반복문 탈출
                // 선수 입장문
                System.out.printf(">>>%d번 타자 '%s선수' 입장 !!\n",
                        (playerIndex + 1), playerArr[playerIndex]); // 선수배열[인덱스]

                // 선수별 타율 표시
                if (batCntArr[playerIndex] > 0) { // 첫타석이 아니면
                    battingAvg = (double) (hitCntArr[playerIndex] / batCntArr[playerIndex]);
                }
                System.out.printf(">>>타율:%.2f(안타:%d/타석:%d)\n",
                        battingAvg, hitCntArr[playerIndex], batCntArr[playerIndex]);

                // 한 선수의 플레이
                while (true) {
                    // 한 선수의 게임이 끝나면 볼/스트라이크 초기화
                    int ballCnt = 0; // 볼 수
                    int strikeCnt = 0; // 스트라이크 수

                    int pitchBall = (int) (Math.random() * 100) + 1; // 투수가 던지는 공
                    int playerBall = (int) (Math.random() * 100) + 1; // 타자가 치는 공

                    // 타자의 공이 안타냐 볼이냐 스트라이크냐
                    if (pitchBall == playerBall) {
                        hitCnt++; // 투수랑 타자랑 같으면 안타 수 증가
                        isHit = true; // 안타
                    } else if ((pitchBall >= 1 && pitchBall <= 10) ||
                            (pitchBall >= 50 && pitchBall <= 60) ||
                            (pitchBall >= 90 && pitchBall <= 100)) {
                        strikeCnt++; // 범위에 들어오면 스트라이크 수 증가
                    } else {
                        ballCnt++; // 다른 경우엔 볼 수 증가
                    }

                    System.out.printf("[투수:%d 플레이어:%d 스트라이크:%d 볼:%d 안타:%d 아웃:%d ]\n",
                            pitchBall, playerBall, strikeCnt, ballCnt, hitCnt, outCnt);

                    // 스트라이크가 3개면 아웃
                    if (strikeCnt == 3) {
                        System.out.println("===스트라이크 3번 아웃===");
                        outCnt++; // 아웃수 증가
                        break; // 반복문 종료
                    }

                    // 볼이 4개면 안타
                    if (ballCnt == 4) {
                        hitCnt++;
                        isHit = true;
                    }

                    // 안타 or 아웃이면 타자변경
                    if (isHit) {
                        hitCntArr[playerIndex]++; // 선수의 안타수 증가
                        break;
                    }

                    System.out.println();
                }

                playerIndex++; // 다음 선수를 위해 값 증가

                // 9명의 선수가 다 출루했으면 초기화
                if (playerIndex == playerArr.length) {
                    playerIndex = 0;
                }

                // 아웃 3번이 되면 반복문 종료
                if (outCnt == 3) {
                    System.out.printf("===%d회차를 종료합니다===\n", i);
                    break;
                }
            }
        }
        System.out.println("===게임을 종료합니다===");
}
}