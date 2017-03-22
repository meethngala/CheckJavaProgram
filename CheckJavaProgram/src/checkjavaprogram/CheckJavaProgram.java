/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkjavaprogram;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Meeth
 */
public class CheckJavaProgram {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {

        // TODO code application logic here
        ReadFiles r= new ReadFiles();// creating an object reference of the class ReadFiles
        JavaCode j= new JavaCode();// creating an object reference of class JavaCode
        System.out.println("the file name is " +args[0]);
        String code=r.readFile(args[0]);// takes the file name from the command line
       j.check(code);// calls the check java code method

        
    }

}
