public class bubble_sorting {
    public static void main (String []args){
        int [] arr={1,3,4,2,5};
        System.out.println("The unsorted array: ");
        for (int n:arr) {
            System.out.print(" "+n );
        }
        for (int i=0;i<5;i++){
            for(int j=0;j<5-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }System.out.println("\nThe sorted array: ");
        for (int num:arr) {
            System.out.print(" "+num);
        }
    }
}
