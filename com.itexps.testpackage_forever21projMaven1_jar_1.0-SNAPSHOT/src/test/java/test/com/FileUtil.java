/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author User
 */
public class FileUtil {
    public static LoginVO getLogin(){
         LoginVO login = null;//add this
                try {
            System.out.println("start");
            FileWriter fw = new FileWriter("c:\\data\\testdata.txt");//File+ctrl+space
            BufferedWriter bw = new BufferedWriter(fw);//to improve performance cos writing in a mamory not in a hard disk
            bw.write("lolatank999@gmail.com");
            bw.write(";");
            bw.write("vjnsktr999");
            bw.close();
            fw.close();
            FileReader fr = new FileReader("c:\\data\\testdata.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            String data[] = line.split(";");
            System.out.println(data[0]); //username
            System.out.println(data[1]); //password
            login = new LoginVO();//delete LoginVO after login
            login.setUsername(data[0]); //username
            login.setPassword(data[1]); //password

            System.out.println(line);
            br.close();
            fr.close();

            System.out.println("file created");
        } catch (IOException e) { // IO+ctrl+space
            System.out.println("exception");
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
                return login;//add return
    }
}
