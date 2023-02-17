package lv0;

import java.util.Arrays;

public class Main120883 {
  public static String solution(String[] id_pw, String[][] db) {
    String answer = "fail";
    
    int i = 0;
    for (String[] user : db) {
      i = Arrays.mismatch(id_pw, user);
      if (i != 0) {
        answer = i==-1?"login":"wrong pw";
        break;
      }
    }
    
    return answer;
  }

  public static void main(String[] args) {
    // 직사각형의 넓이를 return
    System.out.println("result:" + solution(new String[] {"meosseugi","1234"}, new String[][] {{"meosseugi", "1234"},{"yyoom", "1234"}}) + "\tanswer:login");
    System.out.println("result:" + solution(new String[] {"meosseugi","1234"}, new String[][] {{"meosseugi", "5678"},{"yyoom", "1234"}}) + "\tanswer:wrong pw");
    System.out.println("result:" + solution(new String[] {"rabbit04","98761"}, new String[][] {{"jaja11", "98761"},{"rabbit00", "111333"}}) + "\tanswer:fail");
  }
}
