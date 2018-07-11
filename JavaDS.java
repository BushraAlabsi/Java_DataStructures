public class JavaDS {
    public static void main(String[] args){
        //stack tester
//        Stack STACK1;
//        STACK1 = new Stack();
//        STACK1.push(23);
//        STACK1.push(11);
//        STACK1.push(2);
//        System.out.println("sth");
//        STACK1.pop();
//        STACK1.pop();
//        STACK1.pop();
//        STACK1.pop();


    //    queue tester
//        Queue QUEUE1;
//        QUEUE1 = new Queue();
//        QUEUE1.push(23);
//        QUEUE1.push(11);
//        QUEUE1.push(2);
//        QUEUE1.push(7);
//
//        QUEUE1.display();
//        QUEUE1.pop();
//        QUEUE1.display();
//        QUEUE1.pop();
//        QUEUE1.display();
//        QUEUE1.pop();
//        QUEUE1.display();
//        QUEUE1.push(23);
//        QUEUE1.display();
//

//
//        //linkedlist teseter
//        LinkedList list = new LinkedList();
//        list.addToTail(5);
//        list.addToTail(2);
//        list.addToTail(-2);
//        System.out.println(list.removeHead()+ " Is the head, and it's been removed");
////        System.out.println(list.getHead()+" This is the new head");
//        list.addToTail(3);
//        list.addToTail(1000);
//        System.out.println(list.contains(1000));
//
//        //tree tester
        Tree tree = new Tree();
        int[] items = {5, 8, 7, 1, 9, 3, 0, 4, 6, 2};
        for (int i : items)
            tree.addChild(i);

        System.out.println("Is it contain 3: " + tree.contains(4));
        System.out.println("Is it contain 3: " + tree.contains(100));

//        tree.display();
//
//
//        //hashtable tester
//        HashTable hashTable = new HashTable();
//        // Put some key values.
//        hashTable.insert("cat","1");
//        hashTable.insert("cat","2");
//        hashTable.insert("dog","3");
//        hashTable.remove("cat");
//        System.out.println(hashTable.retrieve("dog"));
    }

}

