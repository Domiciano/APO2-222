import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(41);
        arr.add(29);
        arr.add(-40);
        arr.add(2);
        arr.add(142);
        arr.add(-22);
        arr.add(37);
        arr.add(-7);
        arr.add(91);
        arr.add(-1);

        Collections.sort(arr);

        int index = binSearchRecursive(arr, -7);
        System.out.println("Encontrado en "+index);


        ArrayList<Integer> exp = new ArrayList<>();
        for(int i=0 ; i<10000000 ; i++){
            exp.add(i);
        }

        int expIndex = binarySearch(exp, 10);
        System.out.println("Encontrado en "+expIndex);

    }

    static int binarySearch(ArrayList<Integer> arr, int goal){
        int loops = 0;
        int left = 0;
        int right = arr.size() - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if (goal < arr.get(mid)) {
                right = mid - 1;
            } else if (goal > arr.get(mid)) {
                left = mid + 1;
            } else {
                System.out.println("Iteraciones: "+loops);
                return mid;
            }
            loops++;
        }
        System.out.println("Iteraciones: "+loops);
        return -1;
    }

    static int binSearchRecursive(ArrayList<Integer> arr, int goal){
        Collections.sort(arr);
        return binSearchRecursive(arr, goal, 0, arr.size()-1);
    }

    static int binSearchRecursive(ArrayList<Integer> arr, int goal, int l, int r){
        //Casos base
        int mid = l + (r-l) / 2;
        if(arr.get(mid) == goal){
            return mid;
        }
        if(l >= r){
            return -1;
        }
        //Llamados recursivos
        if (arr.get(mid) > goal) {
            r = mid-1;
        }else{
            l = mid+1;
        }
        return binSearchRecursive(arr, goal, l, r);
    }

}


