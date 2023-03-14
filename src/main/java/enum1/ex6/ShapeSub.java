package enum1.ex6;


import static enum1.ex6.ShapeType.*;

//EX 6
public class ShapeSub extends Shape{
    public double length;
    public double width;
    public double side;
    public double radius;

    @Override
    public void setSides(ShapeType type, double... sides) {
        if(type == CIRCLE){this.radius = sides[0];}
        if(type == SQUARE){this.side = sides[0];}
        if(type == RECTANGLE){this.width = sides[1];
            this.length = sides[0];}

    }


    @Override // for circle
    public double getArea(ShapeType type) {
        double area = 0;
        if(type == CIRCLE){
            area= Math.PI * Math.pow(radius,2);
        }
        if(type == SQUARE){
            area = side*side;
        }
        if(type == RECTANGLE){
            area= width * length;
        }
        return area;
    }

    @Override
    public double getPerimeter(ShapeType type) {
        double perimeter = 0;
        if(type == CIRCLE){
            perimeter= Math.PI * 2 * radius;
        }
        if(type == SQUARE){
            perimeter= 4*side;
        }
        if(type == RECTANGLE){
            perimeter= 2*width+ 2*length;
        }
        return perimeter;
    }
}
