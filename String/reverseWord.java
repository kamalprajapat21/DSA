public class reverseWord{

    public static String ReverseStringSolu(String s){
        String []st = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = st.length-1;i>=0;i--){
            sb.append(st[i]);

            if(i != 0){
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
    public static void main(String []args){
        String s = "a good   example";
        System.out.println(ReverseStringSolu(s));
    }
}