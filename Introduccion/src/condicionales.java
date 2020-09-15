import java.util.Scanner;

public class condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner tec= new Scanner(System.in);
		String txt= "ingrese un valor";
		
		int n;
		
		//programa
		
		System.out.println(txt);
		n= tec.nextInt();
	
		if(n%2==0 && n!=0) {
			System.out.println("es un num par");
		}
		if (n%2!=0) {
			System.out.println("no es un num par");
		}
	
	}

}
