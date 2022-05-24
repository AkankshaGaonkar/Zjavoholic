//Single Inheritance and super keyword
class Parent
{
    String name;
    public void p1()
    {
        System.out.println("Parent method");
    }
}
public class Child extends Parent {

    public void c1()
    {
        super.name = "Ashu"; //usage of super keyword i.e, Child class referring Parent class property using super keyword
        super.p1(); //Child class refering Parent class methods using super keyword
        System.out.println("Child method");
        System.out.println(name);
    }
    public static void main(String[] args)
    {
        Child cobj = new Child();
        cobj.c1();  //method of Child class
        cobj.p1();  //method of Parent class
    }
}
//the class Child can also access the public method p1() of the class Parent