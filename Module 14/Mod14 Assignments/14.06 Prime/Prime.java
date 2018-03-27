import java.util.ArrayList;

public class Prime{
    private int limit;
    public Prime(int limit){
        this.limit = limit;    
    }
    public ArrayList<Integer> primes(){
        ArrayList primeList = new ArrayList();
        for(int i=1;i<=limit;i++){
            if(checkPrime(i)){
                primeList.add(i);
            }
        }
        return primeList;
    }
    public Boolean checkPrime(int num){
        for(int i=2;i<(num/2)+1;i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}