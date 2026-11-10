class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        //fixed prefix 3 digit for length of strings
        //next 3 times of lentgh is dedicated for individual strings
        int len = strs.size();
        char [] arr = new char[3];
        for(int i=2;i>=0;i--){
            arr[i]=(char)('0'+len%10);
            len=len/10;
        }
        sb.append(arr); 
        for(String s : strs){
            arr = new char[3];
            len = s.length();
            for(int i=2;i>=0;i--){
            arr[i]=(char)('0'+len%10);
            len=len/10;
            }
            sb.append(arr);
            sb.append(s); 
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        //System.out.println(str);
        List<String> lst = new ArrayList<>();
        int totalLength = Integer.valueOf(str.substring(0,3));
        int start = 3;
        for(int l=0;l<totalLength;l++){
            int strLength = Integer.valueOf(str.substring(start,start+3));
            start+=3;
            int end = start+strLength;
            lst.add(str.substring(start,end));
            start = end;
        }
        
        return lst;

    }
}
