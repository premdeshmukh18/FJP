import java.util.Arrays;
public class RemoveDuplicates {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,1,2,5,1,2,4};

        Arrays.sort(arr);

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

        int prev = arr[0];
        int cnt = 1;
        for(int i = 1 ; i < arr.length ;i++){
            if(arr[i]!=prev){
                prev = arr[i];
                cnt++;
            }
        }

        int ans[] = new int[cnt];

        
        int prev2 = arr[0];
        ans[0] = prev2;
        int k = 1;
        
        for(int i = 1 ; i < arr.length ;i++){
            if(arr[i]!=prev2){
                prev2 = arr[i];
                ans[k] = prev2;
                k++;
            }
        }
        System.out.println();
        for(int i = 0 ; i < ans.length ; i++){
            System.out.print(ans[i]+" ");
        }

        



    }
}
