package stack;

 import java.util.Scanner;
     
    public class StackFinal2 {
     
    	/**
    	 * @param args
    	 */
    	public static void main(String[] args) {
    		
    		Scanner scan = new Scanner(System.in);
    		CapacityGetterSetter getset = new CapacityGetterSetter();
    		int testcases = Integer.parseInt(scan.nextLine());
    		int stacksize = Integer.parseInt(scan.nextLine());
    		getset.setCapacity(stacksize);
    		stack<Integer> S = new StackArray<Integer>();
    		int inputs = Integer.parseInt(scan.nextLine());
     
    		while (inputs >0) {
    			String operation = scan.nextLine();
    			String[] temp = operation.split(" ");
    			if (temp[0].equals("S"))
    				System.out.println(S.size());
    			if (temp[0].equals("I"))
    				System.out.println(S.isEmpty());
    			if (temp[0].equals("P")){
    				S.push(Integer.parseInt(temp[1]));
    				
    				
    			}
    			if (temp[0].equals("O")){
    				System.out.println(S.pop());
    				S.printStack();
    			}
    			if (temp[0].equals("T"))
    				System.out.println(S.top());
    			inputs--;
    			
    				
    			}
    		}
     
    	}
    }
