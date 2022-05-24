class Dairymilk
{
    void taste(String sweet)
    {
        System.out.println("Flavoured with dark chocolate");
    }

}
class Milkybar
{
    void taste(int sweet)
    {
        System.out.println(sweet+" taste flavoured with white chocolate");

    }
    void taste(String sweet)
    {
        System.out.println("Flavoured with dark chocolate");
    }

}
public class Chocolate {
    void taste(String sweet)
    {
        System.out.println(sweet +" in taste");
    }
    public static void  main(String args[])
    {
        Milkybar milkybar = new Milkybar();
        milkybar.taste("Sweet");
        milkybar.taste(6666);
        Dairymilk dairymilk = new Dairymilk();
        dairymilk.taste("Sweet");
        Chocolate choco = new Chocolate();
        choco.taste("Sweet");

    }
}
