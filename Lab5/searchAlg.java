import java.util.ArrayList;

public class searchAlg {
    public boolean recursiveBinarySearch( ArrayList<Integer> arrayList, int first, int last, int test) 
    { 
        if (last >= first) { 
            int middleElement = first + (last - first) / 2; 
            if (arrayList.get(middleElement) == test) 
                return true; 
            if (arrayList.get(middleElement) > test){
                return recursiveBinarySearch(arrayList, first, middleElement - 1, test);
            }
            return recursiveBinarySearch(arrayList, middleElement + 1, last, test); 
        }   
        return false; 
    }
}
