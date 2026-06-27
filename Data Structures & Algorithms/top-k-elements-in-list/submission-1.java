class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer>minHeap=new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        for(int num:map.keySet()){
           //  minHeap.add(new Pair(entry.getKey(), entry.getValue()));
             minHeap.offer(num);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        int result []=new int[k];
        int i=0;
        while(!minHeap.isEmpty()){
            result[i++]=minHeap.poll();
        }
        return result;
    }
    class Pair{
        int val;
        int freq;
        Pair(int v,int f){
            val=v;
            freq=f;
        }
    }
}
