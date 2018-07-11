public class Tree {
    Node root =new Node();
    int counter=0;
    boolean res ;

    private class Node {
        int value;
        Tree[] children = new Tree[10];
    }

    public boolean addChild(int val) {
        if(counter>=10) return false;
        Tree child = new Tree();
        child.root.value = val;
       this.root.children[counter++] = child;
       return true;
    }

    public boolean contains(int val) {
//        System.out.println(this.root.value);

        if(this.root.value == val){
            System.out.println(this.root.value);
            res=true;
            return true;}
        if(this.counter ==0) return res ;
        for (int i = 0; i <counter ; i++) {
            System.out.println(res);
            res= this.root.children[i].contains(val);

        }
        if(res){
            System.out.println("res");
            res = false;
            return true;
        }
        System.out.println("here");
        return res;
    }

    public void display() {
        System.out.println(this.root.value);
        if(this.root.children[0] ==null) {}
        else {
            for (int i = 0; i < this.root.children.length; i++) {
                this.root.children[i].display();
            }
        }
    }

}
