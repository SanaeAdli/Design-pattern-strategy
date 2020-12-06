    public class Test {

    public static void main(String args[])  {
        
        
        int[] array = {1, 2, 3, 4, 5 };
        Context ctx = new Context(new BubbleSort());
        ctx.arrange(array);
        ctx.displayTab(array);
        ctx = new Context(new QuickSort());
        ctx.arrange(array);
        ctx.displayTab(array);
    
    }
}
