public class Break {
    public static void main(String[] args){
        int x = 1;
        while (x >0) {
            System.out.println(x);
            if(x == 5) {
                break;
            }
            x++;
        }
    }
}
