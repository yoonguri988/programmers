package lv0;

import java.util.Arrays;
import java.util.List;

public class Main120853 {
  public static int solution(String s) {
    int answer = 0;
    List<String> slist = Arrays.asList(s.split(" "));
    
    int bfNum = 0;
    for (String num : slist) {
      if (!num.equals("Z")) {
        answer += Integer.parseInt(num);
        bfNum = Integer.parseInt(num);
      }else {
        answer -= bfNum;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    // 차례로 숫자를 더하되 "Z"가 나오면 바로 전에 더했던 숫자를 뺀다.
    System.out.println("result:" + solution("1 2 Z 3") + "\tanswer:4");
    System.out.println("result:" + solution("10 20 30 40") + "\tanswer:100");
    System.out.println("result:" + solution("10 Z 20 Z") + "\tanswer:0");
    System.out.println("result:" + solution("-1 -2 -3 Z") + "\tanswer:-3");
  }

}
