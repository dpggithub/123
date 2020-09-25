package nnn;
import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public ArrayList<Integer> solution(int a,int[] b){
        int[] E=new int[a];
        int sum=0;
         ArrayList<Integer> list=new ArrayList<Integer>();  
        for(int x=0;x<a;x++){
         for(int i=1;i<=b[x]-1;i++){
            for(int j=i+1;j<=b[x];j++){
            	 int k=0;	
            	    for(k = i;0 != k%j;k+=i){   
            	    if(k==i*j){sum+=i*j;   
            	    }
            	    }
            }
        }
            E[x]=(2*sum/(b[x]*(b[x]-1)));
            list.add(E[x]);
    }
        
        return list;
}

public static void main(String[] args){
    Scanner in =new Scanner(System.in);
    int a=in.nextInt();
    int[] b=new int[a];
    for(int i=0;i<a;i++){
       b[i]=in.nextInt(); 
    }
    in.close();
    System.out.println(new Main().solution(a,b));
}
}