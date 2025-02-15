public class vowel
{
    public static boolean vowel(String input){
        return input.toLowerCase().matches(".*[aeiou].*");
    }
    public static void main(String args[])
    {
        System.out.println("String passed"+vowel("TV"));
    }
}
