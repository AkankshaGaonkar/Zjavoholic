class author
{
    String authorname;
    int authorage;
    String authorplace;
    author(String an,int aa,String ap)
    {
        this.authorname=an;
        this.authorage=aa;
        this.authorplace=ap;
    }

}
public class AggrregationBook {
    String bookname;
    int price;
    static author au; // au is the reference that is used to invoke author method in class author
    AggrregationBook(String bn,int p,author au)
    {
        this.bookname = bn;
        this.price = p;
        this.au=au;
    }
    public static void main(String args[])
    {

        author aur = new author("James Clear",34,"USA");
        AggrregationBook ab = new AggrregationBook("Atomic Habits",456,aur);
        System.out.println("Book Details");
        System.out.println("Book Name "+ab.bookname);
        System.out.println("Book Price "+ab.price);
        System.out.println();
        System.out.println("Author Details");
        System.out.println(aur.authorage);
        System.out.println("Author Name "+au.authorname);
        System.out.println("Author Age "+ab.au.authorage);
        System.out.println("Author Place "+ab.au.authorplace);
    }
}
