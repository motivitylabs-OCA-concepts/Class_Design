package com.motivity.classdesign.Inheritence.typsOfInhertence;

class Realme
{
    int productId;
    String productName;
    String brand;

    public Realme() {
        System.out.println("this is super class constructor");
    }

    void warranty()
    {
        System.out.println(brand+" two years brand warranty ");
    }
}
class RealmeMobile extends Realme////this class extends brand parent class
{

    public void getDetails()
    {
        System.out.println("product id "+productId);//accessing superclass variables
        System.out.println("product name "+super.productName);
        System.out.println("brand  "+super.brand);
    }
    @Override
    void warranty() {////accessing superclass methods
        super.warranty();
    }
}
class RealmeNote6 extends RealmeMobile//this class extends mobile parent class
{
    public void getDetails()
    {
        System.out.println("product id "+productId);//accessing superclass variables
        System.out.println("product name "+super.productName);
        System.out.println("brand  "+super.brand);
    }
    @Override
    void warranty() {////accessing superclass methods
        super.warranty();
    }
}
public class MultiLevelInheritence {
    public static void main(String[] args) {
        RealmeMobile mobile=new RealmeMobile();
        mobile.getDetails();
        RealmeNote6 realmeNote6=new RealmeNote6();

        realmeNote6.brand="realme";
        realmeNote6.productId=745822;
        realmeNote6.productName="reamenote6pro";
        realmeNote6.getDetails();
        realmeNote6.warranty();
    }
}
