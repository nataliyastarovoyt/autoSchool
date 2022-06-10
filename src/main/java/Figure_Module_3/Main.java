package Figure_Module_3;

public class Main {

    public static void main(String[] args) {

        Square square = new Square(7);
        Triangle triangle = new Triangle(2.6, 4.0, 3.0);
        Circle circle = new Circle(3.2);

        FigureList list = new FigureList();

        list.add(square);
        list.add(circle);
        list.add(triangle);

        list.printSquare();//sort shapes by area

        System.out.println(square.getName() + ", S = " + square.getArea());
        System.out.println(circle.getName() + ", S = " + circle.getArea());
        System.out.println(triangle.getName() + ", S = " + triangle.getArea());

        //list.sortSquare();
    }
}

