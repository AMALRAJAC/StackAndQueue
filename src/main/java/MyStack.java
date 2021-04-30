public class MyStack<K> {
    private final MyLinkedList<K>myLinkedList;


    public MyStack() {
        myLinkedList = new MyLinkedList<>();
    }
    public void push(INode<K>element){
        myLinkedList.add(element);
    }
    public void printStack(){
        myLinkedList.printMyNodes();
    }

}
