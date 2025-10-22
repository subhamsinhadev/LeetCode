import java.util.ArrayList;
import java.util.HashMap;

public class union {

    public static void main(String[] args) {
        int m=5;
        int n=6;
       int arr1[]={1,2,3,4,5};
       int arr2[]={1,2,3,4,5,6};

        ArrayList<Integer> u=findUnion(arr1, arr2, m, n);
        System.out.print("Union :");
        for (int val : u) {
            System.out.print(val+" ");
            
        }

    }

    static ArrayList<Integer> findUnion(int arr[], int arr2[], int m, int n) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        ArrayList<Integer> Union = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i],0)+1);

        }
        for (int i = 0; i < n; i++) {
            freq.put(arr2[i], freq.getOrDefault(arr2[i],0)+1);


        }
        for (int it : freq.keySet()) {
            Union.add(it);
            
        }
        return Union;

    }
}
