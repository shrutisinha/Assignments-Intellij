/* Create a generic, singly linked list class called SList, which, to keep things simple, does not
* implement the List interface. Each Link object in the list should contain a reference to the
* next element in the list, but not the previous one (LinkedList, in contrast, is a doubly linked
* list, which means it maintains links in both directions). Create your own SListIterator which,
* again for simplicity, does not implement ListIterator. The only method in SList other than
* toString( ) should be iterator( ), which produces an SListIterator. The only way to insert and
* remove elements from an SList is through SListIterator. Write code to demonstrate SList.
*/
package JavaAssignmentDay7.slist;
/**<h3> The Main Class</h3>
*  This code is used to demonstrate SList
*/
public class TestMain {
	/**
	*This <strong>generic </strong>method simplifies print statement.
	*@param s This can be of any type sice T is generic.
	*@return no return
	*/
	static <T>void print(T s){
		System.out.println(s);
	}
	/**
	*<h3>Main method</h3>
	*It carries out various tests to check our SList.
	*@param args not used
	*/
	public static void main(String[] args ){
		SList <String> s = new SList<>();
		SListIterator<String> it = s.iterator();
		print(s);
		print(it);
		it.add("Apple");
		print("Add: Apple");
		print(s);
		it.add("Orange");
		print("Add: Orange");
		print(s);
		it.add("Pineapple");
		print("Add: Pineapple");
		print(s);
		print(it.hasNext()); //false
		it.remove();
		print("Remove nothing");
		print(s);
		SListIterator<String> it1 = s.iterator();
		it1.remove();
		print("Remove: Apple");
		print(s);
		it1.add("Mango");
		print("Add: Mango");
		print(s);
		it1.add("Litchee");
		print("Add: Litchee");
		print(s);
		it1.remove();
		print("Remove: Orange");
		print(s);
		it.add("Banana");
		print("Add: Banana");
		print(s);
		it.add("");
		print("Add:");
		print(s);
		it.add(null);
		print("Add: null");
		print(s);
		it.add("Papaya");
		print("Add: Papaya");
		print(s);
		it.add(6,"Kiwi");
		print("Add: Kiwi");
		print(s);
        it.add(0,"Octopus");
        print("Add: Octopus");
        print(s);
        it.remove(2);
        print("Remove: Litchee");
        print(s);
        it.remove(0);
        print("Remove: Octopus");
        print(s);
		SList<String> sl=new SList<>();
	}
}
