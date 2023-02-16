package lv0;

public class Main120902 {
  public static int solution(String my_string) {
    int answer = 0;
    String[] srr = my_string.split(" ");
    
    String y = "";
    for (String s : srr) {
      
      if (s.equals("+")||s.equals("-")) {
        y = s;
        continue;
      }
      
      if (y.equals("+")) {
        answer += Integer.parseInt(s);
      }else if(y.equals("-")) {
        answer -= Integer.parseInt(s);
      }else {
        answer += Integer.parseInt(s);
      }
      
    }
    return answer;
  }

  public static void main(String[] args) {
    // 차례로 숫자를 더하되 "Z"가 나오면 바로 전에 더했던 숫자를 뺀다.
    System.out.println("result:" + solution("3 + 4") + "\tanswer:7");
    System.out.println("result:" + solution("10 - 5 - 7") + "\tanswer:-2");
  }

}
