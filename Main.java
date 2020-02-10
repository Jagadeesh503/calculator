package calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("\nEnter num1:");
     int x=sc.nextInt();
     System.out.println("\nEnter num2:");
     int y=sc.nextInt();
     System.out.println("\n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division\n");
     System.out.print("Enter your choice:");
     int ch=sc.nextInt();
     switch(ch)
     {
     case 1 : Addition a1=new Addition();
              a1.add(x, y);
              break;
     case 2 : Difference s1=new Difference();
     		  s1.diff(x, y);
     		  break;
     case 3 : Multiplication m1=new Multiplication();
     		  m1.mul(x, y);
     		  break;
     case 4 : Division d1=new Division();
     		  d1.div(x, y);
     		  break;
     default : System.out.println("\nEnter choice from above options only\n");
    	       
     }
	}

}
