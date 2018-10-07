package com.hackerearth;
/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//*///imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        int T=0;
    	/* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        */
        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        /**/

        // Write your code here
        try{
        T = Integer.parseInt(name);
        //System.out.println(T);
        }
        catch(java.lang.NumberFormatException e){
        	System.out.println("Enter a valid number");
        }
        
        //System.out.println("Program came here");
        if(T!=0)
        for(int t=T;t>0;t--){
        	int N = 0;
        	N = s.nextInt();
        	/*try{
                N = Integer.parseInt(name);
                //System.out.println(T);
                }
                catch(java.lang.NumberFormatException e){
                	System.out.println("Enter a valid number");
                }*/
        	if(N!=0){
        		int val=0;
        		int[] arr = new int[N];
        		for(int n=0;n<N;n++){
        			
                	val = s.nextInt();
                	/*try{
                        val = Integer.parseInt(name);
                        //System.out.println(T);
                        }
                        catch(java.lang.NumberFormatException e){
                        	System.out.println("Enter a valid number");
                        }*/
                	arr[n]=val;
        		}
        		int sum=0;
        		for(int n=0;n<N;n++)
        			sum=sum+arr[n];
        		if(sum%N==0){
        			System.out.println((int)sum/N);
        		}
        		else
        			System.out.println(-1);
        			
        			
        	}
        	
        }
    }
}
