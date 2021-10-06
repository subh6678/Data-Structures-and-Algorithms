//simple implementation of how stack works
class StackX {
	private int maxSize;
	private double[] stackArray;
	private int top;
	
	public StackX(int maxSize) {
		
		this.maxSize = maxSize;
		this.stackArray = new double[maxSize];
		this.top = -1;
		
	}
	
	
	public void push(double num) {
		if(top == maxSize -1)
			System.out.println("Stack isfull");
		else
			stackArray[++top] = num;
		
	}
	public double pop() {
		if(top == -1) {
			return -99;
		}
		else {
			return stackArray[top--];
		}

	}
	public double peek() {
		if(top == -1)
			return -99;
		else {
			return stackArray[top];
		}

	}
	
	
}

public class stackImplementation {

	public static void main(String[] args) {
		StackX obj = new StackX(4);
		
		obj.push(5);
		obj.push(4);
		obj.push(7);
		
		System.out.println(obj.peek());
		double x = obj.pop();
		System.out.println(obj.peek());

	}

}
