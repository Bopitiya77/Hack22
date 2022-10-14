public class Swap {

  public static void main(String[] args) {

	int x=10, y=20;
	int temp;

	temp = x;
	x = y;
	y = temp;

	System.out.println("Values After Swapping,");
	System.out.println("x="+x+"\t y="+y);
  }
