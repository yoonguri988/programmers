package lv0;

public class Main120843 {
  public static int solution(int[] numbers, int k) {
    int answer = 0;
    
    int o = 0;
    for (int i = 0; i < k; i++) {
      answer = numbers[o];
      if (o+2 == numbers.length) {
        o = numbers.length-(o+2);
      }else if (o+2 > numbers.length) {
        o = numbers.length-o;
      }else {
        o += 2;
      }
    }
    return answer;
}
  public static void main(String[] args) {
    // k번째 공을 던질 선수구하기
    System.out.println("result:"+solution(new int[] {1, 2, 3, 4}, 2)+"\tanswer:3");
    System.out.println("result:"+solution(new int[] {1, 2, 3, 4, 5, 6}, 5)+"\tanswer:3");
    System.out.println("result:"+solution(new int[] {1, 2, 3}, 3)+"\tanswer:2");
  }

}
