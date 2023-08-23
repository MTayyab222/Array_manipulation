public class insertion {
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        int []new_arr=new int [arr.length+1];
        int index_num=2;
        int new_value=10;
        for(int i=0;i<index_num;i++)
        {
            new_arr[i]=arr[i];
        }
        new_arr[index_num]=new_value;
        for (int i=index_num+1;i<new_arr.length;i++)
        {
            new_arr[i]=arr[i-1];
        }
        System.out.print("Original array: ");
        for (int num:arr)
        {
            System.out.print(" "+num);
        }
        System.out.print("\n"+"New array: ");
        for (int num1:new_arr)
        {
            System.out.print(" "+num1);
        }
    }
}
