class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Comparator<String> myComp = (new Comparator<String>(){
            @Override
            public int compare(String a, String b)
            {
                String[] mine = a.split(" ", 2);
                String[] other = b.split(" ", 2);
                boolean lla = false, llb = false;
                
                if(!Character.isDigit(mine[1].charAt(0))) lla = true;
                if(!Character.isDigit(other[1].charAt(0))) llb = true;
                
                if(lla && llb)
                {
                    return mine[1].compareTo(other[1]) != 0 ? mine[1].compareTo(other[1]) : mine[0].compareTo(other[0]);
                }
                else if(lla)
                {
                    return -1;
                }
                else if(llb)
                {
                    return 1;
                }
                else
                {
                    return 0;
                }
                
            }
            
        });
        Arrays.sort(logs, myComp);
       
        
        return logs;
    }
}