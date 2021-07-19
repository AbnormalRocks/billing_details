package com.billing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.util.*;
import java.math.*;

@SpringBootApplication
public class BillingApplication {

	public static void main(String[] args) throws IOException {
		//SpringApplication.run(BillingApplication.class, args);
		//nikeChallenge();
	}
	
	private static void nikeChallenge() {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      //String str1 = br.readLine();
	      //String str2 = br.readLine();
			System.out.println("begin");
	      String str1 = "11 146";
	      String str2 = "1 2 1 3 4 11 21 4 9 5 5 ";
	      String s1[] = str1.split(" ");
	      Long n = Long.parseLong(s1[0]);
	      Long d = Long.parseLong(s1[1]);
	      BigInteger cash = BigInteger.valueOf(d);
	      int l = str2.length();
	      List<Long> list = new ArrayList<Long>();
	      List<BigInteger> sums = new ArrayList<BigInteger>();
	      int m=0;
	      boolean flag=false;
	      int firsti=0,lasti=0;
	      for(int i=0;i<l;i++){
	         if(str2.charAt(i)==' '){
	        	flag=false;
	        	lasti=i;
		         Long newNo = Long.parseLong(str2.substring(firsti, lasti));
		         
		         int k=0;
		         while(k<list.size()&&list.get(k)<newNo){
		            k++;
		         }
		         list.add(k, newNo);
	         }
	         else {
	        	 if(!flag) {
	        		 firsti=i;
	        		 flag=true;
	        	 }
	        	 flag=true;
	         }
	         
	      }
	      for(int i=0;i<list.size();i++){
	         if(i>0){
	            sums.add(i, sums.get(i-1).add(BigInteger.valueOf(list.get(i))));
	         }
	         else{
	            sums.add(i, BigInteger.valueOf(list.get(i)));
	         }
	      }
	      //System.out.println("list till last = "+list);
	      //System.out.println("sum till last = "+sums);
	      Long c = 0l;
	      while(cash.compareTo(BigInteger.valueOf(0))>0){
	    	 //System.out.println("items bought = "+c);
	         //System.out.println("cash left = "+cash);
	         if(sums.get(sums.size()-1).compareTo(cash)<1){
	            c=c+n;
	            cash = cash.subtract(sums.get(sums.size()-1));
	         }
	         else{
	            m=0;
	            while(sums.get(m).compareTo(cash)<1){
	               m++;
	            }
	            c=c+m;
	            cash = cash.subtract(sums.get(m));
	         }
	      }
	      System.out.println(c);
		
	}
}


