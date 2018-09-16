public class ThreeNode<E extends Comparable<E>>{
  private E leftItem;
  private E rightItem;

  public ThreeNode(E item1, E item2){
    //add a try catch block to catch errors when input item doesn't have a CompareTo method
    if(item1.compareTo(item2) > 0){
      this.leftItem =  item1;
      this.rightItem = item2;
    }else{
      this.leftItem = item2;
      this.rightItem = item1;
    }
  }
}
