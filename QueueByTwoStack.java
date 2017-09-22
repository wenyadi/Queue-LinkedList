public class QueueByTwoStack {
  LinkedList <Integer> in;
  LinkedList <Integer> out;
  public Solution() {
    // Write your solution here.
    in = new LinkedList <Integer>();
    out = new LinkedList <Integer>();
  }
  
  public Integer poll() {
    move();
    return out.isEmpty() ? null : out.pollFirst();
  }
  
  public void offer(int element) {
    in.addFirst(element);
  }
  
  public Integer peek() {
    move();
    return out.isEmpty() ? null: out.peekFirst();
  }
  
  public int size() {
    return in.size() + out.size();
  }
  
  public boolean isEmpty() {
    return in.size() == 0 && out.size() == 0;
  }
  
  public void move() {
    if(out.isEmpty()) {
      while(!in.isEmpty()) {
        out.offerFirst(in.pollFirst());
      }
    }
  }
}
