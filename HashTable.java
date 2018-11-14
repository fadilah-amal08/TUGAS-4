import java.util.*;

public class HashTable {

  static String[] array1 = {"C","B","A"};
  static String[] array2 = {"1","2","3"};

  public static void main(String args[]) {

    HashTable h = new HashTable();
    h.put(array1[0], array2[0]);
    h.put(array1[1], array2[1]);
    h.put(array1[2], array2[2]);

    // unsorted keys output
    Iterator it = h.keySet().iterator();
    while (it.hasNext()) {
       String element =  (String)it.next();
       System.out.println(element + " " + (String)h.get(element));
    }

    System.out.println("============");

    // sorted keys output  thanks to T. GUIRADO for the tip!
    Vector v = new Vector(h.keySet());
    Collections.sort(v);
    it = v.iterator();
    while (it.hasNext()) {
       String element =  (String)it.next();
       System.out.println( element + " " + (String)h.get(element));
    }
    /*
    output :
        A 3
        C 1
        B 2
        ============
        A 3
        B 2
        C 1
    */
  }

private String get(String element) {
	// TODO Auto-generated method stub
	return null;
}

private Vector keySet() {
	// TODO Auto-generated method stub
	return null;
}

private void put(String string, String string2) {
	// TODO Auto-generated method stub
	
}
}