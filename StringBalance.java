package com.dataStructure.ArrayList;

import java.util.Stack;    // chat GTP(AI)

public class StringBalance 
{

	public static void main(String[] args) 
	{
		 String input1 = "[()]";
	        String input2 = "[{}(])";

	        System.out.println(input1 + " is balanced: " + isBalanced(input1));
	        System.out.println(input2 + " is not balanced: " + isBalanced(input2));
	}
		
	
	  // String Balance using for each loop
	
		public static boolean isBalanced(String input) 
		{
	        Stack<Character> stack = new Stack<Character>();

	        for (char c : input.toCharArray()) 
	        {
	            if (c == '(' || c == '[' || c == '{') 
	            {
	                stack.push(c);
	            } 
	            else if (c == ')' || c == ']' || c == '}') 
	            {
	                if (stack.isEmpty()) 
	                {
	                    return false;
	                }
	                 
	                char top = stack.pop();
	                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) 
	                {
	                    return false;
	                }
	            }
	        }

	        return stack.isEmpty();
		}
	}

