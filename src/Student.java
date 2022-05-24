public class Student { //class is a blueprint for an object
    String name;//fields
    int rollno,age;//these fields are called as instance variables,which gets the memory when an object is created during runtime

    void info() //Methods in the class are similar to the function that are used to perform operations and represent the behaviour of the class
    {
        System.out.println("Name "+name);
        System.out.println("RollNumber "+rollno);
        System.out.println("Age "+age);
    }
    public String student (String str) //Methods with parameter
    {
        String nam="Java";
        nam=nam+str;
        return nam;
    }
    public static void main(String args[]){
        Student stu =new Student(); // stu  is an object that represents the class Student during runtime
        // Accessing and property value
        stu.name="Akanksha";
        stu.rollno=128;
        stu.age=21;
        // Calling method
        stu.info();
        System.out.println(stu.student(" Preparation"));
    }
}
//Object is an instance of a class and consists of properties(fields) and behavior(methods)
//syntax=className variable_name = new className();
//variable name is a name of the ref variable that is used to hold the ref of the created obj in stack area
//new is a keyword which is used to dynamically allocate memory for the object in heap area and creates an actual physical copy of the object and assign it to the stu variable
//eg:
//phone design =class
//obj=phone
//properties like: name, cost, color etc(fields)
//behavior like: calling, chatting etc(methods)
/*syntax of method:
return-type methodName(parameter-list)
{
//body of method
}*/
