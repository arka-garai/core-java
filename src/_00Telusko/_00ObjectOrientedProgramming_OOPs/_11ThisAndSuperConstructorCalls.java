package _00Telusko._00ObjectOrientedProgramming_OOPs;
/*
Constructor is a special method which is invoked automatically at the time of object creation.
Constructor : A constructor is a special method used to initialize objects when they are created.
                It has the same name as the class in which it resides and is syntactically similar
                to a method.
                It does not have any return type. (Not even void)
                It performs initialization operation at object creation.

✅ Types of Constructors in Java

1️⃣ Default Constructor (No-Argument Constructor)
A constructor that has no parameters.
If the programmer does NOT write any constructor, Java automatically provides a default constructor.

✔ Characteristics:
No parameters
Initializes objects with default values
Provided automatically if no constructor is defined
✔ Example:
class A {
    A() {         // default constructor
        System.out.println("Default constructor called");
    }
}

2️⃣ Parameterized Constructor
A constructor that takes parameters.
Used to initialize objects with specific values.
✔ Example:
class A {
    int x;
    A(int a) {    // parameterized constructor
        x = a;
    }
}

✅ 1. Definition of this (as a reference variable)
this is a reference variable in Java that refers to the current object of the class.
It is used to access current object’s variables and methods.

✅ 2. Definition of super (as a reference variable)
super is a reference variable in Java that refers to the immediate parent class object.
It is used inside a subclass to access parent class variables and methods.

✅ 3. this() as a Constructor Call — Definition
this() is a constructor call used to invoke another constructor of the same class.
It must be the first statement inside a constructor.

✅ 4. super() as a Constructor Call — Definition
super() is a constructor call used to invoke the parent class constructor.
It must be the first statement inside a subclass constructor.

*/
class Box{
    double width;
    double height;
    double depth;

    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    double volume(){
        return this.width*this.height*this.depth;
    }
}

class A1{
    public A1(){
        System.out.println("in A1");
    }
    public A1(int n){
        System.out.println("in A1 int");
    }
}
class B1 extends A1{
    public B1(){
        super(5);
        System.out.println("in B1");
    }
    public B1(int n){
        this();
        System.out.println("in B1 int");
    }
}
public class _11ThisAndSuperConstructorCalls {
    public static void main(String[] args) {
        B1 o1 = new B1(6);

        Box mybox1 = new Box(10,5,20); // parameterized constructor
        Box mybox2 = new Box(3,5,10);

        double vol = mybox1.volume();
        System.out.println("Volume is : " + vol);

        vol = mybox2.volume();
        System.out.println("Volume is : " + vol);
    }
}
