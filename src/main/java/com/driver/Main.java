package com.driver;

public class Main {
    public static class A{
        public String meth(){
            return "Invoking method from class A";
        }
    }

    public static class B extends A{
        @Override
        public String meth(){
            return "Method is overridden in Extendend class B";
        }
    }
    public static void main(String[] args) {
        // B b=new A() --> child cannot hold parent object
        //here we have to call meth of A
        B b=new B();
        b.meth();
    }
  
}