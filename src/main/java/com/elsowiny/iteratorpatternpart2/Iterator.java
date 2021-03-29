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
public interface Iterator {
    
    public boolean hasNext(); 
    
    public Object next();
    
    public void remove();
    
}
