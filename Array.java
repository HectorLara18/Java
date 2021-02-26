public class Array {
    public static void main(String[] args) {
        int[ ] arr = {0,1,2,3,4};
        int[ ] intArr = new int[5];
        int x;
        System.out.println(intArr.length);
        System.out.println(arr.length);
        for (x = 0; x < arr.length; x++){
            System.out.println(arr[x]);
        }

    }
}
