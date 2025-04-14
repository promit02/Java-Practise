abstract class Shape {
    abstract double area();
    abstract void display();
}

class Rectangle extends Shape {
    private double len, wid;

    public Rectangle(double len, double wid) {
        this.len = len;
        this.wid = wid;
    }

    double area() {
        return len * wid;
    }

    void display() {
        System.out.println("Area of the rectangle is: " + area());
    }
}

class Circle extends Shape {
    private double rad;

    public Circle(double rad) {
        this.rad = rad;
    }

    double area() {
        return 3.14 * rad * rad;
    }

    void display() {
        System.out.println("Area of the circle is: " + area());
    }
}

class Triangle extends Shape {
    private double h, b;

    public Triangle(double h, double b) {
        this.h = h;
        this.b = b;
    }

    double area() {
        return 0.5 * h * b;
    }

    void display() {
        System.out.println("Area of the triangle is: " + area());
    }
}

class Main {
    public static void main(String args[]) {
        Rectangle obj1 = new Rectangle(5, 4);
        Circle obj2 = new Circle(7);
        Triangle obj3 = new Triangle(6, 8);

        obj1.display();
        obj2.display();
        obj3.display();
    }
}
