/******************************************************************************
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int num = (int)(Math.random()*100);
		int n;
		System.out.println("Hey!!!!");
		System.out.println("Guess the number Between 1 to 100: ");
	do{
		
		Scanner s = new Scanner(System.in);
         n= s.nextInt();
		if(n>num)
		{
		    System.out.println("Okay!! Please guess the smaller number: ");
		}
		else if(n<num)
		{
		     System.out.println("Okay!! Please guess the larger number: ");
		}
		else{
		    System.out.println("Hurrah!! you guessed it right!!");
		    break;
		}
		
	}while(n>=0);
	System.out.print("My number was: ");
	System.out.println(num);
}
};