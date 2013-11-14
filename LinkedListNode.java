import java.io.*;

public class LinkedListNode <T> {
	T element;
	LinkedListNode <T> link;

	public LinkedListNode(T element) {
		this.element = element;
		this.link = null;
	}

	public LinkedListNode(T element, LinkedListNode <T> link) {
		this.element = element;
		this.link = link;
	}
	public T getElement() {
		return element;
	}
	public void setElement(T element) {
		this.element = element;
	}
	public LinkedListNode <T> getLink() {
		return link;
	}
	public void setLink(LinkedListNode <T>link) {
		this.link = link;
	}
}
