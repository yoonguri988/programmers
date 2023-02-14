package lv0;

public class Main120894 {
  public static long solution(String numbers) {
    String[] enNum = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    for (int i = 0; i < enNum.length; i++) {
      numbers = numbers.replaceAll(enNum[i], String.valueOf(i));
    }
    return Long.parseLong(numbers);
  }

  public static void main(String[] args) {
    // 영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수
    System.out.println("result:" + solution("onetwothreefourfivesixseveneightnine") + "\tanswer:123456789");
    System.out.println("result:" + solution("onefourzerosixseven") + "\tanswer:14067");
  }
}
