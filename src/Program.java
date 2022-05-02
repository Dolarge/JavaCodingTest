import CodingTest.Level2.DiamonSquard;

import java.util.Scanner;

public class Program {

    public  static void  main(String[] args)
    {
        DiamonSquard diamonSquard = new DiamonSquard();
        Scanner sc =new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        System.out.println(diamonSquard.GetNumber(n));
    }
}
