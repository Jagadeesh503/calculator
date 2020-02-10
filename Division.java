package calculator;

public class Division {
  public void div(int a,int b) {
	  if(b==0) {
		  System.out.println("Zero Division Error");
	  }
	  else {
		  System.out.println("Division of "+a+" and "+b+" is "+a/b);
	  }
  }
}
