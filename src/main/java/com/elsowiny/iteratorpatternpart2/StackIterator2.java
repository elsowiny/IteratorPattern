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
public class StackIterator2 implements Iterator{
    
     Vector<Object> stack;
     int pointer = 0;
    
    //from top to bottom
        
    public StackIterator2(Vector<Object> myStack){
        this.stack = myStack;
        pointer = stack.size()-1;
    }
    
    @Override
    public boolean hasNext(){
        return pointer!=-1;
    }; 
    
    @Override
    public Object next(){
       Object obj = stack.get(pointer);
       pointer = pointer - 1;
       return obj;
    };
    
    @Override
    public void remove(){
        if(pointer != 0){
            stack.remove(pointer);
            pointer = pointer -1;
        }
        System.out.println("removed obj");
    };
    
    
    
    
    
    
}
