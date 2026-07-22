class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num , map.getOrDefault(num,0)+1);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> a.getValue() - b.getValue());

        int[] ans = new int[k];
        int index= 0;
        for (int i = list.size() - 1; i >= list.size() - k; i--) {
            ans[index++] = list.get(i).getKey();
        }
        return ans;
    }
}
