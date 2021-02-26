import java.util.Scanner;

public class Reto {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Escribre tu nombre");
        String text = myScan.nextLine();
        String myName = "HECTOR";
        char[] arr = text.toCharArray();
        char[] arr2 = myName.toCharArray();
        int varLength = arr.length;
        int varMyName = arr2.length;
        for(int x = 0; x < varLength; x++) {
            int y = varLength - x-1;
            System.out.println(arr[y]);
        }
    }

}