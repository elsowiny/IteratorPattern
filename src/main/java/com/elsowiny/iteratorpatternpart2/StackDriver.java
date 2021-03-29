/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elsowiny.iteratorpatternpart2;


/**
 *
 * @author elsow
 */
public class StackDriver {
    
     public static void main(String args[]){
    
         
         
    StackImpl_1 myStack = new StackImpl_1();
    StackImpl_2 myStack2 = new StackImpl_2();
    //obj creation
    String myString = "1Sherief";
    int num1 = 2;
    int num2 = 3;
    
    myStack.push(myString);
    myStack.push(num1);
    myStack.push(num2);
    myStack.push(4);
    myStack.push(5);

    int size = myStack.getSize();
    System.out.println("size of the stack impl1 1 is " + size);
   
    
  
    myStack2.push(myString);
    myStack2.push(num1);
    myStack2.push(num2);
    myStack2.push(myString);
    myStack2.push(myString);
 
    int sizeStack2 = myStack2.getSize();
    System.out.println("size of the stack impl1 2 is " + sizeStack2);
  
   
    
   
   StackClient client = new StackClient(myStack, myStack2);
   System.out.println("Printing Stacks ");
   client.printStack();
   

   
    
    }
    
  

     
}
