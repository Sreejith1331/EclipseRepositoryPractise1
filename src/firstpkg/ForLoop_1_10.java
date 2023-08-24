package firstpkg;

public class ForLoop_1_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		//print name 5 times
		for (int i = 1; i <= 5; i++) {
			System.out.println("Sreejith");
		}
		
		//print all alphabets
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.print(c + " ");
		}
		
		//multiplication table
		System.out.println();
		int no1 = 13;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("13 * " + i + " = " + (no1*i) );
		}
	}

}
