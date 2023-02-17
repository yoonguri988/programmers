package lv0;

import java.util.*;
import java.util.stream.Collectors;

public class Main120868 {
  public static int solution(int[] sides) {
    int answer = 0;
    
    List<Integer> list = Arrays.stream(sides).boxed().sorted().collect(Collectors.toList());
    
    //매개변수 중에서 가장 큰값이 큰 변일때
    int z = list.get(1);
    int x = list.get(0); 
    for(int i = 1; i <= z; i++) {
      if (i+x <= z) continue;
      answer++;
    }
    
    //매개변수가 아닌 가장 큰 값이 큰 변일때
    int y = list.get(1);
    while(x+y > z+1) {
      answer++;
      z++;
    }
    
    return answer;
  }

  public static void main(String[] args) {
    // 삼각형의 완성조건
    // 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
    System.out.println("result:" + solution(new int[] {1, 2}) + "\tanswer:1");
    System.out.println("result:" + solution(new int[] {3, 6}) + "\tanswer:5");
    System.out.println("result:" + solution(new int[] {11, 7}) + "\tanswer:13");
  }
}
