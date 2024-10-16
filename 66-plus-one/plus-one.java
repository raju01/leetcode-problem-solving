class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int rem=0;
        int carry=1;
    for(int i=len-1;i>=0;i--){
        int result = digits[i]+carry;
        rem = result%10;
        digits[i]=rem;
        carry = result/10;

    }
    if(carry!=0){
        int newArr[] = new int[len+1];
        newArr[0]=carry;
        for(int i=len-1;i>=0;i--){
            newArr[i+1] =digits[i];
        }
        return newArr;
    }
     
        return digits;
    }
}