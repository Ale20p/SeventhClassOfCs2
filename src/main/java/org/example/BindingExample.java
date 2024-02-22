package org.example;

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing a square");
    }
}

public class BindingExample {
    public static void main(String[] args) {
        // static binding
        Shape staticShape = new Circle(); // upcasting
        staticShape.draw(); // static binding, calls draw() method of Circle class
        // Dynamic Binding
        Shape dynamicShape = getRandomShape(); // Dynamic binding
        dynamicShape.draw(); // Dynamic binding, calls draw() method based on the actual object type
    }

    static Shape getRandomShape() {
        if (Math.random() < 0.5) {
            return new Circle();
        } else {
            return new Square();
        }
    }
}
