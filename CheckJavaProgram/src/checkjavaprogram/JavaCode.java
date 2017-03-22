/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkjavaprogram;

import java.util.Stack;

/**
 * class to check the java code for its syntax
 * @author Meeth
 * @version 1
 */
public class JavaCode {
    
           
       
        Stack<Character> stack = new Stack<>();
        
    /**
     * checks the syntax of the java code
     * @param code
     */
    public void check(String code){
       boolean flag=true;
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i)=='('|| code.charAt(i)=='{'||code.charAt(i)=='['||code.charAt(i)=='<' ) {
                stack.push(code.charAt(i));
            }
            if (code.charAt(i)==')') {
                if (stack.isEmpty()) {
                    System.out.println("Stack is empty");
                }
                if (stack.pop() !='(') {
                    System.out.println("The code has errors");
                    flag=false;
                    break;
                }
                
            }
                       if (code.charAt(i)=='}') {
                if (stack.isEmpty()) {
                    System.out.println("Stack is empty");
                }
                if (stack.pop() !='{') {
                    System.out.println("The code has errors");
                    flag=false;
                    break;
                }
                
            }
                       if (code.charAt(i)==']') {
                if (stack.isEmpty()) {
                    System.out.println("Stack is empty");
                }
                if (stack.pop() !='[') {
                    System.out.println("The code has errors");
                    flag=false;
                    break;
                }
                
            }
                                  if (code.charAt(i)=='>') {
                if (stack.isEmpty()) {
                    System.out.println("Stack is empty");
                }
                if (stack.pop() !='<') {
                    System.out.println("The code has errors");
                    flag=false;
                    break;
                }
                
            }
           
        }
        if(flag==true){
            System.out.println("The code is correct");
        }
        }
}
