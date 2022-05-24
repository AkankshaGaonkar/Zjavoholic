public class callByValue {
    void method(int x)
    {
        x = 110;
    }
    public static void main(String args[])
    {
        int x=10;
        callByValue v = new callByValue();
        v.method(x); //function call i.e,value passed to the method does not change even after modified in the method. It shows that changes made to the value was local and argument was passed as call-by-value
        System.out.println(x);
    }
}
//Java is strictly pass by value. It means during method call, values are passed not addresses
