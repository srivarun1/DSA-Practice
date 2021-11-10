class Solution {
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> solution = new ArrayList();
        permute(solution,nums, new ArrayList<Integer>());
        return solution;
    }
    
    public void permute(List<List<Integer>> solution, int[] nums, ArrayList<Integer> list){
        if(list.size() == nums.length){
            solution.add(copyList(list));
            return;
        }
        
        for(int i = 0 ; i < nums.length; i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
                permute(solution,nums,list);
                list.remove(list.size()-1);
            }
        }
        return;
    }
    
    public List<Integer> copyList(ArrayList<Integer> list){
        List<Integer> copy = new ArrayList<Integer>();
        for(int num : list){
            copy.add(num);
        }
        return copy;
    }
    
    
}