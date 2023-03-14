package inherance_abstract_association.abstract_class_and_interface.ex4;

//4.
public class ArithmeticClass implements Test {
    int squareNum = 1;
    @Override
    public int square(int x) {
        squareNum = x * x;
        return squareNum;
    }
}
