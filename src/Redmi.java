//Inheriting variables of super class
class Phone {
    String phone;
}
class Realme extends  Phone //Hierarchical Inheritance
{
    void showDetail()
    {
        phone="MOBILE";
        System.out.println(phone+" version");
    }

}
public class Redmi extends Phone
{
    String modeltype;
    void showDetail()
    {
        modeltype="RedmiNote 5 pro";
        phone="MOBILE";
        System.out.println(phone+" version "+modeltype);
    }
    public static void main(String args[])
    {
        Redmi r = new Redmi();
        r.showDetail();
    }
}

