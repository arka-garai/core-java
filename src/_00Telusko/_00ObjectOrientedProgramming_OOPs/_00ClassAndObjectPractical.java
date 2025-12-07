package _00Telusko._00ObjectOrientedProgramming_OOPs;
/*What is OOP?
Ans: OOP is a programming methodology that helps to organize complex programs through
encapsulation, polymorphism and inheritance.
*/
//A class in Java is a user-defined data type that acts as a blueprint for creating objects.
//An object in Java is a runtime instance of a class.

/******** Class and Object ******/

/*class ClassName{
	type instanceVariable1;
    type instanceVariable2;
	//.....
	type instanceVariableN;

    type methodName1(parameter_list){
	// body of the method
	}
	type methodName2(parameter_list){
	// body of the method
	}
	//......
	type methodNameN(parameter_list){
	// body of the method
	}
}*/

class Calculator{//(parent / base / super )class
    // Instance variables (a.k.a. data members / attributes / properties)
    final int MAX_VALUE = Integer.MAX_VALUE;
    final int MIN_VALUE = Integer.MIN_VALUE;

    //method / behaviour
    public int add(int a, int b){
        return a+b;
    }

}
public class _00ClassAndObjectPractical {
    public static void main(String[] args)
    /*String[] args here takes all the command line arguments.
    Command line arguments are the argument values which we
    pass from the command prompt at the execution time.
    */
    {
        //instantiation = Means allocating memory for a new object using the new keyword.
        //object creation  = Declaration +  Instantiation + Initialization (constructor call)
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);
        System.out.println(result);
        /*
        println() and print() both are the methods of PrintStream class.

        in, out and err are three stream variables. These three variables are present in the System class.

        To access the out variable of the System class: System.out (as out variable is declared public and static).
        System class is actually present in the java.lang package, which is the default package of Java.

        System.out behaves as an object of the PrintStream class.
        So to access println() we will do: System.out.println().
        */
    }
}
