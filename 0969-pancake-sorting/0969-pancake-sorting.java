class Solution {
    public void flip(int[] arr,int n){
        int i=0;
        int j=n;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            
            i++;
            j--;
        }
    }
    public int findLarge(int[] arr,int n)
    {
        int index=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>arr[index])
            {
              index=i;  
            }
            
        }
        return index;
    }
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> result=new LinkedList<>();
        int n=arr.length;
        
        for(int i=n;i>1;i--)
        {
            int index=findLarge(arr,i);
            flip(arr,index);
            result.add(index+1);
            
            flip(arr,i-1);
            result.add(i);
            
        }
        return result; 
    }
}