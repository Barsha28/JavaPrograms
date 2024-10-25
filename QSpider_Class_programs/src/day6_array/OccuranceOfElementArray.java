package day6_array;

public class OccuranceOfElementArray {
public static void main(String[] args) {
	int a[]= {1,2,3,2,2,2,3,5,3,5,1};
	 int b[]=new int[a.length]; 
	 int visited=-1;
	 for (int i = 0; i < a.length; i++) {
		 int count=1;
	  for (int j = i+1; j < a.length; j++) {
		  if(a[i]==a[j]) { 
		  count++;
		  b[j]=visited;
		  }
	  }
	  if(b[i]!=visited) {
		  b[i]=count;
	  }
	}
	 System.out.println("---------------------------------------");  
     System.out.println(" Element | Frequency");  
     System.out.println("---------------------------------------");  
     for(int i = 0; i < b.length; i++){  
         if(b[i] != visited)  
             System.out.println("    " + a[i] + "    |    " + b[i]);  
     }  
     System.out.println("----------------------------------------");
}
}
