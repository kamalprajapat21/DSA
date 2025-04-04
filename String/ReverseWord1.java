class ReverseWord1{
    public static String reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
    public static void main(String[]args){
        String str = "edcba";

       System.out.println( reverse(str));
    }
}