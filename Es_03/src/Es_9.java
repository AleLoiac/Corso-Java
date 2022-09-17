import java.util.Arrays;

public class Es_9 {
    public static void main(String[] args) {

        //test1

        int [] nums1 = {1,2,3,0,0,0} ;
        int m = 3;
        int [] nums2 = {2,5,6};
        int n = 3;

        //test2

        //int [] nums1 = {1} ;
        //int m = 1;
        //int [] nums2 = {};
        //int n = 0;

        //test3

        //int [] nums1 = {0} ;
        //int m = 0;
        //int [] nums2 = {1};
        //int n = 1;

        merge(nums1, m, nums2, n);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        //nums1 = new int [m+n];
        //nums2 = new int [n];
        int j = 0;

        for (int i=0; i<nums1.length; i++){
            if (nums1[i]==0){
                nums1[i] = nums2[j];
                j++;
            }

        }
        //quick sort
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

//    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        int[] tempNums1 = nums1;
//        nums1 = new int[m+n];
//
//        int value;
//        for(int counter = 0, nums1Position = 0, nums2Position = 0; counter < m+n; counter++){
//            //In case one of them reaches the end
//            if(nums1Position >= m){
//                nums1[counter] = nums2[nums2Position++];
//                continue;
//            }
//            if(nums2Position >= n){
//                nums1[counter] = tempNums1[nums1Position++];
//                continue;
//            }
//            value = Math.min(tempNums1[nums1Position], nums2[nums2Position]);
//            if(value == tempNums1[nums1Position]){
//                nums1[counter] = value;
//                nums1Position++;
//            }else if(value == nums2[nums2Position]){
//                nums1[counter] = value;
//                nums2Position++;
//            }
//        }
//        System.out.println(Arrays.toString(nums1));
//    }

}
