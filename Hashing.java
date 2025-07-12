import java.util.HashSet;
import java.util.Iterator;

public class Hashing{

    public static void main(String args[]){
    //creating a hash set
    HashSet<Integer> set = new HashSet<>();
    // insert
    set.add(1);
    set.add(2);
    set.add(4);
    set.add(0);
    
    if(set.contains(2)){
        System.out.println("Set contains 2");
    }
    if (!set.contains(5)){
        System.out.println("Set does not contains 5");
    }
    // set.remove(4);
    // set.remove(1);

    System.out.println("Size of set is: "+ set.size());

    //prints all the elements
    
    System.out.println("Print all elements: "+ set);

    //iterator
    Iterator it= set.iterator();
    //has next function it checks if there is a next element
    System.out.println("");

while(it.hasNext()){
    System.out.print(it.next()+" ");
      }

    }
}