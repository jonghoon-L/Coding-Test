class Solution
{
    public int solution(int n, int a, int b)
    {
        int count = 1;
        int newn = 0;
        int limit = 0;
        
        if(a > b) {
            newn = a;
            a = b;
            b = newn;
        }
        
        while(limit == 0) {
            if(((b - a) == 1) && (b % 2 == 0)) {
                limit ++;
            } else {
                count ++;
                if(a % 2 == 1) {
                    a ++;
                }
                if(b % 2 == 1) {
                    b ++;
                }
                a = a / 2;
                b = b / 2;
            }
        }

        return count;
    }
}