import java.util.*;
// import java.util.Collections;
public class contest {
    public static void main(String[] args) {

  //  System.out.println("Hello World");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] num = new int[n];
        int count=0;

        for (int i = 0; i < num.length; i++) {
            num[i] = s.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            for (int j =i;j < num.length; j++) {
              int[] n2 = new int [j-i+1];
              for(int n1=i ; n1<=j; n1++){
                  n2[n1-i]=num[n1];
              }
              int max=n2[0],min=n2[0];
              for(int k=0;k<j-i+1;k++){
                      if(n2[k]>max)
                      max=n2[k];
                                  
                    }
                    for(int k=0;k<j-i+1;k++){
                        if(n2[k]<min)
                        min=n2[k];
                                    
                      }
                count+=max-min;
           
          }

        }
        
        System.out.println(count);
    }

    }
