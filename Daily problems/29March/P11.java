//  String question - Remove all characters from string except alphabets
class GFG 
{
    static void removeSpecialCharacter(String s)
    {
        for (int i = 0; i < s.length(); i++)

        {
             if (s.charAt(i) < 'A' || s.charAt(i) > 'Z' &&
                 s.charAt(i) < 'a' || s.charAt(i) > 'z') 
                 { 
                    s = s.substring(0, i) + s.substring(i + 1);
                    i--;
                    }
        }

        System.out.print(s);

    }
    public static void main(String[] args)
    {
        String s = "$Gee*k;s..fo, r'Ge^eks?"; 
        removeSpecialCharacter(s);

    } 
}