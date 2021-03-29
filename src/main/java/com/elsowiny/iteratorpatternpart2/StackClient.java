
package com.elsowiny.iteratorpatternpart2;

/**
 *
 * @author elsow
 */
public class StackClient {
   Stack stack1;
   Stack stack2;
   
   public StackClient(Stack stack_1, Stack stack_2){
        stack1 = stack_1;
        stack2 = stack_2;
   }
   

    public void printStack(){
        Iterator stackIterator1 = stack1.createIterator();
        Iterator stackIterator2 = stack2.createIterator();
        System.out.println("Stack 1 contains");
        printStack(stackIterator1);

        System.out.println();
        System.out.println("Stack 2 contains");

        System.out.println();
        printStack(stackIterator2);
    }
    
    private static void printStack(Iterator iterator){
        while(iterator.hasNext()){
            Object obj = (Object)iterator.next();
            System.out.println(String.valueOf(obj));
       
        }
    }
    
}
