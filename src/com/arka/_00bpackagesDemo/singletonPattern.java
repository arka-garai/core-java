package com.arka._00bpackagesDemo;

class School{
    private static School instance;
    private School(){

    }
    //will create only one object
    public static School getInstance(){
        if(instance == null){
            instance =  new School();
        }
        return instance;
    }
}

public class singletonPattern {
    public static void main(String[] args) {
        School.getInstance();
        School.getInstance();
        School.getInstance();
        School.getInstance();
        School.getInstance();
        School.getInstance();
        School.getInstance();
        School.getInstance();
    }
}
