package lv0;

import java.util.*;
import java.util.Map.Entry;

public class Main120890 {
  public static int solution(int[] array,int n) {
    HashMap<Integer,Integer> hm = new HashMap<>();
    for (Integer i : array) {
      hm.put(i, Math.abs(i-n));
    }
    List<Entry<Integer,Integer>> list_entry = new ArrayList<Entry<Integer,Integer>>(hm.entrySet());
    Collections.sort(list_entry, new Comparator<Entry<Integer, Integer>>() {
      public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
        return obj1.getValue().compareTo(obj2.getValue());
      }
    });
    return list_entry.get(0).getKey();
  }
  public static void main(String[] args) {
    //array에 들어있는 정수 중 n과 가장 가까운 수
    System.out.println("result:"+solution(new int[] {10, 3, 28},20)+"\tanswer:28");
    System.out.println("result:"+solution(new int[] {10, 11, 12},13)+"\tanswer:12");
  }
}
