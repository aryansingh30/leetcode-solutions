class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l =0;
        int maxlen =0;
        char[] ch = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for(int r=0 ; r<ch.length; r++){
            map.merge(ch[r],1,Integer::sum);

            while(map.get(ch[r])>1){
                map.merge(ch[l],-1,Integer::sum);
                l++;
            }
            maxlen =Math.max(maxlen, r-l+1);
        }
        return maxlen;
    }
}