/**
 * Tester class for many sorts on hardware.
 * @author Drew Fisher
 * @version 6/7/16
*/
public class TestItem{
    public static void printInventory(Item[] in){
        System.out.printf("%-8s %-20s %-8s %-8s \n","itemID", "itemName", "inStore", "price");
        
        for(Item obj : in){
            System.out.println(obj.toString());
        }
        System.out.println();
    }
    public static Item[] sortID(Item[] in, int low, int high){
        if(low == high){
            return in;
        }
        int mid = (high + low)/2;
        sortID(in, low, mid);
        sortID(in, mid+1, high);
        mergeID(in, low, mid, high);
        return in;
    }
    public static Item[] sortName(Item[] in){
        Item[] newOrder = new Item[in.length];
        for(int i = 0; i < in.length; i++){
            int insertAt = 0;
            Item curr = in[i];
            int spot = i;
            curr.setSort(1);
            while(insertAt == 0 && spot >= 1){
                if(curr.compareTo(newOrder[spot-1]) > 0){
                    insertAt = spot;
                }
                else{
                    newOrder[spot] = newOrder[spot - 1];
                }
                spot -= 1;
            }
            newOrder[insertAt] = curr;
        }
        return newOrder;
    }
    public static Item[] sortInStore(Item[] in){
        int k;
        int posmax;
        Item temp;
        
        for(int i = in.length - 1; i >= 0; i--){
            posmax = 0;
            for(k = 0; k <= i; k++){
                if(in[k].getInStore() - in[posmax].getInStore() > 0){
                    posmax = k;
                }
                temp = in[i];
                in[i] = in[posmax];
                in[posmax] = temp;
            }
        }
        return in;
    }
    public static Item[] sortPrice(Item[] in, int low, int high){
        if(low == high){
            return in;
        }
        int mid = (high + low)/2;
        sortPrice(in, low, mid);
        sortPrice(in, mid+1, high);
        mergePrice(in, low, mid, high);
        return in;
    }
    
    public static void mergeID(Item[] in, int low, int mid, int high){
        Item[] temp = new Item[high-low+1];
        int i = low, j = mid + 1, n = 0;
        for(Item obj : in){
            obj.setSort(0);
        }
        while(i <= mid || j <= high){
            if(i > mid){
                temp[n] = in[j];
                j++;
            }
            else if(j > high){
                temp[n] = in[i];
                i++;
            }
            else if(in[i].compareTo(in[j]) > 0){
                temp[n] = in[i];
                i++;
            }
            else{
                temp[n] =in[j];
                j++;
            }
            n++;
        }
        for(int k = low; k <= high; k++){
           in[k] = temp[k - low];
        }
    }
    public static void mergePrice(Item[] in, int low, int mid, int high){
        Item[] temp = new Item[high-low+1];
        int i = low, j = mid + 1, n = 0;
        for(Item obj : in){
            obj.setSort(3);
        }
        while(i <= mid || j <= high){
            if(i > mid){
                temp[n] = in[j];
                j++;
            }
            else if(j > high){
                temp[n] = in[i];
                i++;
            }
            else if(in[i].compareTo(in[j]) < 0){
                temp[n] = in[i];
                i++;
            }
            else{
                temp[n] =in[j];
                j++;
            }
            n++;
        }
        for(int k = low; k <= high; k++){
           in[k] = temp[k - low];
        }
    }
    
    public static void main(String[] args){
        Item[] hardware = {
        new Item("1011", "Air Filters", 200, 10.5),
        new Item("1034", "Door Knobs", 60, 21.5),
        new Item("1101", "Hammers", 90, 9.99),
        new Item("1600", "Levels", 80, 19.99),
        new Item("1500", "Celing Fans", 100, 59),
        new Item("1201", "Wrench Sets", 55, 80)};
        
        System.out.println("Before Sort:");
        printInventory(hardware);
        System.out.println("Sorted by Item ID:");
        printInventory(sortID(hardware, 0, hardware.length-1));
        System.out.println("Sorted by Item Name:");
        printInventory(sortName(hardware));
        System.out.println("Sorted by Number In Store:");
        printInventory(sortInStore(hardware));
        System.out.println("Sorted by Price:");
        printInventory(sortPrice(hardware, 0, hardware.length-1));
    }
}