package pro21oop;

public class Point1 {
    // Atribuição na criação
    int x = 10;
    int y;

    public static void main(String[] args) {
        Point1 p = new Point1();
        // Atribuição pelos atributos
        p.y = 4;
        int pontoY = p.y;
        System.out.println("Ponto X -> " + p.x);

    }
}
