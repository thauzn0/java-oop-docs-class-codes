import java.util.Iterator;
/** A class implementing a linked list */
public class LinkedList<K> implements Iterable<K>{
  /** the first node of the linked list */
  private LLnode<K> firstNode;
  
  /** Create an empty linked list */
  public LinkedList() {
    firstNode = null;
  }
  
  /** Retrieve the first node of the list */
  protected LLnode<K> getFirstNode() {
    return firstNode;
  }
  
  /** Change the first node of the list */
  protected void setFirstNode(LLnode<K> node) {
    firstNode = node;
  }
  
  /** 
   * Is the list empty?
   * @return true if the list contains no nodes
   */
  public boolean isEmpty() {
    return getFirstNode() == null;
  }
  
  /**
   * Add an element to the front of the linked list
   * @param element the element to add
   */
  public void addToFront(K element) {
    setFirstNode(new LLnode<K>(element, getFirstNode()));
  }
  
  /**
   * Print the contents of the linked list
   */
  public static <S> void printList1(LinkedList<S> list){
    //first node
    LLnode<S> nodeptr = list.getFirstNode();
    //loop from first node
    while(nodeptr != null){
      S e = nodeptr.getElement();
      System.out.println(e.toString()+"");
      nodeptr = nodeptr.getNext();
    }
  }
  
/** 
   * Print the contents of the input linked list (a static method)
   * An example of the generic type wildcard
   * @param list a linked list
   */
  public static void printList2(LinkedList<?> list){
    //first node
    LLnode<?> nodeptr = list.getFirstNode();
    //loop from first node
    while(nodeptr != null){
      Object e = nodeptr.getElement();
      System.out.println(e.toString()+"");
      nodeptr = nodeptr.getNext();
    }
  }
  
    /**
   * Return an iterator for this linked list
   * @return an iterator for the list
   */
  public Iterator<K> iterator(){
    LinkedListIterator<K> iter = new LinkedListIterator<K>(getFirstNode());
    return iter;   
  }
  
  public void printList3(){
    Iterator<K> it = iterator();
    while(it.hasNext()){
      System.out.println(it.next()+" ");
    }
  }
  
}