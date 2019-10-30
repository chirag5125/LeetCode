/*Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.*/


import java.util.*;

public class ValidParentheses {
	
    public boolean isValid(String s) {
    	Stack<Character> open=new Stack<>();
    	boolean flag=true;
        if(s.length()==1){
            flag= false;
        }
        
        for(int i=0;i<s.length();i++)//traverse the String
        	{
        		if(s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i)=='[') {
        			open.push(s.charAt(i));					// if character is opening bracket push into stack
        		}
        		else if(s.charAt(i)==']' || s.charAt(i)==')' || s.charAt(i)=='}') {
        			if(open.isEmpty()) 
        			{
        				flag=false;
        			}
        			else if(s.charAt(i)==']') {
        				if(open.pop()=='[') {
        					continue;
        				}else
        					flag= false;
        			}
        			else if(s.charAt(i)==')') {
        				if(open.pop()=='(') {
        					continue;
        				}else
        					flag=false;
        			}
        			else if(s.charAt(i)=='}') {
            				if(open.pop()=='{') {
            					continue;
            				}else
            					flag= false;
        			}
                     flag=true;
        		}
            else
                flag= false;
        	}
        return flag;
    	}
	}

