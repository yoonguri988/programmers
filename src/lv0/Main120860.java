package lv0;

public class Main120860 {
  public static int solution(int[][] dots) {
    int answer = 0;
    
    int minX = 0;
    int maxX = 0;
    int minY = 0;
    int maxY = 0;
    
    for (int i = 0; i < dots.length; i++) {
      if (i == 0) {
        minX = maxX = dots[i][0]; 
        minY = maxY = dots[i][1]; 
        continue;
      }
      
      if (minX > dots[i][0]) {
        minX = dots[i][0];
      }
      if (maxX < dots[i][0]) {
        maxX = dots[i][0];
      }
      
      if (minY > dots[i][1]) {
        minY = dots[i][1];
      }
      if (maxY < dots[i][1]) {
        maxY = dots[i][1];
      }
    }
    
    return (maxX-minX) * (maxY-minY);
  }

  public static void main(String[] args) {
    // 직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가 담겨있는 배열 dots가 매개변수
    // 직사각형의 넓이를 return 
    System.out.println("result:" + solution(new int[][] {{1, 1}, {2, 1}, {2, 2}, {1, 2}}) + "\tanswer:1");
    System.out.println("result:" + solution(new int[][] {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}}) + "\tanswer:4");
    
  }
}

