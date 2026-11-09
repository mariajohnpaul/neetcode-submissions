class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int [] count = new int[2001];
        int offset=1000;
        for(int v : nums){
            count[v+offset]++;
        }
        PriorityQueue<int []> pq = new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
        for(int i=0;i<count.length;i++){
            if(count[i]!=0){
                pq.add(new int[]{count[i],i-offset});
                if(pq.size()>k){
                    pq.poll();
                }
            }
        }
        int [] ans = new int[pq.size()];
        int ind = 0;
        while(!pq.isEmpty()){
            ans[ind]=pq.poll()[1];
            ind++;
        }
        return ans;
    }
}
