package com.motivity.classdesign.staticAndDefault.bank;

public class Main {
    public static void main(String[] args) {
          Rbi sbicust=new Sbi();
          sbicust.deposite();
          sbicust.withdraw();
          sbicust.linkAdhaar();
          Rbi.safety();
          Rbi axiscust=new Axis();
          axiscust.withdraw();
          axiscust.deposite();
    }

}
