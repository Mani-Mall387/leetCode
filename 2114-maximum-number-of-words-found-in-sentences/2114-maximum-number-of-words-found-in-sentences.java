class Solution {
    public static int countWord(String sentence){
        int len= sentence.length();
        int count=0;
        for(int i=0;i<len;i++){
            if(sentence.charAt(i)==' ' ){
                count++;
            }
        }
        return count;
    }
    public int mostWordsFound(String[] sentences) {
        int ans=0;
        int len=sentences.length;

        for(int i=0; i<len ;i++){
            int temp=countWord(sentences[i]);
           if( temp > ans){
            ans=temp;
           } 

        }

        return ans+1;
        
    }
}