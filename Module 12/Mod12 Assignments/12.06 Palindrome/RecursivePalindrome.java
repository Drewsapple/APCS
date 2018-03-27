public class RecursivePalindrome{
    public RecursivePalindrome(){}
    public boolean check(String in){
        in = simplify(in);
        if(in.length() > 1){
            if(in.charAt(0) == in.charAt(in.length()-1)){
                check(in.substring(1,in.length()-1));
                System.out.println(in.substring(1,in.length()-1));
            }
            else{
                return false;
            }
        }
        else{
            return true;
        }
        return true;
    }
    public String simplify(String in){
        in = in.trim();
        in = in.toLowerCase();
        in = in.replaceAll("\\W","");
        return in;
    }
}