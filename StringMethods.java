public class StringMethods
{
    public static void main(String[] args)
    {
        // Using literal
        String s1 = "hello";
        String s2 = "How Are You";
        System.out.println(s1);
        System.out.println(s1 + " " + "radha");

        // Using new keyword
        String str1 = new String("java");
        String str2 = new String("java");

        // String Methods
        System.out.println("Length:" + s1.length());
        System.out.println("Uppercase:" + s1.toUpperCase());
        System.out.println("Lowercase:" + s1.toLowerCase());
        System.out.println("Location:" + s2.indexOf("Are"));
        System.out.println("CharacterAt:" + s2.charAt(9));
        System.out.println("HashCode:" + s1.hashCode());
        System.out.println("Concatenate:" + s1.concat(" "+ s2));
        System.out.println("CompareTo:" + str1.compareTo(str2));
        System.out.println("Compare & ignore case:" + str1.compareToIgnoreCase(str2));
        System.out.println("Sequence of characters:" + s1.contentEquals("hello"));
        System.out.println("Equals:" + str1.equals(str2));
        System.out.println("Equals & ignore case:" + str1.equalsIgnoreCase(str2));
        System.out.println("Replace:" + s1.replace("hello" , "Hola"));
        System.out.println("SubString:" + s2.substring(4,11));
        System.out.println("last index of:" + s2.lastIndexOf("java"));
        System.out.println("CharacterAt:" + s2.trim());
        System.out.println("CharacterAt:" + s2.isEmpty());
        System.out.println("CharacterAt:" + s2.valueOf(5000));

    }
}
