public class removeduplicates {
    public static void remove(String str, int idx,StringBuilder newstr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){
            remove(str, idx+1, newstr, map);
        }
        else{
            map[currchar-'a']=true;
            remove(str, idx+1, newstr.append(currchar), map);
        }


        
    }
    public static void main(String[] args) {
        String str="appannacollege";
        int idx=0;
        StringBuilder newstr = new StringBuilder("");
        remove(str, idx, newstr, new boolean[26]);
    }
}
