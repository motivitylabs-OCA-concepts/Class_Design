package com.motivity.classdesign.staticAndDefault.bank;

public interface Rbi
   {
        void deposite();
        void withdraw();

         default void linkAdhaar()//default method and also we can override
            {
            }
            public static void safety()//static method
            {
                System.out.println("we are providing more security");
            }
   }
  class Sbi implements Rbi{
     @Override
       public void deposite() {
         System.out.println("Sbi deposit here");
      }
    @Override
       public void withdraw() {
        System.out.println("Sbi withdraw here");
      }
      public void linkAdhaar()
       {
           System.out.println("linking with adhaar successfully");
       }
  }
  class Axis implements Rbi{
     @Override
       public void deposite() {
        System.out.println("Axis deposit here");
     }
     @Override
       public void withdraw() {
        System.out.println("Axis withdraw here");
     }
 }
