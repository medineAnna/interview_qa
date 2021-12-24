package QaAnswers;

public class C13 {

	public static void main(String[] args) {
		/*
		 
		 * Write a Java Program to swap two numbers
		 * 
		 * Swap (takas) islemini --> a=3, b=5 iken a=5, b=3 degerlerini alması
		 * islemidir. iki yoldan yaptiginiz java kodunu yaziniz.
		 * 
		 *  1.Yol: 3. degisken kullanarak 
		 *  2.Yol: 3. degisken kullanmadan
		 
		 */
		System.out.println("1. Methode: ");
		int a=3;
		int b=5;
		System.out.print("Erste Situation"+ " a="+a+"\tb="+b+"\n");
		int c=b; b=a; a=c;
		System.out.println("Letzte Situation"+ " a="+a+"\tb="+ b);
		
		System.out.println("2. Methode");
		a=3; b=5;
		System.out.print("Erste Situation"+ " a="+a+"\tb="+b+"\n");
		
		a=a-b; b=a+b; a=b-a;		
		System.out.println("Letzte Situation"+ " a="+a+"\tb="+ b);
		
	}

}
