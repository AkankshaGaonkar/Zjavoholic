//Multilevel Inheritance
class food
{
    String foodname;
}
class burger extends food
{
    int price;
    public void burger()
    {
        foodname = "Burger";
        price = 200;
        System.out.println(foodname+" is "+price+" Rs.");
    }

}
public class pizza extends burger
{
    public void pizza() {
        foodname = "pizza";
        price = 350;
        System.out.println(foodname+" is "+price+" Rs.");
    }
    public static void main(String args[])
    {
        pizza p = new pizza();
        p.burger();
        p.pizza();

    }
}
