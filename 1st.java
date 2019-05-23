import java.util.Scanner;

class newone
{
   public static void main(String args[])
     {
        int a, b;
        newone n1 = new newone();

	Scanner obj = new Scanner(System.in);
	System.out.println("Enter a and b");
	a = obj.nextInt();
	b = obj.nextInt();

        System.out.println("Value of a: " + a + " Value of b: " + b );
        n1.swap(a,b);
      }
int swap (int x, int y)
{
	System.out.println("Swapping now");
	int temp=0;
	temp = x;
	x=y;
	y= temp;
System.out.println("New Value of a: " + x + " New Value of b: " + y );
return 1;
}
}