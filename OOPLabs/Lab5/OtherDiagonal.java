  import java.util.Scanner;

  class OtherDiagonal
  {
    public static void main(String[] args)
    {
      Scanner s = new Scanner(System.in);
      System.out.print("Size of the square: ");
      int n = s.nextInt();
      
      String line;
     
      int diagonal = n - 1;
      for (int i = 0; i < n; i++)
      {
        line = "";

        for (int j = 0; j < n; j++)
          if (diagonal == j)
          {
            line += "x";
          }
          else
          {
            line += "o";
          }
        System.out.println(line);
        diagonal--;
      }
    }
  }