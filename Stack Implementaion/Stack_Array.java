package stack;
import stack.stack;
public class Stack_Array<E> implements stack<E> {
public static final int CAPACITY=20;
private E[] data;
private int t=-1;
public Stack_Array(){
	data = (E[])new Object[ CAPACITY];
}
	@Override
	public int size() {
		
		return t+1;
	}

	@Override
	public boolean isEmpty() {
		
		return t==-1;
	}

	@Override
	public void push(E e) {
		if (t+1 == CAPACITY )
			System.out.println("Stack OverFlow Exception");
		else
		{
			t++;
			data[t]=e;
		}
	}

	@Override
	public E pop() {
		if(t==-1)
		{
			System.out.println("Stack NullPointer Exception");
			return null;
		}
		else
			{E toret=data[t];
	data[t]=null;
	t--;
	return toret;
	}
	}
	@Override
	public E top() {
		if (isEmpty())
		System.out.println("Stack full exception");
		return data[t];
	}

	@Override
	public void printStack() {
		for(int i=0;i<CAPACITY;i++)
		{
			System.out.print("["+data[i]+"] ");
			
		}
		System.out.println(" ");
		
	}

	

}
