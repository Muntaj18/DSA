class Solution {
    public int fib(int n) {
        if(n==0)
        {
            return 0;
        }else if(n==1)
        {
            return 1;
        }
        int firsterm=0;
        int secondterm=1;

        for(int i=1;i<=n;i++)
        {
            int thirdterm=firsterm+secondterm;
            firsterm=secondterm;
            secondterm=thirdterm;

        }
        return firsterm;
        
    }
}