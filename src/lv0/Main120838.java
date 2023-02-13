package lv0;

import java.util.*;

public class Main120838 {
  public static String solution(String letter) {
    String answer = "";
    
    HashMap<String, String> hm = new HashMap<String, String>();
    hm.put(".-", "a");    hm.put("-...", "b");    hm.put("-.-.", "c");
    hm.put("-..", "d");    hm.put(".", "e");    hm.put("..-.", "f");
    hm.put("--.", "g");    hm.put("....", "h");    hm.put("..", "i");
    hm.put(".---", "j");    hm.put("-.-", "k");    hm.put(".-..", "l");
    hm.put("--", "m");    hm.put("-.", "n");    hm.put("---", "o");
    hm.put(".--.", "p");    hm.put("--.-", "q");    hm.put(".-.", "r");
    hm.put("...", "s");    hm.put("-", "t");    hm.put("..-", "u");
    hm.put("...-", "v");    hm.put(".--", "w");    hm.put("-..-", "x");
    hm.put("-.--", "y");    hm.put("--..", "z");
    
    String[] letters = letter.split(" ");
    for (String l : letters) {
      answer += hm.get(l);
    }
    
    return answer;
  }
  public static void main(String[] args) {
    //모스부호를 이용한 편지
    System.out.println("result:"+solution(".... . .-.. .-.. ---")+"\tanswer:hello");
    System.out.println("result:"+solution(".--. -.-- - .... --- -.")+"\tanswer:python");
  }
}
