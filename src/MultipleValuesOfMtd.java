public class MultipleValuesOfMtd {
    static int [] total(int a, int b)
    {
        int[] A = new int[2];
        A[0] = a + b;
        A[1] = a - b;
        return  A;
    }
    public static void main(String args[])
    {
        int[] A = total(200,70);
        System.out.println("Add "+A[0]);
        System.out.println("Sub "+A[1]);
    }
}
//we can return multiple values from a method by using array. We store all the values into an array that want to return and then return it to the caller method. We must specify return-type as an array while creating an array
