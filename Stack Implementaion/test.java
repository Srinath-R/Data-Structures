package stack;

public class test {

	public static void main(String[] args) {
	stack<Integer> S =new Stack_Array<Integer>();
	System.out.println("Size "+S.size());
	S.push(5);
	S.push(4);
	S.push(8);
	S.push(0);
	S.push(7);
	S.push(10);
	S.push(3);
	S.push(1);
	System.out.println(S.pop());
	System.out.println(S.top());
	S.printStack();
	System.out.println("Size "+S.size());

	}

}
