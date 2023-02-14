package lv0;

import java.util.ArrayList;
import java.util.List;

public class Main120852 {
  public static int[] solution(int n) {
    int[] answer = {};
    boolean arr[] = new boolean[n+1];
    
    arr[0]= true;
    arr[1]= true;
    
    for (int i = 2; i < arr.length; i++) {
      if (arr[i]) continue;
      for (int j = i*2; j <= n; j+=i) {
        arr[j] = true;
      }
    }
    

    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      if (!arr[i]) {
        if (n%i == 0) {
          list.add(i);
          n /= i;
        }
        if (n == 1) break;
      }
    }
    
    answer = list.stream().mapToInt(x->x).toArray();
    
    return answer;
}
  public static void main(String[] args) {
    // 소인수분해
    System.out.println("result:"+solution(12)+"\tanswer:[2, 3]");
    System.out.println("result:"+solution(17)+"\tanswer:[17]");
//    System.out.println("result:"+solution(420)+"\tanswer:[2,3,5,7]");
  }
}
