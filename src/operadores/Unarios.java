package operadores;

public class Unarios {
	public static void main(String[] args) {
		
		int x = 10, y = 8;
		
		System.out.println("\nPós Incrementar: x = ++ y");	
		
		x = y++;
		
		System.out.println("\nValo de X: " + x);	
		System.out.println("\nValo de Y: " + y);	
	}
}