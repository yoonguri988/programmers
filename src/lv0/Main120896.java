package lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main120896 {
  public static String solution(String s) {
    String answer = "";
    List<String> srr = Arrays.asList(s.split(""));
    
    HashMap<String, Integer> shm = new HashMap<String, Integer>();
    for (String i : srr) {
      int v = shm.get(i)==null?0:shm.get(i)+1;
      shm.put(i, v);
    }
    
    List<Map.Entry<String, Integer>> list = new ArrayList<>(shm.entrySet());
    Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
      @Override
      public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
        return o1.getKey().compareTo(o2.getKey());
      }});
    
    
    
    for (Map.Entry<String, Integer> entry : list) {
      if (entry.getValue() == 0) {
        answer += entry.getKey();
      }
    }
    
    return answer;
  }

  public static void main(String[] args) {
    // 한번만 등장하는 문자를 사전 순으로 정렬한 문자열
    // 한 번만 등장하는 문자가 없을 경우 빈 문자열
    System.out.println("result:"+solution("abcabcadc")+"\tanswer:d");
    System.out.println("result:"+solution("abdc")+"\tanswer:abcd");
    System.out.println("result:"+solution("hello")+"\tanswer:eho");
    System.out.println("result:"+solution("hheelloo")+"\tanswer:");
  }

}
