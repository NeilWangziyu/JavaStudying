public class CharacterUnicode {
    public static void main(String[] args){
        String text = "明日 soft";
        char[] charArray = text.toCharArray();
        StringBuilder builder = new StringBuilder();
        for(char c:charArray){
            builder.append((int)c + " ");
        }
        System.out.println("Unicode is: ");
        System.out.println(builder.toString());
    }
}
