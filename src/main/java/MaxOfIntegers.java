public class MaxOfIntegers {
    public static int maximoDeTres(int num1, int num2, int num3){
        if(num1>10 || num2>10 || num3>10) throw new IllegalArgumentException("Uno de los numeros es mayor a 10");
        int max = num1;
        if(num2 > max ) max = num2;
        if(num3 > max) max = num3;
        return max;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Máximo de (1, 2, 3): " + maximoDeTres(1, 2, 3));
            System.out.println("Máximo de (5, 10, 5): " + maximoDeTres(5, 10, 5));
            System.out.println("Máximo de (7, 7, 7): " + maximoDeTres(7, 7, 7));
            System.out.println("Máximo de (-1, -2, -3): " + maximoDeTres(-1, -2, -3));
            System.out.println("Máximo de (11, 2, 3): " + maximoDeTres(11, 2, 3));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
