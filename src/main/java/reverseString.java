public class reverseString
{
    static String str="12345";
    public static String reverse(String i) throws IllegalAccessException {
        if(i==null)
        {
            throw new IllegalAccessException("Value is null");
        }
        StringBuilder obj = new StringBuilder();
        char[] chars=i.toCharArray();
        for(int in=chars.length-1; in>=0; in--){
                obj.append(chars[in]);
        }
        return obj.toString();

    }
    public static void main(String args[]) throws IllegalAccessException {
        System.out.println(reverse(str));
    }
}
