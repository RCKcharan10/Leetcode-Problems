class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        long num=x;
        long rev=0;
        while(x>0){
            rev=rev*10 + x%10;
            x/=10;
        }
        return num==rev;


        // if(x<0){
        //     return false;
        // }
        // String xt=Integer.toString(x);
        // int l=0;
        // int r=xt.length()-1;
        // while(l<r){
        //     if(xt.charAt(l) != xt.charAt(r)){
        //         return false;
        //     }
        //     l++;
        //     r--;
        // }
        // return true;
    }
}