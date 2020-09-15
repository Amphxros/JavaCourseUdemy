import java.util.Scanner;

public class CondicionalesCompuestas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec= new Scanner(System.in);
	
		System.out.println("inserta un num");
		int n= tec.nextInt();
	
		if(n%2==0 && n!=0) {
			System.out.println("es un num par");
		}
		else{
			System.out.println("no es un num par");
		}
	
		
		
	}

}
