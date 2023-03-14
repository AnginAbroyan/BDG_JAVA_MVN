package inherance_abstract_association.abstract_class_and_interface.ex7;

public class A extends Marks{
    int mark1, mark2, mark3;

    public A(int mark1, int mark2,int mark3){
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }
    @Override
    public double getPercentage() {
        return (double)(mark1+mark2+mark3)/3;
    }
}
