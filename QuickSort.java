//import java.io.*; // for handling input/output
//import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
  //public class nidhi{
   //final static int mod = 1000000007;
	//public static void main (String[] args) { 
    //System.out.println("start");//
        // Scanner sc=new Scanner (System.in); 
        //  int N=sc.nextInt();
        //  int K=sc.nextInt();
        //  int totalCombinations =(N*K);
        //  for(int i = 1; i < N; i++) {
        //     totalCombinations = totalCombinations %mod * (K - 1);
        //     totalCombinations = totalCombinations % mod;
    //     String str=("i am khushbu");
    //     }
    //     System.out.println(str);
    // }            // String str=("i am khushbu");Your code here
    class QuickSort{
        int partition(int arr[], int low, int high){
            int pivot= arr[high];
            int i=low-1;
            for(int j=low;j<high;j++){
                if(arr[j]<=pivot){
                    i++;
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            int temp=arr[i+1];
            arr[i+1]=arr[high];
            arr[high]=temp;
            return i+1;
        }
        void sort(int arr[], int low, int high){
            if(low<high){
                int pi= partition(arr,low,high);
                sort(arr,low,pi-1);
                sort(arr,pi+1,high);
            }
        }
        static void printArray(int arr[]){
            int n=arr.length;
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            System.out.println();
            }
        }
        public static void main(String args[]){
            int arr[] = {1, 15, 27, 3, 2, 45, 32};
            int n= arr.length;
            QuickSort obj = new QuickSort();
            obj.sort(arr,0,n-1);
            System.out.println("Sorted Array:");
            printArray(arr);
        }
    }
    