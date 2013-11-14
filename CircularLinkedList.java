import java.io.*;
import java.util.*;

class CircularLinkedList {
	private LinkedListNode <T> front;
	private LinkedListNode <T> rear;
	private String name;
	private int count=0;

	public CircularLinkedList() {
		this.name = "Linked List";
		list = null;
	}

	public CircularLinkedList(String name) {
		front = null;
		rear = null;
	}

	public void enqueue(T element) {
		// add first element
		LinkedListNode <T> newNode = new LinkedListNode<T>(element, list);
		if (rear == null)
  			front = newNode;
     	else
   	   rear = newNode;
		count++;
	}

	//@Override
	public T remove(T element) throws NotFoundError {
            LinkedListNode current = front;
            LinkedListNode previous = null;
            while(!(element.equals(current.getElement()))){
                previous = current;
                current = current.getLink();
            }
            if(current.getLink() == rear.getLink())
                throw new NotFoundError("Does not exist");
            previous.setLink(current.getLink());
    			count--;        
				return element;
	}


	public T pop() {
		T temp = list.getElement();
		list = list.getLink();
		count--;
		return temp;
	}
	public T dequeue()

  {
    if (isEmpty())
      throw QueueUnderFlowException;
    else
    {
      T element;
      element = front.getInfo();
      front = front.getLink();
      if (front == null)
        rear = null;
		count--;
      return element;
    }
  }
	
	public T look() {
		return front.getElement();
		}


	public boolean contains(T element) {
		LinkedListNode<T> current = list;
		if (!isEmpty()) {
			while (current != null) {
				if (current.getElement().equals(element))
					return true;
				current = current.getLink();
			}
		}
		return false;
	}

	public boolean isEmpty() {
		if (list == null)
			return true;
		else
			return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int size() {
		return this.count;
	}

	public String toString() {
		String out = "";
		LinkedListNode<T> temp;
		temp = list;
		while (temp != null) {
			out += temp.getElement() + "\n";
			temp = temp.getLink();
		}
		return out;
	}

}
