class Solution {
    public int largestInteger(int num) {
        char[] newNum = String.valueOf(num).toCharArray();
        
        for(int i=0; i<newNum.length-1; i++) {
            for(int j=i+1; j<newNum.length; j++) {
                if(
                    (((newNum[i]-'0')%2 == 0) && ((newNum[j]-'0')%2 == 0)) ||
                    (((newNum[i]-'0')%2 != 0) && ((newNum[j]-'0')%2 != 0))
                ) {
                    if(newNum[i] < newNum[j]) {
                        char temp = newNum[i];
                        newNum[i] = newNum[j];
                        newNum[j] = temp;
                    }
                }
            }
        }

        return Integer.valueOf(String.valueOf(newNum));
    }
}