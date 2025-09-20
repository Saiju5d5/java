public class SplitTest {
     public static void main(String args[]){
        String sentence = "This is my class";
        String words[] = sentence.split(" ");
        for(String word:words){
            System.out.println(word);
        }
    }
}
