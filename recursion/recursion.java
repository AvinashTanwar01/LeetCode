// stack overflow :- when the stacks memory overflow due to multiples function getting on hold again and again due to recursion and any other reasons 

// recursion :- when a func call itself and some conditions are met 
//the condition which is met is called Base Condition
public class recursion {
    public static void main(String[] args) {
        int count = 0;  
        f(count);       
    }
    
    public static void f(int count){  
        System.out.println("Count: " + count);
        
        if(count == 3){
            return;  // Base condition - stops recursion
        } else {
            count++;
            f(count);
        }
    }
}