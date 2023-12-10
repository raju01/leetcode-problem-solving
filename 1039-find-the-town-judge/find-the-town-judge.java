class Solution {
    public int findJudge(int n, int[][] trust) {
        int count[] = new int[n+1];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<trust.length;i++){
            count[trust[i][1]]++;
            map.put(trust[i][0],1);
        }
        for(int i=1;i<=n;i++){
            if(!map.containsKey(i)){
                if(count[i]==(n-1))
                  return i;
            }
        }
        return -1;
    }
}