import java.util.Scanner;
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
class Vehicle {
    void display() {
        System.out.println("This is a Vehicle");
    }
}

class Car extends Vehicle {
    void display() {
        System.out.println("This is a Car");
    }
}

class Bike extends Vehicle {
    void display() {
        System.out.println("This is a Bike");
    }
}
class Box {
    private float width, height, depth;

    public Box() {
        width = height = depth = 0;
    }

    
    public Box(float w, float h, float d) {
        width = w;
        height = h;
        depth = d;
    }
    public Box(Box b) {
        this.width = b.width;
        this.height = b.height;
        this.depth = b.depth;
    }

   
    public float getWidth() { return width; }
    public void setWidth(float width) { this.width = width; }

    public float getHeight() { return height; }
    public void setHeight(float height) { this.height = height; }

    public float getDepth() { return depth; }
    public void setDepth(float depth) { this.depth = depth; }
    public void displayVolume() {
        float volume = width * height * depth;
        System.out.println("Volume of Box: " + volume);
    }
}

class BoxWeight extends Box {
    private float weight;
    public BoxWeight() {
        super();
        weight = 0;
    }
    public BoxWeight(float w, float h, float d, float weight) {
        super(w, h, d);
        this.weight = weight;
    }

    
    public BoxWeight(BoxWeight bw) {
        super(bw);
        this.weight = bw.weight;
    }

    
    public float getWeight() { return weight; }
    public void setWeight(float weight) { this.weight = weight; }

    
    public void displayWeight() {
        System.out.println("Weight of Box: " + weight);
    }
}

public class WeightMain {
    public static void main(String[] args) {
    System.out.print("Himanshu Saini 24csu350");
        Scanner sc = new Scanner(System.in);
        

        
        System.out.println("\n--- Program 1: Shape Example ---");
        Square sq = new Square();
        new Shape().display();       
        new Rectangle().display();   
        sq.show();                   

        System.out.println("\n--- Program 2: Vehicle Example ---");
        System.out.print("Enter number of tyres: ");
        int N = sc.nextInt();
        Vehicle v;
        switch (N) {
            case 2:
                v = new Bike();
                break;
            case 4:
                v = new Car();
                break;
            default:
                v = new Vehicle();
                break;
        }
        v.display();
        System.out.println("\n--- Program 3: Box & BoxWeight Example ---");
        BoxWeight bw1 = new BoxWeight();
        bw1.setWidth(2);
        bw1.setHeight(3);
        bw1.setDepth(4);
        bw1.setWeight(10);
        bw1.displayVolume();
        bw1.displayWeight();
        BoxWeight bw2 = new BoxWeight(5, 6, 7, 20);
        bw2.displayVolume();
        bw2.displayWeight();
        BoxWeight bw3 = new BoxWeight(bw2);
        bw3.displayVolume();
        bw3.displayWeight();

        sc.close();
    }
}