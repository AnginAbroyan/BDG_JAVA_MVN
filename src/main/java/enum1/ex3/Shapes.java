package enum1.ex3;


//EX. 3
public enum Shapes {
    CIRCLE {
        private double radius;

        @Override
        public double area(double... sides) {
            if(sides[0] <=0){
                System.out.println("The radius should be greater then 0.");
            }
            if(sides.length != 1){
                System.out.println("Only radius needed.");
            }
            this.radius = sides[0];
            return Math.PI * Math.pow(radius, 2);
        }
    },



    SQUARE {
        private double side;

        @Override
        public double area(double... sides) {
            if(sides[0] <=0){
                System.out.println("The radius should be greater then 0.");
            }
            if(sides.length != 1){
                System.out.println("Only one side needed.");
            }
            this.side = sides[0];
            return Math.pow(side, 2);
        }
    },



    TRIANGLE {
        private double base;
        private double height;

        @Override
        public double area(double... sides) {
            if(sides[0] <=0){
                System.out.println("The radius should be greater then 0.");
            }
            if(sides.length != 2){
                System.out.println("Only base and height needed.");
            }
            this.base = sides[0];
            this.height = sides[1];
            return 1/2*base*height;
        }
    },



    RECTANGLE{
        private double length;
        private double width;

        @Override
        public double area(double... sides) {
            if(sides[0] <=0){
                System.out.println("The radius should be greater then 0.");

            }
            if(sides.length != 2){
                System.out.println("Base and height needed.");
            }
            this.length = sides[0];
            this.width = sides[1];
            return length*width;
        }

    };

    /**
     * An abstract method implemented in Enum values, which calculates the area of given shape.
     * @param sides, the required arg which is needed to calculate the area.
     * @returns the area
     */

    public abstract double area(double... sides);

}
