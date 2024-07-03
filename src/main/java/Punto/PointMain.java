package Punto;

public class PointMain {
    public static void main(String[] args) {
        PuntoHijoImpl puntoHijo = new PuntoHijoImpl();

        System.out.println(puntoHijo); // Debería imprimir x=1, y=1

        try {
            puntoHijo.setX(10);
        } catch (ModificationNotAllowedException e) {
            System.out.println(e.getMessage());
        }

        try {
            puntoHijo.setY(10);
        } catch (ModificationNotAllowedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(puntoHijo); // Debería seguir siendo x=1, y=1
    }
}
