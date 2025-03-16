import java.util.Stack;


class MinStack {
    

    Stack<StackElemnet> stack = new Stack();

    private class StackElemnet
    {
            private final int value;
            private final int min;
            
        StackElemnet(int value,int min)
        {
            this.value = value;
            this.min = min;
        }
        
        int getMin()
        {
            return this.min;
        }
        int getValue()
        {
            return this.value;
        }
    }

    public MinStack(){
        
    }
    
    public void push(int val)
    {
        if(stack.size() == 0)
        {
            stack.push(new StackElemnet(val,val));   
        }
        else
        {
            int min = Math.min(stack.peek().getMin(),val);
            stack.push(new StackElemnet(val,min));
        }
          
    }
    
    public void pop()
    {
             stack.pop();
    }
    
    public int top()
    {
        return stack.peek().getValue();
        
    }
    
    public int getMin()
    {
       return stack.peek().getMin();
    }
}

