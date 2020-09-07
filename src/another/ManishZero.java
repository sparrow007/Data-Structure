package another;

import java.util.Scanner;

public class ManishZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int zero=0;
        int nonZero=1;


        while (zero<arr.length && nonZero<arr.length){
//           if (arr[zero]==0){
//               System.out.println("zero");
//               zero++;
//           }
            if (arr[nonZero]==0){
//               System.out.println("non zero");
                nonZero++;

            }
            if(zero+1 ==nonZero  ){
                if(arr[zero]!=0){
                    zero++;
                    nonZero++;
                }else {
                    nonZero++;
                }

            }
            if(zero==arr.length || nonZero==arr.length)
                break;
            if(zero+1 !=nonZero && arr[nonZero]!=0){
                if(arr[zero]==0){
//               System.out.println("swipe");
                    arr[zero]=arr[nonZero];
                    arr[nonZero]=0;
                }else {
//                   System.out.println("swipe");
                    arr[zero+1]=arr[nonZero];
                    arr[nonZero]=0;
                }

                nonZero++;
                zero++;
            }
        }


//        for(int i=0;i<n-1;){
//            if(arr[i]==0){
//                rightshift(arr,i);
//
//            }if(arr[i]!=arr[i+1]){
//                i++;
//            }


//        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

//    public static int  rightshift(int[] arr,int i){
//        int temp=arr[i];
//        for(int j=i;j<arr.length-1;j++){
//            arr[j]=arr[j+1];
//        }
//        arr[arr.length-1]=temp;
//        return i-1;
//    }

}
