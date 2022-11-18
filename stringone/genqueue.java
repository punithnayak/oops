interface queue<T>{
	T get()throws queueEmptyException;
	void put(T ele) throws queueFullException;
}
class queueFullException extends Exception{
	public String toString(){
		return "Queue Full";
	}
}
class queueEmptyException extends Exception{
	public String toString(){
		return "Queue Empty";
	}
}
class Queue<T> implements queue<T>{
	T[] q;
	int front;
	int rear;
	int size;
	Queue(int s){
		size = s;
		front = -1;
		rear = -1;
		q = (T[])new Object[size];
	}
	public T get() throws queueEmptyException{
		if(front>rear){
			throw new queueEmptyException();
		}
		else{
			return q[front++];
		}
	}
	public void put(T ele) throws queueFullException{
		if(rear == size -1){
			throw new queueFullException();
		}
		else{
			q[++rear]=ele;
			if(front == -1) front ++;
		}
	}
	void display(){
		for(int i = front;i<=rear;i++){
			System.out.print(q[i]+", ");
		}
		System.out.println();
	}

}
class genqueue{
	public static void main(String[] args){
		Queue<String> q1 = new Queue<String>(5);
		try{
			q1.put("a");
			q1.put("b");
			q1.put("c");
			q1.put("d");
			q1.put("e");
			q1.put("r");
		}
		catch(queueFullException e){
			System.out.println(e);
		}
		q1.display();
		try{
			System.out.println("dequeued : " + q1.get());
			System.out.println("dequeued : " + q1.get());
		}
		catch(queueEmptyException e){
			System.out.println(e);
		}
		q1.display();
		try{
			System.out.println("dequeued : " + q1.get());
			System.out.println("dequeued : " + q1.get());
			System.out.println("dequeued : " + q1.get());
			System.out.println("dequeued : " + q1.get());
		}
		catch(queueEmptyException e){
			System.out.println(e);
		}
	}
}
