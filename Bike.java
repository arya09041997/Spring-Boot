class Bike
{
    int speed;
    String color,model;
    Bike()//default constructor:constructor with no parameter.
    {
        System.out.println("Bike class created");
    }
    Bike(int s)//paramerized constructor: constructor with parameter.
    {
        speed=s;
        System.out.println("Bike speed"+s);
    }
    Bike(String col,String mod)//Constructor overloading:same constructor with diffrent parameters. 
    {
        color=col;
        model=mod;
        System.out.println("Bike colour and model is "+col);
        System.out.println("Bike colour and model is "+mod);
    }
    Bike(Bike a)//Example of copying the value of an one object into another using Constructor
    {
        color=a.color;
        model=a.model;
    }
    void displayDetails()
    {
        System.out.println("Bike colour and model is "+color);
        System.out.println("Bike colour and model is "+model);
    }
    public static void main(String[] args)
    {
        Bike obj=new Bike();
        Bike obj1=new Bike(3);
        Bike obj2=new Bike("Red","Honda");
        Bike obj3=new Bike(obj2);
        obj3.displayDetails();
    }
}