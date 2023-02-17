package lv0;

public class Main120861 {
  public static int[] solution(String[] keyinput, int[] board) {
    int[] answer = {0,0};
    int w = board[0]/2;
    int h = board[1]/2;
    
    for (String walk : keyinput) {
      if ("up".equals(walk)) {
        if (answer[1] < h) {
          answer[1]++;
        }
      }else if ("down".equals(walk)) {
        if (answer[1] > -h) {
          answer[1]--;
        }
      }else if ("right".equals(walk)) {
        if (answer[0] < w) {
          answer[0]++;
        }
      }else if ("left".equals(walk)) {
        if (answer[0] > -w) {
          answer[0]--;
        }
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    // up을 누른다면 [0, 1]      // down을 누른다면 [0, -1]
    // left를 누른다면 [-1, 0]   // right를 누른다면 [1, 0]
    // 캐릭터는 항상 [0,0]에서 시작할 때 키 입력이 모두 끝난 뒤에 캐릭터의 좌표 [x, y]를 return
    System.out.println("result:" + solution(new String[] {"left", "right", "up", "right", "right"}, new int[] {11, 11}) + "\tanswer:[2,1]");
    System.out.println("result:" + solution(new String[] {"down", "down", "down", "down", "down"}, new int[] {7, 9}) + "\tanswer:[0,-4]");
  }
}
