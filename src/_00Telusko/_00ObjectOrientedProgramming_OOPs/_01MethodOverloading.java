package _00Telusko._00ObjectOrientedProgramming_OOPs;
/*
Method Overloading : In java, it is possible to define two or more methods within
                     the same class that share the same name, as long as their parameter
                     declaration are different. When this is the case, the methods
                     are said to be overloaded, and the process is referred to as
                     method overloading.

Constructor Overloading : Constructor overloading is a methodology where one class has
                         more than one constructor but their parameter declarations are
                         different.
class Box{
    double width,height,depth;
    Box(){
        width = 10;
        height = 12;
        depth = 15;
    }
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}
*/

//Different Number of parameters
class Example1 {

    void display(int a) {
        System.out.println("One parameter: " + a);
    }

    void display(int a, int b) {
        System.out.println("Two parameters: " + a + ", " + b);
    }
}
//Different Type of Parameters
class Example2 {
    void show(int a) {
        System.out.println("Integer: " + a);
    }

    void show(String s) {
        System.out.println("String: " + s);
    }
}
//Different Order of Parameters
class Example3 {
    void print(int a, String b) {
        System.out.println("int, String: " + a + ", " + b);
    }

    void print(String b, int a) {
        System.out.println("String, int: " + b + ", " + a);
    }
}

public class _01MethodOverloading {
    public static void main(String[] args) {
        Example1 e1 = new Example1();
        e1.display(10);
        e1.display(10, 20);

        Example2 e2 = new Example2();
        e2.show(100);
        e2.show("Arka");

        Example3 e3 = new Example3();
        e3.print(10, "Java");
        e3.print("Hello", 20);

    }
}
