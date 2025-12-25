package com.arka._00eEnumsAndExceptions;
/*
✅ try (short definition)
The try block contains code that may cause an exception. It is used to wrap risky statements.

✅ catch (short definition)
The catch block handles the exception thrown by the try block. It specifies what to do when an exception occurs.

✅ finally (short definition)
The finally block contains the section of code that must execute before a method exits,
regardless of what happens inside the try or catch blocks.
A finally block executes:
whether an exception is handled or not
whether a return statement is present or not
whether the method exits normally or abruptly
The finally block must always be associated with either a try block or a try–catch block.
It cannot exist alone without a try.

✅ throw (short definition)
The throw keyword is used to manually throw an exception inside a method.
Example:
throw new ArithmeticException();

✅ throws (short definition)
The throws keyword is used in a method declaration to declare that the method may throw certain exceptions,
shifting the responsibility to the caller.
Example:
void myMethod() throws IOException
*/
public class _08MultipleCatchBlocksDemo {
    public static void main(String[] args) {
        int i=2;
        int j=0;
        int[] nums = new int[5];
        String str = null;
        try{
            //critical statements
            j = 18/i;
            System.out.println(str.length());
            System.out.println(nums[0]);
            System.out.println(nums[5]);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero !");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limit !");
        } catch (NullPointerException | ClassCastException e){
            System.out.println("...");
        }
        catch (Exception e){ //parent class at the end
            System.out.println("Something went wrong !"+ e);
        }
        System.out.println(j);
        System.out.println("bye idc");
    }
}
