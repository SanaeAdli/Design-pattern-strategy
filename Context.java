public class Context{
    private final Strategy strategy;

    public void SetStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void arrange(int[] input) {
        strategy.sort(input);
    }
     static void displayTab(int[] tab)
   {    
        for(int i=0; i < tab.length; i++)
        {
                System.out.print(tab[i] + " ");  
        }
        System.out.println();
   }
}
