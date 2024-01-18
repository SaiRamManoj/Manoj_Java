public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {34,56,12,11,45,67,78,43,323,34,43};
        int rotatePlace = 2;
        int rotatedArray[] = new int[arr.length];
        int index=0;
        for(int i=rotatePlace;i<arr.length;i++){
            rotatedArray[i]=arr[index];
            index++;
        }
        for(int i=0;i<rotatePlace;i++){
            rotatedArray[i]=arr[index];
            index++;
        }

        for(int i=0;i<rotatedArray.length;i++)
        System.out.print(rotatedArray[i]+" ");
    }
}
