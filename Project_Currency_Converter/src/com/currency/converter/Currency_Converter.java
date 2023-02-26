package com.currency.converter;
import java.util.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.Year;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Currency_Converter {

	

	public static void main(String[] args) {
		double rupee,dollars,pound,code,euro,KWD;
		DecimalFormat vDecimalFormat=new DecimalFormat();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome to Currency Converter");
		System.out.println("1)Rupees:\n2)Dollars:\n3)pound:\n4)code:\n5)euro:\n6)KWD");	
		System.out.println("Enter The Currency Number:");
		code=scanner.nextInt();
		if (code==1) {
			System.out.println("Enter Amount In Rupees");
			rupee=scanner.nextDouble();
			dollars=rupee/77.34;
			System.out.println("Dollar:" +vDecimalFormat.format(dollars));
			pound=rupee/94.46;
			System.out.println("Pound:"+vDecimalFormat.format(pound));
			euro=rupee/80.36;
			System.out.println("Euro:"+vDecimalFormat.format(euro));
			KWD=rupee/251.91;
			System.out.println("Kuwait Dinar:"+vDecimalFormat.format(KWD));
		}
			else if (code==2) {
				System.out.println("Enter Amount In Dollar");
				dollars=scanner.nextDouble();
				rupee=dollars*77.34;
				System.out.println("Rupees:" +vDecimalFormat.format(rupee));
				pound=dollars*0.82;
				System.out.println("Pound:"+vDecimalFormat.format(pound));
				euro=dollars*0.96;
				System.out.println("Euro:"+vDecimalFormat.format(euro));
				KWD=dollars*0.31;
				System.out.println("Kuwait Dinar:"+vDecimalFormat.format(KWD));
			}
			else if (code==3) {
				System.out.println("Enter Amount In Pound");
				pound=scanner.nextDouble();
				rupee=pound*94.43;
				System.out.println("Rupees:" +vDecimalFormat.format(rupee));
				dollars=pound*1.22;
				System.out.println("Dollar:"+vDecimalFormat.format(dollars));
				euro=pound*1.17;
				System.out.println("Euro:"+vDecimalFormat.format(euro));
				KWD=pound*0.3748;
				System.out.println("Kuwait Dinar:"+vDecimalFormat.format(KWD));
			}
			else if (code==4) {
				System.out.println("Enter Amount In Euro:");
				euro=scanner.nextDouble();
				rupee=euro*80.43;
				System.out.println("Rupees:" +vDecimalFormat.format(rupee));
				dollars=euro*1.04;
				System.out.println("Dollar:"+vDecimalFormat.format(dollars));
				pound=euro*0.85;
				System.out.println("Pound:"+vDecimalFormat.format(pound));
				KWD=euro*0.31748;
				System.out.println("Kuwait Dinar:"+vDecimalFormat.format(KWD));
			}
			else if (code==5) {
				System.out.println("Enter Amount In Kuwait Dinar:");
				KWD=scanner.nextDouble();
				rupee=KWD*251.96;
				System.out.println("Rupees:" +vDecimalFormat.format(rupee));
				dollars=KWD*3.26;
				System.out.println("Dollar:"+vDecimalFormat.format(dollars));
				pound=KWD*2.67;
				System.out.println("pound:"+vDecimalFormat.format(pound));
				euro=KWD*3.013;
				System.out.println("Euro:"+vDecimalFormat.format(euro));
			}
		else 
			System.out.println("Invalid Code!...");
		
		
		{
				
			}
	
	}

}
