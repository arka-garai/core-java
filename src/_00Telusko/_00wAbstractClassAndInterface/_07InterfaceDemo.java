package _00Telusko._00wAbstractClassAndInterface;
/*
✅ Interface:
Interfaces are the template definition, syntactically similar to classes, but they lack instance variables,
and their methods are declared without any body.
Using an interface, we can specify what a class must do, but not how it does it.

General syntax to declare interface:
access interface interface_name{
	return-type method-name1(parameter_list);
	return-type method-name2(parameter_list);
	return-type method-name3(parameter_list);

    type var-name1 = value;
    type var-name2 = value;
    type var-name3 = value;

	...................
    ...................

    return-type method-nameN(parameter_list);
    type var-nameN = value;
}

1) Interface methods are abstract by default.
This means interface methods do not have any body.
Any class that implements the interface must provide the implementation for all the interface methods.

2) Interface variables are by default:
public
static
final
Because they are final, they must be initialized at the time of declaration.

3) Access specifiers of an interface:
An interface can be declared as public or use default (no modifier).
Interface methods are always public and abstract.

4) An interface reference variable can refer to an object of a class
This is allowed only if the class implements that interface.
Example:
InterfaceName ref = new ClassName();

5) A class may implement multiple interfaces
A concrete class must implement all methods, but an abstract class may provide partial implementation.

class - class -> extends
class - interface -> implements
interface - interface -> extends

✅ Implementing Interface (Corrected Version)

Implementing Interface:
General Syntax :
access class class_name [extends super_class] [implements Interface1, Interface2, ...]
{
    // class body
}
Access : either public or no modifier (default)
Key point: Methods inside the class that come from the interface must be declared as public.
*/

interface A6{//design
    int age = 44; //public,final and static by default
    String name = "arka";
    void show();//public abstract by default
    void config();
}
interface Z{
    void cook();
}
interface X{
    void run();
}

interface Y extends X,Z{

}

class B6 implements A6,Y{//implementation

    @Override
    public void show() {
        System.out.println("in show");
    }

    @Override
    public void config() {
        System.out.println("in config");
    }

    @Override
    public void run() {
        System.out.println("in run");
    }

    @Override
    public void cook() {
        System.out.println("in cook");
    }
}

public class _07InterfaceDemo {
    public static void main(String[] args) {
        A6 obj = new B6();
        obj.show();
        obj.config();
        B6 obj1 = (B6) obj;//down casting
        obj1.run();
        ((B6) obj).cook();//down casting
        System.out.println(A6.age);

    }
}

/******* Interfaces Can Be Extended **********/

//interface A{
//    void meth1();
//    void meth2();
//}
//
//interface B extends A{
//    void meth3();
//}
//
//class MyClass implements B{
//    public void meth1(){
//        System.out.println("Implement meth1().");
//    }
//
//    public void meth2(){
//        System.out.println("Implement meth2().");
//    }
//
//    public void meth3(){
//        System.out.println("Implement meth3().");
//    }
//}
//
//class IFExtend{
//    public static void main(String args[])
//    {
//        MyClass ob = new MyClass();
//
//        ob.meth1();
//        ob.meth2();
//        ob.meth3();
//    }
//}