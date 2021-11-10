class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> list = new ArrayList();
        StringBuilder sb = new StringBuilder();
        permute(list, sb, s, 0);
        return list;
    }
    
    public void permute(List<String> list, StringBuilder sb, String s, int pos){
        if(sb.length() == s.length()){
            list.add(sb.toString());
            return;
        }    
        
        if(Character.isAlphabetic(s.charAt(pos))){
            // Small 
            sb.append(Character.toLowerCase(s.charAt(pos)));
            permute(list, sb, s, pos+1);
            sb.deleteCharAt(pos);
            
            sb.append(Character.toUpperCase(s.charAt(pos)));
            permute(list, sb, s, pos+1);
            sb.deleteCharAt(pos);
        } 
        else{
            sb.append(s.charAt(pos));
            permute(list, sb, s, pos+1);
            sb.deleteCharAt(pos);
        }
    }
}