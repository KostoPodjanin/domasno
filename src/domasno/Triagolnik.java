package domasno;


	import java.util.Scanner;
	public class Triagolnik {

		public static void main(String[] args) {
			int a,b,c;
			try (Scanner tastatura = new Scanner(System.in)) {
				System.out.println("Vnesi vrednost za stranata A: ");
				a=tastatura.nextInt();
				System.out.println("Vnesi vrednost za stranata B: ");
				b=tastatura.nextInt();
				System.out.println("Vnesi vrednost za stranata C: ");
				c=tastatura.nextInt();
			}
			if(a+b>c && a+c>b && b+c>a)
			{
				System.out.println("Trigaolnikot moze da se formira");
			}
			else
			{
				System.out.println("Triagolnikot ne moze da se formira");
			}
			if(a*a+b*b==c*c && b*b+c*c==a*a && c*c+a*a==b*b)
			{
				System.out.println("Triagolnikot e pravoagolen");
			}
			else if(a*a+b*b>c*c && a*a+c*c>b*b && c*c+b*b>a*a)
			{
				System.out.println("Triagolnikot e ostroagolen");
			}
			else
			{
				System.out.println("Triagolnikot e tapoagolen");
			}

		}

	}

