import java.util.Arrays;
public class MyClass{
    public static void main(String args[]){
        int arr[] = {65,76,32,2,4,1,67,34,98,96};

        for(int i = arr.length()-1;i>1;i++){
            for(int j =0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static swap(int arr[],int n1,int n2){
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
}