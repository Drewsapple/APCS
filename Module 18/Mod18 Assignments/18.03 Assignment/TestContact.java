/**
 * Tester class for searches and sorts of multiple varieties.
 * @author Drew Fisher
 * @version 6/9/16
*/
public class TestContact{
    public static void main(String[] args){
        Contact [] myContacts={
            new Contact("John Carter", "brother", "Mar 3", "(342) 555‐7069", "jcarter@carter.com"),
            new Contact("Elise Carter", "mom", "Apr 19", "(342) 555‐7011", "carterMom@carter.com"),
            new Contact("Ellie Carter", "me", "Jun 10", "(342) 555‐8102", "ecarter@carter.com"),
            new Contact("Sue Ellen", "friend", "Mar 9", "(341) 555‐9182", "susieE@hotmail.com"),
            new Contact("Frank Carter", "dad", "Dec 1", "(342) 555‐7011", "carterDad@carter.com"),
            new Contact("Johnnie", "friend", "Jan 21", "(341) 555‐7789", "jDawg5555@yahoo.com")
        };
        
        printContacts(myContacts);
        myContacts = sortByName(myContacts);
        findByName(myContacts,"Johnnie");
        findByName(myContacts,"Sam Parker");
        findByRelation(myContacts,"friend");
        findByRelation(myContacts, "Aunt");
        findByMonth(myContacts, "May");
        findByMonth(myContacts, "Mar");
        findByPhone(myContacts, "(333) 555‐8989");
        findByPhone(myContacts, "(342) 555‐7011");
        myContacts = sortByEmail(myContacts);
        findByEmail(myContacts, "rgoodman@hotmail.com");
        findByEmail(myContacts, "susieE@hotmail.com");
    }
    public static void printContacts(Contact[] in){
        for(Contact c : in){
            System.out.println(c.toString());
        }
        System.out.println();
    }
    public static Contact[] sortByName(Contact[] in){
        int k;
        int posmax;
        Contact temp;
        
        for(int i = in.length - 1; i >= 0; i--){
            posmax = 0;
            for(k = 0; k <= i; k++){
                if(in[k].getName().compareTo(in[posmax].getName()) > 0){
                    posmax = k;
                }
                temp = in[i];
                in[i] = in[posmax];
                in[posmax] = temp;
            }
        }
        return in;
    }
    public static void findByName(Contact[] in, String lookFor){
        System.out.println("Search - Name - " +lookFor);
        int high = in.length;
        int low = -1;
        int probe;
        while ( high - low > 1 ){
            probe = ( high + low ) / 2;
            if(in[probe].getName().compareTo(lookFor) > 0){
                high = probe;
            }
            else{
                low = probe;
                if(in[probe].getName().compareTo(lookFor) == 0){
                    break;
                }
            }
        }
        if((low >= 0) && (in[low].getName().compareTo(lookFor) == 0 )){
            System.out.println(in[low]);
        }
        else{
            System.out.println("Not found.");
        }
        System.out.println();
    }
    public static void findByRelation(Contact[] in, String lookFor){
        int numFound=0;
        System.out.println("Search - Relation - " +lookFor);
        for(int i = 0; i < in.length; i++){
            if(in[i].getRelation().equalsIgnoreCase(lookFor)){
                numFound++;
                System.out.println(in[i]);
            }
        }
        if(numFound != 0){
            System.out.println("Total Instances Found: "+numFound);
        }
        else{
            System.out.println("There are no lisitngs for " + lookFor);
        }
        System.out.println();
    }
    public static void findByMonth(Contact[] in, String lookFor){
        int numFound=0;
        System.out.println("Search - Month - " +lookFor);
        for(int i = 0; i < in.length; i++){
            if(in[i].getBday().substring(0,3).equalsIgnoreCase(lookFor)){
                numFound++;
                System.out.println(in[i]);
            }
        }
        if(numFound != 0){
            System.out.println("Total Instances Found: "+numFound);
        }
        else{
            System.out.println("There are no lisitngs for " + lookFor);
        }
        System.out.println();
    }
    public static void findByPhone(Contact[] in, String lookFor){
        int numFound=0;
        System.out.println("Search - Phone - " +lookFor);
        for(int i = 0; i < in.length; i++){
            if(in[i].getPhone().equalsIgnoreCase(lookFor)){
                numFound++;
                System.out.println(in[i]);
            }
        }
        if(numFound != 0){
            System.out.println("Total Instances Found: "+numFound);
        }
        else{
            System.out.println("There are no lisitngs for " + lookFor);
        }
        System.out.println();
    }
    
    public static Contact[] sortByEmail(Contact[] in){
        int k;
        int posmax;
        Contact temp;
        
        for(int i = in.length - 1; i >= 0; i--){
            posmax = 0;
            for(k = 0; k <= i; k++){
                if(in[k].getEmail().compareTo(in[posmax].getEmail()) > 0){
                    posmax = k;
                }
                temp = in[i];
                in[i] = in[posmax];
                in[posmax] = temp;
            }
        }
        return in;
    }
    public static void findByEmail(Contact[] in, String lookFor){
        System.out.println("Search - Email - " +lookFor);
        int high = in.length;
        int low = -1;
        int probe;
        while ( high - low > 1 ){
            probe = ( high + low ) / 2;
            if(in[probe].getEmail().compareTo(lookFor) > 0){
                high = probe;
            }
            else{
                low = probe;
                if(in[probe].getEmail().compareTo(lookFor) == 0){
                    break;
                }
            }
        }
        if((low >= 0) && (in[low].getEmail().compareTo(lookFor) == 0 )){
            System.out.println(in[low]);
        }
        else{
            System.out.println("Not found.");
        }
        System.out.println();
    }
}