// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String[] words ={"hello","world","leetcode"};
        String chars ="weldonehoneyr";
        countCharacters(words,chars);
    }
    
    public static int countCharacters(String[] words, String chars){
        Map<Character,Integer> letters = new HashMap ();
        for (int c = 0; c < chars.length(); c++) 
        {
            letters.compute(chars.charAt(c), (key, value) -> (value == null) ? 1 : value + 1);
        }
        letters.forEach((k,v)->System.out.println(k + " " + v));
//         for(String word: words)
//         {
//             int sum= word.length();   
//         }
        return 0;
    }    
}
