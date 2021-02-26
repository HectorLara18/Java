public class Funciones {
    //las funciones viven al nivel de la clase
    public static double areaCuadrado(int lado1, int lado2) {
        return lado1 * lado2;
    } 

    public static void main(String[] args){
        int x = 12;
        int y = 11;
        double cuadrado1 = areaCuadrado(x, y);
        System.out.println(cuadrado1);
    }
    
}
