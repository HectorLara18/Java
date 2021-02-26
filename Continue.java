public class Continue {
    public static void main(String[] args) {
        int x;
        for (x = 0; x <=40;x = x + 10){
            if(x == 30){
                continue;
            }
            System.out.println(x);
        }
    }
}
