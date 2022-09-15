public class QuickSort {
    public static void quicksort(int[] arr,int low,int high){
        if(low<high){
            int pidx=partition(arr,low,high);
            quicksort(arr,low,pidx-1);
            quicksort(arr,pidx-1,high);
        }}
    public static  int  partition(int arr[],int low,int high){
      int pivot=arr[high];
      int i=low-1;
      for(int j=low;j<high;j++){
          if(arr[j]<pivot){
              i++;
          //swap
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
          }
      }
      i++;
      int temp=arr[i];
      arr[i]=pivot;
      arr[high]=temp;
      return i;
    }
}
