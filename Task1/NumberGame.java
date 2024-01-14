import java.util.*;
public class NumberGame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch;
		do {
			System.out.println("Let's Start a NUMBER GAME!!!");
			System.out.println("Welcome to NUMBER GAME...");
		    int n=1+(int)(100 * Math.random());
		    int t_attempts=3,i;
		    int r_attempts=0,rounds=0;
		    for(i=0;i<t_attempts;i++) {
		    	System.out.println("Enter your guessed number:");
		    	int guess_no=sc.nextInt();
		    	
		    	if(n==guess_no) {
		    		System.out.println("Correct guess!!! Congratulations!!!");
		    		r_attempts=+t_attempts-(t_attempts-(rounds+1));
		    		break;
		    	}
		    	else if(n<guess_no && i!=t_attempts-1) {
		    		System.out.println("Wrong guess!!! Number is smaller");
		    	}
		    	else if(n>guess_no && i!=t_attempts-1) {
		    		System.out.println("Wrong guess!!! Number is greater");
		    	}
		    }
		    if(i==t_attempts) {
		    	System.out.println("Out of attempts!!!");
		    	System.out.println("Correct number is:"+n);
		    }
		    System.out.println("Wanna play again?...Press 1->");
		    ch=sc.nextInt();
		}while(ch==1);
		System.out.println("Thank you!!!");
	}
}
