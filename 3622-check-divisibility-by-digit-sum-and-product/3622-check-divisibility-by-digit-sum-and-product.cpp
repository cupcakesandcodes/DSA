class Solution {
public:
    bool checkDivisibility(int n) {
        int sum = 0;
        int mul = 1;
        for (int i = n; i > 0; i /= 10) {
            int rem = i % 10;
            sum += rem;
            mul *= rem;
        }
        return n % (sum + mul) == 0;
    }
};