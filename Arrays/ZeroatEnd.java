public class ZeroatEnd{
    public static void main(String[] args) {
        int[] arr = {34,56,12,11,45,67,78,0,323,34,0};
        int somewhere =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                int j = i+1;
                while(j<arr.length && arr[j]<0)
                    j++;
                if(j!=arr.length){
                arr[i] = arr[j];
                arr[j] = 0;
                }
            }
        }

        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }
}