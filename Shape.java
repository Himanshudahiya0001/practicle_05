class Shape {
    void display() {
        System.out.println("This is shape");
    }
}


class Rectangle extends Shape {
    void display() {
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape {
    void display() {
        System.out.println("This is circular shape");
    }
}
class Square extends Rectangle {
    void show() {
        System.out.println("Square is a rectangle");
    }
}
public class CircleMain{
    public static void main(String[] args) {
       System.out.print("Himanshu Saini 24csu350");
        Square sq = new Square();

       
        new Shape().display();

        new Rectangle().display();

        
        sq.show();
    }
}