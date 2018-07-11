public class Queue {
   int[] arr =new int[3];
   int counter =0;
   int count2 =0;
    public void push(int pushedElement){
       if(counter>=3) System.out.println("overflow condition");
     else arr[counter++]= pushedElement;
    }
    public void pop(){
     //System.out.println(arr[0]);
     for (int i = 0; i <2 ; i++) {
      arr[i] = arr[i+1];
     }
     counter--;
    }
    public void display(){
     for (int i = 0; i <counter ; i++) {
      System.out.println(arr[i]);
     }
    }

}