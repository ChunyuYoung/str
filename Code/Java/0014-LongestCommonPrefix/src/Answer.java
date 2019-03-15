public class Answer {
    public String strSubString(String str[]){
        char ch[] = str.toString().trim().toCharArray();
        System.out.println(String.valueOf(ch[str.length]));
        char string[] = new char[ch.length];
        String chStr = "";
        for (int i = 0;i<ch.length;i++){
            for (int j = i+1; j<ch.length;j++){
                if (ch[i] == ch[j])
                    string[j] = ch[j];
                else
                    return "";
            }
        }
        return chStr = string.toString();
    }
}
