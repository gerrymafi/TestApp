/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author mafim
 */
public class ReadAndSplit {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileInputStream fstream = new FileInputStream("C:\\hvc.csv");

        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String strLine;

        int count = 0;
        //Read File Line By Line
        while ((strLine = br.readLine()) != null) {
            try {
                //System.out.println(strLine);
                String[] strArray = strLine.split(",");
                System.out.println(strArray[5] + "--" + strArray[3] + "--" + strArray[4] + "--" + strArray[8] + "--" + strArray[9] + "--" + strArray[6]);
            } catch (Exception e) {
                System.out.println("Error");
            }
        }

    }

}
