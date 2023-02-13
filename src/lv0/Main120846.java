package lv0;

public class Main120846 {
  public static int solution(int n) {
    int answer = 0;
    if(n < 4) return 0;
    for(int i = 4; i <= n; i++) {
      for(int j = 2; j <= Math.sqrt(i); j++ ) {
        if(i%j==0) {
          answer += 1;
          break;
        }
      }
    }
    return answer;
  }
  
  public static void main(String[] args) {
    // 약수의 개수가 세 개 이상인 수를 합성수
    // 해당하는 수의 합성수의 갯수 구하기
    System.out.println("result:"+solution(10)+"\tanswer:5");
    System.out.println("result:"+solution(15)+"\tanswer:8");
  }
}
