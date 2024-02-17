package com.dataStructure.ArrayList;

import java.util.*;

public class StringBalanceTest 
{

	public static void main(String[] args) 
	{
	
	
		String input1= " [{} ()]";
		String input2= " [(]) ";
		
		System.out.println(input1 + " ---> is Balance : " +isBalanced(input1));
		System.out.println(input2 + " ---> is not Balance : " +isBalanced(input2));
	}
	
	
	// String Balance using for loop
	
	
	public static boolean isBalanced(String input)
	{
		Stack<Character> stack=new Stack<Character>();
		
		for(int i=0; i<input.length(); i++)
		{
			char c = input.charAt(i);
			
			if(c=='[' || c=='{' || c=='(')
			{
				stack.push(c);
			}
			else if(c==']' || c=='}' || c==')')
			{
				if(stack.isEmpty())
				{
					return false;
				}
				
				char top = stack.pop();
				
				if((c ==']' && top != '[') || (c == '}' && top != '{') || (c ==')'&& top != '(') )
				{
					return false;
				}
				
			}
			
		}
		return stack.isEmpty();
	}

}
