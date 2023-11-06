public class SmallestMissingNumber {
    public static void main(String[] args) {
        
        // considering sorted array
        int[] arr = {1,4,5,6,7};
        int ans = -1;
        for(int i=arr[0];i<arr[arr.length-1];i++){
            boolean flag = false;
            for(int k = 0 ; k < arr.length ; k++){
                if(i==arr[k]){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                ans = i;
                break;
            }
        }

        System.out.println("Smallest Missing Element is :"+ans);
    }
}
