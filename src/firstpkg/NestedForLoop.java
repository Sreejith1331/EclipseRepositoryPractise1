package firstpkg;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to print * in square shape
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*print below pattern
		  	*
		  	* *
		  	* * *
		  	* * * *
		  	* * * * *
		 */
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
		 	1
		 	1 2
		 	1 2 3
		 	1 2 3 4
		 */
		for (int i = 1; i <= 4; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
		 	1
		 	2 3
		 	4 5 6 
		 	7 8 9 10
		 */
		int k = 1;
		for(int i = 1; i <= 4; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}
		
		

	}

}
