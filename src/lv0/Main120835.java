package lv0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main120835 {
  public static int[] solution(int[] emergency) {
    int len = emergency.length;
    int[] answer = new int[len];
    List<Integer> list = Arrays.stream(emergency).boxed().collect(Collectors.toList());
    Arrays.sort(emergency);
    for (int i : emergency) {
      answer[list.indexOf(i)] = len--;
    }
    return answer;
  }
  public static void main(String[] args) {
    //응급실에 온 환자의 응급도를 기준으로 진료 순서
    System.out.println("result:"+solution(new int[] {3, 76, 24})+"\tanswer:[3, 1, 2]");
    System.out.println("result:"+solution(new int[] {30, 10, 23, 6, 100})+"\tanswer:[2, 4, 3, 5, 1]");
  }
}
