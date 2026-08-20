class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        int [] freq = new int [k];

        for(int i : nums){
            count.put(i, count.getOrDefault(i, 0) + 1);

        }

    PriorityQueue<Integer> heap = new PriorityQueue<>(
        (n1, n2) -> count.get(n1) - count.get(n2));

    for (int n : count.keySet()) {
        heap.add(n);
        if (heap.size() > k) heap.poll();
    }

    for(int i = 0; i<k; i++){
        freq[i] = heap.poll();
    }

    return freq;


        
    }
}
