import java.util.Scanner;
public class binary_search {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int []my_array={1,2,3,4,5,6,7};
        int target;
        System.out.println("Enter the number you want to Search: ");
        target=s.nextInt();
        int first_index=0;
        int last_index= my_array.length-1;
        int mid=(first_index+last_index)/2;
        while (first_index<=last_index){
            if (my_array[mid]==target){
                System.out.println("The value is found at the index:"+mid);
                break;
            } else if (my_array[mid]>target) {
                last_index=mid-1;
            }
            else {
                first_index=mid+1;
            }
            mid=(first_index+last_index)/2;
        }
        if (first_index>last_index){
            System.out.println("The value is not found: ");
        }

    }
}
