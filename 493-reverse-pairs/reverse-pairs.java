class Solution {

    public int reversePairs(int[] nums) {
       return mergeSort(nums,0,nums.length-1);
        
    }
    int countPairs(int[] arr,int low,int mid,int high){
        int right=mid+1;
        int count=0;
         for(int i=low;i<=mid;i++){
            while(right<=high &&(long) arr[i]>2L*arr[right])right++;
            count+=(right-(mid+1));
         }
         return count;
    }
           int mergeSort(int arr[], int l, int r) {
        // code here
        int count=0;
        if(l>=r){
            return 0;
        }
        int mid=(l+r)/2;
        count+=mergeSort(arr,l,mid);
        count+=mergeSort(arr,mid+1,r);
        count+=countPairs(arr,l,mid,r);
        combine(arr,l,mid,r);
        return count;
    }
   
    void combine(int[] arr,int l,int mid,int high){
        ArrayList<Integer> list=new ArrayList<>();
        int left=l,right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<arr[right]){
                list.add(arr[left]);
                left++;
            }
            else{
                list.add(arr[right]);
                right++;
            }
        }
            while(left<=mid){
                list.add(arr[left]);
                left++;
            }
            while(right<=high){
                list.add(arr[right]);
                right++;
            }
            for(int i=l;i<=high;i++){
                arr[i]=list.get(i-l);
            }
        }
    }
