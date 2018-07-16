
public class Example {
    public static void main (String[] args) {
        int[][] multi = new int[][]{
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
            { 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
            { 1, 0, 1, 1, 1, 1, 1, 1, 0, 1 },
            { 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }
          };
          
          for (int[] x : multi) {
              for (int y : x) {
                 System.out.print(y + " ");
              }
          System.out.println();
          }
        }
    }