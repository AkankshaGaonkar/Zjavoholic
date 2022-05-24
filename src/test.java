class constructorOverloading {
    int age;
    String name;
    constructorOverloading()//default constructor
    {
        age = 0;
        name = "prasad";
    }

    constructorOverloading(int c, int d) { //constructor overloaded
        System.out.println(c + d);
    }


}
class test {
    public static void main(String arhs[]) {

        constructorOverloading c = new constructorOverloading();
        c.age = 98;
        c.name = "Ashu";
        System.out.println(c.age+" "+c.name);
        constructorOverloading a = new constructorOverloading(4, 7);
    }
}
