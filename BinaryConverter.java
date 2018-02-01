import java.util.Scanner;
public class BinaryConverter {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.print("What is your number?");
		int deciNum=in.nextInt();
		if (deciNum>1024)System.out.print("System Overload. Please choose a smaller number");
		else for (int i=9; i>=0; i--){
			if (deciNum<Math.pow(2,i))  System.out.print(("0"));
			else{
				deciNum=(int) (deciNum-Math.pow(2,i));
				System.out.print("1");
			}
		}
		}
	}

