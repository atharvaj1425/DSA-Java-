public class reverseWords2 {
    public String reverseWords(String s) {
        s = s+" ";
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=' '){
                word.append(s.charAt(i));
            }
            else{
                result.append(word.reverse() + " ");
                word.setLength(0);
                // if(i==s.length()-1){
                //     result.append(word.reverse());
                // }
                // else{
                //     result.append(word.reverse() + " ");
                //     word.setLength(0);
                // }    
            }
        }
        return result.toString().trim();
    }
}
