public class primeNum {
    public static void main(String[] args){
        int a=8;
        int count =0;
        for(int i =1;i*i<a;i++){
            if(a%i==0){
                count++;
                if((a/i)!=i){
                    count++;
                }
            }
        }
        if(count == 2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
