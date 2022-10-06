package loopDemo;

public class Main {

	public static void main(String[] args) {
		//For
		for(int i=2 ; i<10 ; i+=2) {
			System.out.println(i);
		}
		System.out.println("Döngü bitti.");
		
		//While
		int i = 2;
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("Döngü bitti.");
		
		
		//Do-While
		//Not: While ile Do-While farkı  Do-While da şart sağlanmasa bile bir kere çalışır.
		int j = 2;
		do {
			System.out.println(j);
			j+=2;
		}
		while(j<10);
		System.out.println("Döngü bitti.");
	}

}
