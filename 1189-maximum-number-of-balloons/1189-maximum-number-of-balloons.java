class Solution {
    public int maxNumberOfBalloons(String text) {
          int[] count = new int[26];

        for (char ch : text.toCharArray()) {
            count[ch - 'a']++;
        }
        int cnt=0;
        while(
            count['b'-'a']>=1&&
            count['a'-'a']>=1&&
            count['l'-'a']>=2&&
            count['o'-'a']>=2&&
            count['n'-'a']>=1
        ){
            count['b'-'a']--;
            count['a'-'a']--;
            count['l'-'a']-=2;
            count['o'-'a']-=2;
            count['n'-'a']--;

            cnt++;
        }
        return cnt;
    }
}