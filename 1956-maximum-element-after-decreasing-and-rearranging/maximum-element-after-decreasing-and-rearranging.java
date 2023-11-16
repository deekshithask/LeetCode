class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int prev=0;
        int n=arr.length;
        Arrays.sort(arr);
        for(int result : arr)
        {
           result=Math.min(result,prev+1);
           prev=result;

        }
         return prev;
    }
   
}