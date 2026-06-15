
class BinarySearch {
    public static int Binary(int arr[],int element){
        
        int left=0;
        int  right=arr.length-1;

while(left<=right){

        int mid=left+(right-left)/2;

        if(arr[mid]==element){
            return mid;
        }
        else if(arr[mid]<element){
            left=mid+1;
        }
        else{
            right=mid-1;
        }}
        return -1;
        
}
    
    public static void main(String[] args) {
        
        int arr[]={10,20,30,40};
        int element=20;
        int result=Binary(arr,element);
        System.out.println("Index"+result);
     }
    }
     
     
     
     
     
     
