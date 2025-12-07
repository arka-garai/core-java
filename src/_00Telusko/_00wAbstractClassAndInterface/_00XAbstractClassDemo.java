package _00Telusko._00wAbstractClassAndInterface;
abstract class Figure{
    double dim1;
    double dim2;

    Figure(double a, double b)
    {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();

}

class Rectangle extends Figure{

    Rectangle(double a, double b)
    {
        super(a,b);
    }

    double area(){
        System.out.println("Inside Area for Rectangle.");
        return (dim1 * dim2);
    }
}

class Triangle extends Figure{

    Triangle(double a, double b)
    {
        super(a,b);
    }

    double area(){
        System.out.println("Inside Area for Triangle.");
        return (dim1 * dim2 / 2);
    }
}

public class _00XAbstractClassDemo {
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle(9,6);
        Triangle t = new Triangle(8,5);

        Figure figref;

        figref = r;
        System.out.println("Area is " + figref.area());

        figref = t;
        System.out.println("Area is " + figref.area());

    }
}

