class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> solution = new HashSet();
        List<List<Integer>> sol = new ArrayList();
        List<Integer> list = new ArrayList();
        Set<Integer> set = new HashSet();
        permute(solution, list, set, nums);
        sol.addAll(solution);
        return sol;
    }
    
    public void permute(Set<List<Integer>> solution ,  List<Integer> list, Set<Integer> set, int[] nums){
        
        if(list.size() == nums.length){
            solution.add(copyOfList(list));
            return;
        }
        
        for(int i = 0 ; i < nums.length; i++){
            if(!set.contains(i)){
                //System.out.println("*************************");
                //System.out.println(set.toString());
                //System.out.println(list.toString());
                set.add(i);
                list.add(nums[i]);
                permute(solution, list, set, nums);
                set.remove(i);
                //System.out.println(list.toString());
                list.remove(list.size()-1);
                //System.out.println(set.toString());
                //System.out.println(list.toString());
                //System.out.println("*************************");
            }
        }
    }
    
    public List<Integer> copyOfList(List<Integer> list){
        List<Integer> copy = new ArrayList();
        for(int num : list) copy.add(num);
        
        return copy;
    }
}