import java.util.*;

public class PigLatinTranslator 
{
    private String punctuation;
    String last = "";
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the sentence you would like to translate: ");
        PigLatinTranslator translate = new PigLatinTranslator();
        while(scan.hasNext())
        {
            String word = scan.next();
            String punctuated = translate.punctuation(word);
            String substring;
            if(word.charAt(word.length() - 1) == '.' || word.charAt(word.length() - 1) == ',')
            {
                substring = translate.makeSubstring(punctuated);
            }
            else
            {
                substring = translate.makeSubstring(word);
            }
            System.out.print(substring + " ");
        }
    }
    public boolean isConsenant(char c)
    {
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public String punctuation(String str)
    {
        if(str.charAt(str.length() - 1) == '.' || str.charAt(str.length() - 1) == ',')
        {
            last = str.substring(str.length() - 1);
            punctuation = str.replace(last, "");
        }
        else
        {
            punctuation = str;
        }
        return punctuation;
    }
    public String makeSubstring(String str)
    {
        int x = 0;
        while(isConsenant(str.charAt(x)))
        {
            x++;
        }
        if(x == 0)
        {
            return str + "yay" + last;
        }
        else
        {
            String substr1 = str.substring(0, x);
            String substr2 = str.substring(x);
            return substr2 + substr1 + "ay" + last;
        }
    }
}
