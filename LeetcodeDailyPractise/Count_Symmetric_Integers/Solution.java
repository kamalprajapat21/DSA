class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int res = 0;
        for(int num= low;num<=high;num++){
            if(num<100 && num%11 == 0){
                res++;
            }else if(num>=1000 && num < 100000){
                int left = num/1000 + (num%1000)/100;
                int right = (num%100)/10 + num%10;
                if(left == right){
                    res++;
                }
            }
        }
        return res;
    }
}