import java.util.Arrays;

public class Stack {
	public int[] arr =new int[3];
 	public int counter =0;
    //your code is here
    public void push(int pushedElement){
       //your code is here
    if(counter>=3){
    	//arr=Arrays.copyOf(arr,counter*2);
        System.out.println("overflow condition");
    }
    arr[counter]=pushedElement;
    counter++;	
    
    }
    public void pop() {
        //your code is here
    	if(counter>0){
    	    counter--;
            System.out.println(arr[counter]);
        }
        else
        System.out.println("underflow condition");
    }

    public static void main(String[] args) {

    }

}