package inherance_abstract_association.abstract_class_and_interface.ex7;

public class B extends Marks{
    int mark1, mark2, mark3, mark4;

    public B(int mark1, int mark2,int mark3, int mark4){
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
    }
    @Override
    public double getPercentage() {
        return (double)(mark1+mark2+mark3+mark4)/4;
    }
}