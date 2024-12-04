package Practise;

import java.util.Scanner;

class Practisee{
    public static void main(String[] args) {
        int [] a= new int[10];


        for (int i = 0; i < a.length; i++) { //algo use kra taki dummy values daal sake
            a[i] = (int)(Math.random() * 10);
        }


        for(int x:a) { //for-each loop ka use kra taki thoda simple rhe
            System.out.print(x+" ");
        }
        System.out.println(); //bas formating ke liye

        //**SORTING**//

        //Bubble Sort
//        for (int i = 0; i < a.length; i++) {  //a.length taki yeh universal rhe
//            for (int j = 0; j < a.length-i-1; j++) {  //ek experiment me meine new chiz found ki
//                if(a[j]>a[j+1]) {                     // inner loop can be: for (int j = 0; j < a.length-1; j++)
//                    int temp = a[j];
//                    a[j] = a[j+1];
//                    a[j+1] = temp;
//                }
//            }
//        }
//        //Selection sort

//        int s, p;
//        for (int i = 0; i < a.length; i++) {
//            s=a[i]; //smallest number assume krke approach kiya
//            p=i; //smallest number ka index number
//
//            for (int j = i+1; j < a.length ; j++) {
//                if(s>a[j]){ //smmallest number milte hi swap mardo
//                    s=a[j];
//                    p=j;
//                }
//            }
//            int temp=a[i]; //smallest number milte hi usko i wali position se swap krdo
//            a[i]=a[p];
//            a[p]=temp;
//        }


        //**PRINTING SORTED ARRAY**//
//        for(int x:a) { // just for printing sorted arrays
//            System.out.print(x);
//        }
//        System.out.println();


        //**SEARCHING**//

//         **BEFORE USING SEARCH UNCOMMENT THESE**

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(); // input
//        boolean f=false; //flag variable

        //Linear search
//
//        for (int i = 0; i < a.length; i++)
//            if(a[i]==n){
//                f=true;
//                break; //taki next term na match krne pe f false hoke galat result na de
//            }
//
//        System.out.println((f)?"Found":"Not found");

        //BINARY SEARCH

        // CAUTION: UNCOMMENT ANY SORTING BEFORE USING THIS
//
//        int m=0,l=0,r=a.length-1;
//        while(l<=r){
//            m=(l+r)/2;
//
//            if(n<a[m]){
//                r=m-1;
//            }
//
//            else if(n>a[m]){
//                l=m+1;
//            }
//
//            else {
//                f=true;
//                break;
//            }
//        }
//
//        System.out.println((f)?"Found at position : "+(m+1):"Not found in list");
    }
}