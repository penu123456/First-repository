package chiru;

public class gp {
	
static int a=0;
static  int b=0;
	public static void main(String[] args) {


a=mul(30,40);

System.out.println("The product of two numbers is:" +a);

b=sum(30,90);

System.out.println("The product of two numbers is:" +b);

	}
	
public static int mul(int c,int d) {
	
	a=c*d;
	
	return a;
}

public static int sum(int e,int f) {
	
	b=e+f;
	
	return b;
}
}
