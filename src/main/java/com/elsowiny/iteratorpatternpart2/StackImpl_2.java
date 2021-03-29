/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elsowiny.iteratorpatternpart2;
import java.util.*;
/**
 *
 * @author elsow
 */
public class StackImpl_2 implements Stack {
    
    Vector<Object> stack = new Vector<Object>();
    
    @Override
    public Object pop() {
        
        if(stack.size() - 1 == 0){
            return "Error Stack is empty";
        }
        
        int lastIndex;
        lastIndex = stack.size() - 1;
        
        //keep reference to the last item to be returned
        Object lastItem = stack.get(lastIndex);
        
        //remove it via index
        stack.remove(lastIndex);
        
        System.out.println("removed item from stack");
        return lastItem;
    }

    @Override
    public void push(Object item) {
        stack.add(item);
        System.out.println("added item to stack");
    }
    
    @Override
    public void clear(){
        stack.clear();
        System.out.println("Cleared items..");
    }

    @Override
    public int getSize(){
        return stack.size();
    }
    
    @Override
    public Object get(int i){
        return stack.get(i);
    }
 
    @Override
    public Iterator createIterator(){
        return new StackIterator2(stack); 
    }
}
