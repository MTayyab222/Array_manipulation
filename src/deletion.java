public class deletion {
    public static void main(String args[]){
        int []arr1={1,2,3,4,5};
        int index_position=2;
        int []new_arr=new int[arr1.length-1];
        //elements before the deleted element
        for(int i=0;i<index_position;i++){
            new_arr[i]=arr1[i];
        }
        //elements right after the deleted element
        for(int i=index_position+1;i<arr1.length;i++){
            new_arr[i-1]=arr1[i];
        }
        System.out.print("The original array: ");
        for (int num1:arr1) {
            System.out.print(" "+num1);
        }
        System.out.print("\nThe deleted array: ");
        for (int num2:new_arr) {
            System.out.print(" "+num2);
        }
    }
}
