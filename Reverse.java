import java.util.*;
class Reverse{
	public static int printReverse(int num){
		int reverse=0;
		while(num!=0){
			reverse*=10;
			reverse+=num%10;
			num/=10;
		}
		return reverse;
	}
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input Integer Number : ");
		int num=input.nextInt();
		int reverse;
		reverse=printReverse(num);
		System.out.println(reverse);
	}
}
