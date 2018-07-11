import java.util.LinkedList;

public class HashTable {
    public static final int ARR_SIZE = 8;
//    public int counter=0;
    public LinkedList<Bucket>[] arr = new LinkedList[ARR_SIZE];
    //hash function

    public int getIndexBelowMaxForKey(String str, int max) {
        int hash = 0;
        for (int i = 0; i < str.length(); i++) {
            hash = (hash << 5) + hash + str.charAt(i);
            hash = hash & hash; // Convert to 32bit integer
            hash = Math.abs(hash);
        }
        return hash % max;
    }

    public static class Bucket {
        //your code is here
        public String value;
        public String key;
    }

    public void insert (String key, String value) {
        //your code is here
        boolean isthere =false;
        int index = getIndexBelowMaxForKey(key, ARR_SIZE);
        Bucket bucket=new Bucket();
        bucket.key=key;
        bucket.value=value;
        if(arr[index]==null){
            LinkedList lk =new LinkedList();
            lk.add(bucket);
            arr[index]=lk;
        }else if(arr[index]!=null){
           LinkedList lk =  arr[index];
            for (int i = 0; i < lk.size(); i++) {
                Bucket buc = (Bucket) lk.get(i);
                if(buc.key==key){
                    isthere = true;
                    buc.value=value;
                    lk.remove(i);
                    lk.add(buc);
                }
            }
          if(!isthere) lk.add(bucket);
           arr[index] =lk;
        }


    }
//    public String retrieve(String key) {
//        // your code is here
//        int index = getIndexBelowMaxForKey(key, ARR_SIZE);
//    }

    public void remove (String key) {
        //your code is here
        int index = getIndexBelowMaxForKey(key, ARR_SIZE);

    }

}