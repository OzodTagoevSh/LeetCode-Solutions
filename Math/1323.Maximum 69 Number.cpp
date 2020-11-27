/*   ////////////////////
	////   1st way  ////
   ////////////////////
*/
class Solution {
public:
    int maximum69Number (int num) {
        vector<int> digit;
        while(num) {
            digit.push_back(num % 10);
            num /= 10;
        }
        int answer = 0, i;
        for(i = digit.size() - 1; i >= 0; i--) {
            if(digit[i] != 9) {
                digit[i] = 9;
                break;
            }
        }
        i = digit.size() - 1;
        while(i >= 0) {
            answer = answer * 10 + digit[i]; 
            i--;
        }
        return answer;
    }
};

/*   ////////////////////
	////   2nd way  ////
   ////////////////////
*/

class Solution {
public:
    int maximum69Number (int num) {
        int firstSix = -1;
        int k = num;
        for(int i = 0; k > 0; i++) {
            if(k % 10 == 6) firstSix = i;
            k /= 10;
        }
        return num + 3 * pow(10, firstSix);
    }
};
