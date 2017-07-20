package JavaAssignmentDay7.slist;
/**
*This contains various functionalities for SList instances without implementing ListInterface. 
*<p>Instances of this class should be created using iterator funcionality of SList for proper functioning.</p>
*@param <T> This implies its a generic class and can work on any type T.
*/
class SListIterator<T> {
	//private int count = 0;
	private Link<T> current;
	private Link<T> header;
	/**
	*This constructor initializes the object to point at the beginning of the list
	*/
	SListIterator(Link<T> header) {
		this.header=header;
	    current = header;
	}
	private SListIterator(){}
	/**
	* Shows whether there are more elements in the list while moving in forward direction
	*@return true if this list iterator has more elements when traversing the list in the forward direction. 
	*/
	boolean hasNext() {
		return (current.next != null);
	}
	/**
	* Returns the next element in the list and advances the cursor or iterator position.
	* @return next element in the list.
	*/
	Link<T> next() {
		if(this.hasNext()){
			current = current.next;
			return current;
		}
		return null;
	}
	/**
	*Inserts the specified element into the list. The element is inserted immediately before the next element that
	* would be returned by next(), if any. If there is no next element then inserts at the end of the list. If the
	* list contains no elements, the new element becomes the sole element on the list.
	*@param item Link that has to be added.
	*/
	void add(T item) {
		if(item==null){
		    return;
        }
		current.next = new Link<>(item, current.next);
		current = current.next;
		//count++;
	}

	/**
	 * Insert an item at the specified index in the list.
	 * @param index Specifies where the item should be inserted
	 * @param item The item to be inserted.
	 */
	void add(int index,T item){
        if(item==null || index<0){
            return;
        }
	    Link<T> tmp = header;
        int i;
	    for(i=0;(i<index) && (tmp.next!=null);i++){
	        tmp=tmp.next;
        }
        if(i+2<=index){
	        return;
	        //throw new IndexOutOfBoundsException();
        }
        tmp.next = new Link<>(item, tmp.next);
	}
	/**Removes next element in the list as pointed by the iterator. If no next element it does nothing
	*/
	void remove() {
		if(current.next != null) {
			current.next = current.next.next;
			//count--;
		}
	}

	/**
	 * Removes element at the specified index from the list
	 * @param index The index of element that should be removed
	 */
	void remove(int index){
        Link<T> tmp = header;
        int i;
        for(i=0;(i<index) && (tmp.next.next!=null);i++){
            tmp=tmp.next;
        }
        if(i+1<=index){
            return;
            // throw new IndexOutOfBoundsException();
        }
        tmp.next=tmp.next.next;
	}
}


/**
*This forms the nodes of SList. Each Link object in the list contains information about itself and a reference
* to the next element in the list.
*/
class Link<T>{
	T item;
	Link<T> next;
	Link(T item, Link<T> next) { 
		this.item = item;
		this.next = next; 
	}
	Link(T item) {
		this(item, null);
	} 
	Link(){
		this(null,null);
	}	
	/**
	*It is used everytime we need a string represantaion of Object,
	*@return Information about calling object.
	*/
	public String toString() {
		if(item == null) return "null";
		return item.toString();

	}

}
