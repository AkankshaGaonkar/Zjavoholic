public class Calculator {
    void result(int x)
    {
        System.out.println(x);

    }
    int result(int x,int y)
    {
        System.out.println(x+y);
        return x+y;

    }
    void result(double x,float y,int z){
        System.out.println(x+y+z);
    }
    public static void main(String args[])
    {
       Calculator c = new Calculator();
       c.result(4.5,5.6f,6);
       c.result(6);
       c.result(5,8);
    }

}
//calci
//If two or more method have same name and same parameter list but differs in return type can not be overloaded.
