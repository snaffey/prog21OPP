package pro21oop;

public class Point {
    int x;
    int y;

    public static void main(String[] args) {
        Point p = new Point();
        // Atribuição pelos atributos
        p.x = 1;
        p.y = 4;
        int pontoY = p.y;
        System.out.println("Ponto Y -> " + pontoY);

    }
}
