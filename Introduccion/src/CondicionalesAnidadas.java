import java.util.Scanner;

public class CondicionalesAnidadas {

	
public static int PideInt(Scanner tec,int min,int max,String s) {
		
		
		String txt= "ingrese un valor";
		//programa
		
		int n=min-1;
		while(n<min || n>max)
		{
			System.out.println(txt);
			n= tec.nextInt();
			
		}
		
		return n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec= new Scanner(System.in);
		int n=PideInt(tec,0,10,"escribe una nota");
		
		switch(n) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("suspenso");
			break;
			
		case 5:
			System.out.println("suficiente");
			break;
		case 6:

			System.out.println("bien");
			break;
		case 7:
		case 8:
			System.out.println("notable");
			break;
			
		case 9:
		case 10:
			System.out.println("sobresaliente");
			break;
		}
		
	}

	
}
