package Stack;

public class stack {

    int size;
    int top;
    int arr [];

    public stack(int size) {
        this.size = size;
        this.arr =  new int[size];
        this.top = -1; // when the stack is empty it doesnt have a top
    }
    public boolean isEmpty() 
    {
        if(top == -1)
        {
            return true;
        }
        return false;

    }

public boolean isfull() 
{
    if (size -1 == top)
    {
        return true;
    }
    return false;
}
public void push(int x)
{
    if (!isfull())
    {
        top++;
        arr[top] = x;
        System.out.println("push element is: " + x);
    }
    else {
    System.out.println(" Stack is full " );
    }
}
public int pop() 
{
    if(!isEmpty())
    {
        int returnval = top;
        top--;
        System.out.println("pop element is: " + arr[returnval]);
    }
    else {
        System.out.println("Stack is empty");
        return -1;
    }
    return size;
   
}
 public int top() 
     {
        return arr[top];
     }
public int min()
{
    int index = 0;
    int min = arr[0];
    for (int i = 1; i < arr.length-1; i++)
    {
       
        if (min > arr[i])
       
        {
            index = i;
            min = arr[i];
           
            

        }
        
       
       

    }
    int temp = arr[top];
    arr[top] = arr[index];
    arr[index] = temp;
     
    if(!isEmpty())
    {
        int returnval = top;
        top--;
        System.out.println("pop element is: " + arr[returnval]);
    }
    else {
        System.out.println("Stack is empty");
        return -1;
    }
    
    return size;
    
}    
    

    public static void main(String[] args) 
    {
        stack obj = new stack(12);
        obj.push(12);
        obj.push(122);
        obj.push(22);
        System.out.println(obj.top());
        obj.pop();

    }
    
}
