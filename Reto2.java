import java.util.Scanner;

public class Reto2
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		
		//your code goes here
		int myLeng = arr.length;
		for(int x =0; x < myLeng; x++){
			int y = myLeng -x - 1;
			System.out.println(arr[y]);
		}

		System.out.println(scanner);
		System.out.println(text);
		System.out.println(arr);
	}

}
