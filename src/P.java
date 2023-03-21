import java.util.Arrays;

public class P
{
                                                  // Print Array List//

//    public static void main(String[] args){
//    int a[]={1,4,5,6,7,7,8};
//
//        System.out.println("by forEach Loop");
//        for (int i:a) {
//            System.out.print(i+" ");
//        }
//        System.out.println();
//        System.out.print("by only for loop");
//        System.out.println();
//        for (int i=a.length-1;i>=0;i--) // this is use for descending order
//
//       // for (int i=0;i<=a.length-1;i++) // this is used for ascending order
//        {
//            System.out.print(a[i]+" ");
//        }
//}
                                                // Print sorting Array //

    public static void main(String[] args) {
        int ar[]={10,15,13,17,18,9,5};
        System.out.println("this array not sorted");
        for (int t:ar)
        {
            System.out.print(t+ " ");
        }
        System.out.println();
        int temp;
        for (int i=0;i<ar.length;i++){
            for(int j=i;j<ar.length;j++){
                if(ar[i]>ar[j]){
                    temp=ar[j];
                    ar[j]=ar[i];
                    ar[i]=temp;
                }
            }
        }
        System.out.println("this is sorted array");
        for (int i:ar)
        { System.out.print(i +" ");

        }

    }

}
