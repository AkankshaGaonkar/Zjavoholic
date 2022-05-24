package test;
class FreshJuice {
	enum FreshJuiceSize{ SMALL, MEDIUM, LARGE} 
	FreshJuiceSize size;
}
public class FreshJuiceGlassSize {
 public static void main (String args[]) {
	 FreshJuice Juice = new FreshJuice();
	 Juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
	 System.out.println("Size:" + Juice.size);
 }
}