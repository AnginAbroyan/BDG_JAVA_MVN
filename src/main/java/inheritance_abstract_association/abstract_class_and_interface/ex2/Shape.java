package inherance_abstract_association.abstract_class_and_interface.ex2;


//2.	Write a program to create a class named Shape which has two abstract
//methods: draw() and erase(). In this class we have three sub classes Circle, Triangle and Square. Each of them has
// override version of methods. Create these using polymorphism concepts.
public abstract class Shape {
    public abstract void draw();

    public abstract void erase();

}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }

    @Override
    public void erase() {
        System.out.println("Erasing the circle. ");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a triangle.");
    }

    @Override
    public void erase() {
        System.out.println("Erasing the triangle. ");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square.");
    }

    @Override
    public void erase() {
        System.out.println("Erasing the Square. ");
    }

}
