
import java.util.Scanner;

public class VariableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaracion de var
		Scanner tec= new Scanner(System.in);
		String txt= "ingrese 1 er valor";
		
		float div;
		int pri, sec,sum,pro;
		
		//programa
		
		System.out.println(txt);
		pri= tec.nextInt();
	
		txt="ingrese 2o valor";
	
		System.out.println(txt);
		sec= tec.nextInt();
		
		sum= pri + sec;
		pro= pri*sec;
		div= pri/sec;
		System.out.println(sum);
		System.out.println(pro);
		System.out.println(div);
		
		
	}

}
