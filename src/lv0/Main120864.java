package lv0;

public class Main120864 {
  public static int solution(String my_string) {
    int answer = 0;
    
    String[] srr = (my_string+"A").split("");
    Boolean isNum = false;
    String num = "";
    for (String s : srr) {
      if (s.matches("[0-9]") == true) {
        num += s;
      }else {
        if (!num.equals("")) {
          answer+=Integer.parseInt(num);
          num="";
        }
      }
      isNum = s.matches("[0-9]");
    }
    
    return answer;
}
  
  public static void main(String[] args) {
    // 숫자에 해당하는 수를 더한 값 구하기
    System.out.println("result:"+solution("aAb1B2cC34oOp")+"\tanswer:37");
    System.out.println("result:"+solution("1a2b3c4d123Z")+"\tanswer:133");
    System.out.println("result:"+solution("jkajbbcsddZ")+"\tanswer:0");
    System.out.println("result:"+solution("zzz111")+"\tanswer:111");
  }
}
