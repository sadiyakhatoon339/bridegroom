/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridegroom;

/**
 *
 * @author DELL
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
public class Bridegroom {

    /**
     * @param args the command line arguments
     */
        class bridegroom
        {
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int d=0;
        String s3,s4;
StringTokenizer tk=new StringTokenizer(br.readLine());
String s=(tk.nextToken());
String s2=(tk.nextToken());

s3=s;
s4=s2;
int j=0;


for(int i=0;i<n;i++)
{ 
    char c1=s3.charAt(0);
    char c2=s4.charAt(0);
    if(c1==c2)
    {   d++;
    
    s3=s.substring(1,n);
     s4=s2.substring(1,n);
  
    }
    else
    {
    s4=s2.substring(1)+c2;
    }



    }
System.out.println(d);


    }
    
    }
