class Solution {
    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        Map<Integer, List<Integer>> processTree = new HashMap();
        Queue<Integer> breadthFirstQueue = new LinkedList();
        breadthFirstQueue.add(kill);
        List<Integer> killedProcesses = new ArrayList();
        
        for(int i = 0 ; i < ppid.size();i++)
        {
            processTree.putIfAbsent(ppid.get(i), new LinkedList<Integer>());
            processTree.get(ppid.get(i)).add(pid.get(i));
        }
        
        while(!breadthFirstQueue.isEmpty())
        {
            int killed = breadthFirstQueue.poll();
            killedProcesses.add(killed);
            if(processTree.containsKey(killed))
                breadthFirstQueue.addAll(processTree.get(killed));
        }
        return killedProcesses;
    }
}