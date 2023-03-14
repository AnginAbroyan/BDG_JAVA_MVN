package classes_and_objects.rectangle;

public class Rectangle {
    int height;
    int width;

    public Rectangle(){

    }

    int calculateArea(int height, int width){
        int areaRec = height * width;
        return areaRec;
    }
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        System.out.println(r1.calculateArea(5,14));
    }
}
