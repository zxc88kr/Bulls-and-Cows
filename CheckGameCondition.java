public class CheckGameCondition {
    void checkGameCondition(int bullsCount, int cowsCount, int inputCount) {
        if (bullsCount == 4) {
            System.out.println("정답입니다! 총 입력한 횟수: " + inputCount);
        } else if (inputCount <= 9) {
            System.out.println("정답이 아닙니다! Bulls: " + bullsCount + ", Cows: " + cowsCount);
        } else {
            System.out.println("다음 기회에... Bulls: " + bullsCount + ", Cows: " + cowsCount);
        }
    }
}
