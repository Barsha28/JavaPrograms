package practice_1;

public class AscendingString {
	public static void main(String[] args) {
		String s="mo amitabh dad children lion";
		String s1[]=s.split(" ");
			for (int i =0; i < s1.length; i++) {
				String temp="";
				for (int j = i+1; j < s1.length; j++) {
					if(s1[i].length()>s1[j].length()){
						temp=s1[i];
						s1[i]=s1[j];
						s1[j]=temp;
					}
				}
			}
			for(int i=0; i < s1.length; i++) {
				System.out.print(s1[i]+" ");
			}
		}
	}

