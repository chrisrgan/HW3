import java.util.Scanner;
import java.util.ArrayList;

public class magcards
{
	public static void main(String[] args)
	{
		int i,j;
		int x=1;
		System.out.println("Think of a number between 1 and 21");
		System.out.println("If you want to start the game press 0");

		Scanner scan1 = new Scanner(System.in);
		int selection = scan1.nextInt();
		
		if (selection == 0)
		{
			System.out.println("Distributing cards...");
		
		
		//put in array thats 7 by 3
		int [][] array = new int [7][3];
		
		for (i=0; i<7; i++)
		{
			for (j=0; j<3; j++)
			{
				array [i][j] = x;
				System.out.print(array [i][j] + " ");
				x++;
			}
			System.out.println(" ");
		}
		//System.out.println(array[0].length); prints length of rows
		//System.out.println(array.length); prints how many rows
		
		int pileseptimes = 0;
		while (pileseptimes <3)
		{
			
			System.out.println("What column does your card reside in? Pile 1, 2, or 3?");
			Scanner scan2 = new Scanner(System.in);
			int column = scan2.nextInt();
		
		
			//initializing 1d array 
			int [] array2 = new int[21];
		
		
			
			if (column == 1)
			{
				//DISPLAY THE PICKED PILE IN THE MIDDLE
				System.out.println("The pile you picked is now the middle pile.");
				for (int k=0; k<7; k++) {
					array2[k] = array[k][0];
					//System.out.println(array2[k]);
				}
				
				for (int k=0; k<7; k++) {
					array[k][0] = array[k][1];
					//System.out.println(array[k][0]);
				}
				
				for (int k=0; k<7; k++) {
					array[k][1]= array2[k];
					//System.out.println(array[k][1]);
				}
				
				for (i=0; i<7; i++)
				{
					for (j=0; j<3; j++)
					{
						System.out.print(array [i][j] + " ");
					}
					System.out.println(" ");
				}
			
				
				
				//2D TO 1D ARRAY
				for (int k=0; k<7; k++) {
					array2[k] = array[k][0];
					//System.out.print(array2[k] + " ");
				}
				for (int k=0; k<7; k++) {
					array2[k+7] = array[k][1];
					//System.out.print(array2[k+7] + " ");

				}
				for (int k=0; k<7; k++) {
					array2[k+14] = array[k][2];
					//System.out.print(array2[k+14] + " ");
				}
				System.out.println("");
				
				
				//RE-ORDERED THE CARDS
				System.out.println("The cards have been reordered.");
				int count = 0;
				for (int z=0; z<7;  z++) 
				{
					for (int b=0; b<3; b++) 
					{
						array[z][b] = array2[count];
						System.out.print(array [z][b] + " ");
						count ++;
					}
					System.out.println("");
				}
				
				pileseptimes = pileseptimes +1;
				
			}
			
			if (column == 2)
			{
				//2D TO 1D ARRAY
				for (int k=0; k<7; k++) {
					array2[k] = array[k][0];
					//System.out.print(array2[k] + " ");
				}
				for (int k=0; k<7; k++) {
					array2[k+7] = array[k][1];
					//System.out.print(array2[k+7] + " ");

				}
				for (int k=0; k<7; k++) {
					array2[k+14] = array[k][2];
					//System.out.print(array2[k+14] + " ");
				}
				System.out.println("");
				
				
				//RE-ORDERED THE CARDS
				System.out.println("The cards have been reordered.");
				int count = 0;
				for (int z=0; z<7;  z++) 
				{
					for (int b=0; b<3; b++) 
					{
						array[z][b] = array2[count];
						System.out.print(array [z][b] + " ");
						count ++;
					}
					System.out.println("");
				}
				
		
				pileseptimes = pileseptimes +1;
	
			}
			
			if (column == 3)
			{
				//DISPLAY THE PICKED PILE IN THE MIDDLE
				System.out.println("The pile you picked is now the middle pile.");
				for (int k=0; k<7; k++) {
					array2[k] = array[k][2];
					//System.out.println(array2[k]);
				}
				
				for (int k=0; k<7; k++) {
					array[k][2] = array[k][1];
					//System.out.println(array[k][0]);
				}
				
				for (int k=0; k<7; k++) {
					array[k][1]= array2[k];
					//System.out.println(array[k][1]);
				}
				
				for (i=0; i<7; i++)
				{
					for (j=0; j<3; j++)
					{
						System.out.print(array [i][j] + " ");
					}
					System.out.println(" ");
				}
				
				
				//2D TO 1D ARRAY
				for (int k=0; k<7; k++) {
					array2[k] = array[k][0];
					//System.out.print(array2[k] + " ");
				}
				for (int k=0; k<7; k++) {
					array2[k+7] = array[k][1];
					//System.out.print(array2[k+7] + " ");

				}
				for (int k=0; k<7; k++) {
					array2[k+14] = array[k][2];
					//System.out.print(array2[k+14] + " ");
				}
				System.out.println("");
				
				
				//RE-ORDERED THE CARDS
				System.out.println("The cards have been reordered.");
				int count = 0;
				for (int z=0; z<7;  z++) 
				{
					for (int b=0; b<3; b++) 
					{
						array[z][b] = array2[count];
						System.out.print(array [z][b] + " ");
						count ++;
					}
					System.out.println("");
				}
				
				pileseptimes = pileseptimes +1;
			}
		}
		
		
		System.out.println("Is your card the 11th card from the top? (Write true or false)");
		Scanner scan3 = new Scanner(System.in);
		boolean usercheck = scan3.hasNextBoolean();
		if (usercheck == true)
		{
			System.out.println("Thanks for playing");
		}
		
		else
		{
			System.out.println("What number from the top was it?");
		}
		
		
		
		
	}
		else if (selection != 0)
		{
			System.out.println("Please restart and Press 0");
		}
	}
}
