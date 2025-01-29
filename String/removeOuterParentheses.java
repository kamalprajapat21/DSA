 class removeOuterParentheses{
    public static String RemoveSolution(String s){
        StringBuilder sb = new StringBuilder();
        int count  = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(count>0){
                    sb.append('(');
                }count++;

            }
            else{
                count--;
                if(count>0){
                    sb.append(')');
                }
            }
        }
        return sb.toString();
    }
    public static void main(String []args){
        String s = "(()())(())";
       
    //    s=Solution(s);
       System.out.println(RemoveSolution(s));
    }
}