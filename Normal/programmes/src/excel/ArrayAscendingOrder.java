package excel;

import java.util.Arrays;

public class ArrayAscendingOrder {

	 public static void main(String[] args) 
	    {
	        int temp;
	       /* Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	        n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for (int i = 0; i < n; i++) 
	        {								// this loop is used to store elements which are entered
	            a[i] = s.nextInt();
	        }*/;
	        
	        int a[]= {8,7,9,5,3};
	       
/*
	        for (int i = 0; i < a.length; i++) 
	        {
	            for (int j = i + 1; j < a.length; j++) 
	            {
	                if (a[i] > a[j]) 
	                {												//swapping concept
	      temp=y;              temp = a[i];
	        x=y;               a[i] = a[j];
	      y=temp;              a[j] = temp;
	                }
	            }
	        }*/
	        Arrays.sort(a);
	       System.out.print("Ascending Order:");
	        for (int i = 0; i < a.length; i++) 
	        {
	            System.out.print(a[i]+",");
	        }
	    }
	}	
	
