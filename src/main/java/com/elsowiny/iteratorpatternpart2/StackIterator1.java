/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elsowiny.iteratorpatternpart2;

import java.util.ArrayList;

/**
 *
 * @author elsow
 */
public class StackIterator1 implements Iterator {
   
    ArrayList<Object> stack1;
    int pointer = 0;
    
    public StackIterator1(ArrayList<Object> arrayList){
        
        stack1 = arrayList;
        pointer = stack1.size()-1;
        
       
    }
    
    
    
    
    
    @Override
    public boolean hasNext(){
        return pointer!=-1;
    }; 
    
    @Override
    public Object next(){
       Object obj = stack1.get(pointer);
       pointer = pointer - 1;
       return obj;
    };
    
    @Override
    public void remove(){
        if(pointer != 0){
            stack1.remove(pointer);
            pointer = pointer -1;
        }
        System.out.println("removed obj");
    };
    
    
  
}
