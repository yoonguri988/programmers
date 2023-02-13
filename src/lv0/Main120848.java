package lv0;

public class Main120848 {
  public static int solution(int n) {
    int answer = 1;
    int pac = 1;
    if(n == 1) return n;
    while(n > pac) {
      pac *= ++answer;
      if (pac > n) answer--;
    }
    return answer;
  }
  public static void main(String[] args) {
    //팩토리얼
    System.out.println("result:"+solution(3628800)+"\tanswer:10");
    System.out.println("result:"+solution(7)+"\tanswer:3");
  }
}
