class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair>minHeap=new PriorityQueue<>((a,b)->Integer.compare(a.freq, b.freq));
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
             minHeap.add(new Pair(entry.getKey(), entry.getValue()));
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        int result []=new int[k];
        int i=0;
        while(!minHeap.isEmpty()){
            result[i++]=minHeap.poll().val;
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
