package lv0;

public class Main120869 {
  public static int solution(String[] spell, String[] dic) {
    int answer = 2;
    
    for (int i = 0; i < dic.length; i++) {
      if (dic[i].length() > spell.length || dic[i].length() < spell.length) {
        continue;
      }
      for (int j = 0; j < spell.length; j++) {
        dic[i] = dic[i].replaceFirst(spell[j], "");
      }
    }
    
    for (String d : dic) {
      if (d.equals("")) {
        answer = 1;
        break;
      }
    }
    
    return answer;
  }

  public static void main(String[] args) {
    // 알파벳이 담긴 배열 spell과 외계어 사전 dic이 매개변수
    // spell에 담긴 알파벳을 한번씩만 모두 사용한 단어가 dic에 존재한다면 1, 존재하지 않는다면 2를 return
    System.out.println("result:" + solution(new String[] {"p", "o", "s"}, new String[] {"sod", "eocd", "qixm", "adio", "soo"}) + "\tanswer:2");
    System.out.println("result:" + solution(new String[] {"z", "d", "x"}, new String[] {"def", "dww", "dzx", "loveaw"}) + "\tanswer:1");
    System.out.println("result:" + solution(new String[] {"s", "o", "m", "d"}, new String[] {"moos", "dzx", "smm", "sunmmo", "som"}) + "\tanswer:2");
  }
}
