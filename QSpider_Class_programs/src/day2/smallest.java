package day2;
import java.util.Scanner;
public class smallest {
	   
	    public static void main(String []args){
	      Scanner sc=new Scanner(System.in);
	      System.out.println("enter 4 nos");
	      int no1=sc.nextInt();
	      int no2=sc.nextInt();
	      int no3=sc.nextInt();
	      int no4=sc.nextInt();
	      if(no1<no2 && no1<no3 && no1<no4){
	         System.out.println(no1+" is smallest");
	      }
	       else if(no2<no3 && no2<no4){
	         System.out.println(no2+" is smallest");
	      }
	      else if(no3<no4 ){
	         System.out.println(no3+" is smallest");
	      }
	      else{
	        System.out.println(no4+" is smallest");
	      }
	    }
	}
