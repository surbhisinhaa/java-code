


Public Class oops {
     

    public static void main (String[]args){
        //making object by default constructor...........
        Person p1= new Person();
        p1.age=18;
        p1.name="surbhi";
        //this object also by default constructor.........
        Person p2= new Person();
        p2.age=8;
        p2.name="ab";
        Person p3= new Person();
        p3.age=8;
        p3.name="ab";
        //here i call non permametrised function.........
        p1.walk();
        //here i call perametrised function.......
        p1.walk(1000);
        System.out.println( p1.name +" is "+p1.age+" years old girl");
        System.out.println( p2.name +" is "+p2.age+" years old girl");
        System.out.println(Person.count); // see here we acces this static count by class name itself,no need to acces through object ..by using static keyword it becomes object independent.=
         
    }
    
}
class Person {
    String name;
    int age;
    static int count; //static se ye matlab he ki ab ye  ek class ki property ho chuki he ,ye object ki property nhi rahi..
                      // esko acces krne ke liye hame object banane ki need mhi he ese dirctely class name se acces kr skte he..ye kisi object pr depend nhi he..

    // this constructor is default constructor
    // constructor helps to construct object...
    public Person(){
         count++ ;//ye use kiya taaki count kr sake kitni baar object bana he..kyuki utna hi baar ye default function call hoga.
        // print this just to check how many times are this constructor called.....
        //jitne baar object banega utni baar default constructor call hoga..esi se object construct hota he..
        System.out.println("creating an object");
    }

    // this is nonperameter function..
    void walk(){
        System.out.println(name +" is walking........");
    }
    // this function is perametriised..function.
    void walk(int steps){
        System.out.println(name +" is walked "+ steps +" steps");
    }
}
