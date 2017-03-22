/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkjavaprogram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author Meeth
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * class to read files
 *
 * @author Meeth
 */
public class ReadFiles {


    /**
     * method to read file
     *
     * @param filePath
     * @return a code
     * @throws IOException
     */
    public String readFile(String filePath) throws IOException, NumberFormatException {
        FileReader filereader = new FileReader(filePath);
        StringTokenizer str;
        //BufferedReader for the file
        BufferedReader reader = new BufferedReader(filereader);
        String line;
        String code="";
        int i = 0;
        //Read data from a file
        while ((line = reader.readLine()) != null) {
            code= code + line;
        }

        
        return code;
    }
}