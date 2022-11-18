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
		Queue<Integer> q1 = new Queue<Integer>(5);
		try{
			q1.put(1);
			q1.put(2);
			q1.put(3);
			q1.put(4);
			q1.put(5);
			q1.put(6);
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
