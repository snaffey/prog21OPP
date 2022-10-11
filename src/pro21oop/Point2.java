package pro21oop;

public class Point2 {
    int x;
    int y;

    /* Construtores por omissão */
    public Point2() {
        this.x = 0;
        this.y = 0;
    }

    /* Construtores por atribuição */
    public Point2(int v_x) {
        this.x = v_x;
        this.y = 0;
    }

    public Point2(int v_x, int v_y) {
        this.x = v_x;
        this.y = v_y;
    }

    public static void main(String[] args) {
        Point2 p = new Point2();
        // Atribuição pelos atributos
        System.out.println("Ponto X -> " + p.x);

        Point2 p1 = new Point2(50);
        System.out.println("Ponto X -> " + p1.x);

        Point2 p2 = new Point2(50, 25);
        System.out.println("Ponto X -> " + p2.x);
    }
}
