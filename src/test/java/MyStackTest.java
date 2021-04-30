import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyStackTest {
    @Test
    public void given3NumberWhenAddedToStackShouldAddNode(){
        MyStack<Integer>myStack=new MyStack<>();
        MyNode<Integer>myFirstNode=new MyNode<>(70);
        MyNode<Integer>mySecondNode=new MyNode<>(30);
        MyNode<Integer>myThirdNode=new MyNode<>(56);
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode<Integer>myNode=myStack.peak();
        myStack.printStack();
        myStack.pop();
        myStack.printStack();
        System.out.println(myStack.peak());
        Assertions.assertEquals(myThirdNode.getKey(),myNode.getKey());


    }
}
