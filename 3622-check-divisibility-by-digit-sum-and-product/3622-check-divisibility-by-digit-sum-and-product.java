class Solution {
    public boolean checkDivisibility(int n) {
        int temp= n;
        int sum=0;
        int prod=1;
        while(temp>0){
            int x=temp%10;
            sum=sum+x;
            prod=prod*x;
            temp=temp/10;

        }
        int endsum=sum+prod;
        if(n%endsum==0){
            return true;
        }
        else{
            return false;
        }
    }
}