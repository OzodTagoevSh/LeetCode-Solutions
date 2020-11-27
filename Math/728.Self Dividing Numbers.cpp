class Solution {
public:
    vector<int> selfDividingNumbers(int left, int right) {
        vector<int> answer;
        for(int i = left; i <= right; i++) {
            int k = i;
            while(k) {
                int m = k % 10;
                if(m == 0 || i % m != 0) break;
                k /= 10;
            }
            if(k == 0) answer.push_back(i);
        }
        return answer;
    }
};
