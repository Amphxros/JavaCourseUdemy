import java.util.Scanner;

public class BucleFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tec= new Scanner(System.in);
		int h=PideInt(tec,0,10,"escribe una altura: ");
		
		for(int i=0;i<h; i++) {
			for(int j=0;j<=i;j++) {
			System.out.print("*");
			}		
			System.out.println();
		}
		
		
	}
public static int PideInt(Scanner tec,int min,int max,String s) {
		
		
		String txt= "ingrese un valor";
		//programa
		
		int n=min-1;
		do
		{
			System.out.println(txt);
			n= tec.nextInt();
			
		}
		while(n<min || n>max);
		
		return n;
	}
	
}
