import java.util.*;
class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
        int chainLen = 1;
        int ei = pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>ei){
                chainLen++;
                ei = pairs[i][1];
            }
        }
        return chainLen;
    }
}