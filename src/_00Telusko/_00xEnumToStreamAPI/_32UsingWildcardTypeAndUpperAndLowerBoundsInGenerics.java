package _00Telusko._00xEnumToStreamAPI;

import java.util.ArrayList;
import java.util.List;

class Human{
    public void sleep(){ System.out.println("Human needs to sleep well"); }
}

class Employee1 extends Human {
    public void sleep(){
        System.out.println("Employee needs to sleep well to stay productive");
    }
}

public class _32UsingWildcardTypeAndUpperAndLowerBoundsInGenerics {
    public static void main(String[] args) {
//        Human human = new Human();
//        Employee1 emp = new Employee1();
//        human = emp;

//        ArrayList<Human> humanList = new ArrayList<>();
//        ArrayList<Employee1> emplist = new ArrayList<>();
//        //humanList = emplist; doesn't work
//        ArrayList<Human> humanList2 = new ArrayList<>();
//        humanList = humanList2;//works

            //? <- wildcard (unknown reference data type)
//        ArrayList<?> humanList = new ArrayList<>();
//        ArrayList<Employee1> emplist = new ArrayList<>();
//        humanList = emplist; // works
//        ArrayList<Human> humanList2 = new ArrayList<>();
//        humanList = humanList2;//works

         //upperbound in generics
//        ArrayList<? extends Human> humanList = new ArrayList<>();   //upperbound
//        ArrayList<Employee1> emplist = new ArrayList<>();
//        ArrayList<String> stringList = new ArrayList<>();
//        ArrayList<Object> objectList = new ArrayList<>();
//        ArrayList<Human> humanList2 = new ArrayList<>();
//        humanList = emplist; // works
//        humanList = humanList2;//works
//        //humanList = stringList;//doesn't work
//        //humanList = objectList;//doesn't work

        Human human = new Human();
        Human human2 = new Human();
        Employee1 emp = new Employee1();
        Employee1 emp2 = new Employee1();

        //lower bound in generics
        ArrayList<? super Human> humanList = new ArrayList<>();//lower bound
        ArrayList<Employee1> emplist = new ArrayList<>();
        emplist.add(emp);
        emplist.add(emp2);

        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Object> objectList = new ArrayList<>();
        ArrayList<Human> humanList2 = new ArrayList<>();
        humanList2.add(human);
        humanList2.add(human2);

        invokeSleep(humanList2);
        invokeSleep(emplist);

//        //humanList = emplist;//doesn't work
//        humanList = humanList2;//works
//        //humanList = stringList;//doesn't work
//        humanList = objectList;//works

    }

        //collection having either Human or its subclass objects can be passed
    public static void invokeSleep(List<? extends Human> list) {
        for (Human human : list) {
            human.sleep();
        }
    }
}
