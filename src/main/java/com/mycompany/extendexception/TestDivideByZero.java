/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.extendexception;
import java.io.IOException;

/**
 *
 * @author Armando
 */
public class TestDivideByZero {
    public static void main (String[] args) {
        try {
            int result = divideInt(10, 5);
            System.out.format("10 divided by 5 is %d%n", result);
            divideInt(10, 0);
            System.out.format("10 divided by 0 is %d%n", result);
        }
        catch (ExcepcionA ex) {
            System.out.println(ex.getMessage());
        }
        try {
            int result = divideIntB(10, 0);
            System.out.format("10 divided by 0 is %d%n", result);
        }
        catch (ExcepcionA ex) {
            System.out.println(ex.getMessage());
        }
        try {
            Object ref = null;
            ref.toString();
        }
        catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }
        try{
            foo();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    static void foo() throws IOException {
        throw new IOException("Esta función arroja un excepción IO");
    }
    public static int divideInt(int i, int j) throws ExcepcionA {
        if(j == 0) {
            throw new ExcepcionA("Divisor cannot be zero");
        }
        return i/j;
    }
    public static int divideIntB(int i, int j) throws ExcepcionB {
        if(j == 0) {
            throw new ExcepcionB("Divisor cannot be zero");
        }
        return i/j;
    }
}
