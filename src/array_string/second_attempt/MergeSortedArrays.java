package array_string.second_attempt;

public class MergeSortedArrays {
    public static void  SortNonDecensdingArrays(int[] a1, int m, int[] a2,int n ){
        int m1 = m - 1;
        System.out.println("m length: " + m1);

        int n2 = n - 1;
        System.out.println("n length: " + n2);
        int k = a1.length -1;
        while(k>0){
            if(a1[m1]>a2[n2]){
                a1[k] = a1[m1];
                m1--;
                --k;
            }else{
                a1[k] = a2[n2];
                --k;
                --n2;
            }
        }
        for (int i: a1) {
            System.out.println(i);
        }
    }
    }

class Run{
    public static void main(String[] args) {
        int[] a1 = {1,4,5,6,7,0,0,0};
        int[] a2 = {2,4,5};
        int m = 5;
        System.out.println("M1 LÀ: "+ m);
        int n = a2.length;
        MergeSortedArrays.SortNonDecensdingArrays(a1,m,a2,n);

    }
}
