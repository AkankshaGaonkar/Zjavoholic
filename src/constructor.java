public class constructor {
    constructor ()
    {
        int a=1;
        int b=7;
        int c=a+b;
        System.out.println(c);

    }
    public static void main(String args[]){
      constructor c = new constructor();
    }
}
//A constructor has same name as the class name in which it is declared. Constructor must have no explicit return type. Constructor in Java can not be abstract, static, final or synchronized
