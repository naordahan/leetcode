// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String[] words ={"hello","world","leetcode"};
        String chars ="weldonehoneyr";
        countCharacters(words,chars);
    }
    
    public static int countCharacters(String[] words, String chars){
        Map<Character,Integer> letters = new HashMap<Character,Integer> ();
        for (char name: letters.keySet()) {
            //String key = name.toString();
            //String value = letters.get(name).toString();
            //System.out.println(key + " " + value);
        }        
        for(String word: words)
        {
            int sum= word.length();
            
        }
        //if()

        return 0;
    }
}
