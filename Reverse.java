public class Reverse {
    public static void main(String[] args) {
        int arr[]={5,7,3};
        int l=0,r=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(l<r){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
