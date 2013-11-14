interface Queue implements Iterator {
	void enqueue(T element);
	int size();
	boolean hasNext();
	T dequeue();
	void remove();
	T next();
}