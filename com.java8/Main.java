/**
 * Created by himu on 2/26/2018.
 */
public class Main {


    public static void main(String[] args) {


    }

    public void findInPivotedArray(int[] a){
        int n = a.length;
        int p = findPivot(a, 0, n-1);
    }

    private int findPivot(int[] a, int low, int high) {

        if(high < low) return -1;
        if(high == low) return low;

        int mid = (low+high)/2;

        if(mid < high && a[mid] > a[mid+1]){
            return mid;
        }
        if(mid > low && a[mid]<a[mid-1]){
            return mid-1;
        }
        if(a[low] >= a[mid]){
            
        }

return -1;
    }
}
