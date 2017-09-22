public class StackWithMin {
  private LinkedList<Integer> stack;
  private LinkedList<Integer> minStack;
  public Solution() {
    // write your solution here
    stack = new LinkedList<Integer>();
    minStack = new LinkedList<Integer>();
  }
  
  public int pop() {
    if(stack.isEmpty()) {
      return -1;
    }
    Integer result = stack.pollFirst();
    if(minStack.peekFirst().equals(result)) {
      minStack.pollFirst();
    }
    return result;
  }
  
  public void push(int element) {
    stack.offerFirst(element);
    if(minStack.isEmpty()||element <=minStack.peekFirst()) {
      minStack.push(element);
    }
    
  }
  
  public int top() {
    if(stack.isEmpty()){
      return -1;
    }
    return stack.peekFirst();
  }
  
  public int min() {
    if(minStack.isEmpty()) {
      return -1;
    }
    return minStack.peekFirst();
  }
}
