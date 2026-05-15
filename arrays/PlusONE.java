public class PlusONE {
    public static void main(String[] args) {
        int[] arr= {9,9,9};
        int[] result = optimal(arr);
        for(int n:result){
            System.out.println(n);
        }
    }
    public static int[] optimal(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]<9){
                arr[i]++;
                return arr;
            }

            arr[i]=0;
        }

        int[] result= new int[arr.length+1];
        result[0]=1;
        return result;
    }
}
