package com.string.pack;

public class pascalTriangle 
{

	public static void main(String[] args) 
	{
		 // Define the number of rows to generate
        int numRows = 5;

        // Initialize the array
        int[][] triangle = new int[numRows][];

        // Calculate the triangle values
        for (int i = 0; i < numRows; i++) 
        {
            triangle[i] = new int[i+1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;

            for (int j = 1; j < i; j++) 
            {
                triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
            }
        }

        // Print the triangle
        for (int i = 0; i < numRows; i++) 
        {
            for (int j = 0; j <= i; j++) 
            {
                System.out.print(triangle[i][j] +" ");
            }
            System.out.println();
        }
	}

}
