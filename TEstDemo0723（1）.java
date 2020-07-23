import java.util.Arrays;
public class TEstDemo {

//    public static int[]copyOf(int[] arr){
//        int[] ret = new int[arr.length];
//        for (int i = 0; i <arr.length ; i++) {
//            ret[i] = arr[i];
//        }
//        return ret;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = new int[]{1,2,3,4,5,6,8,7};
//        int[] ret = copyOf(arr);
//        System.out.println(Arrays.toString(ret));
//    }

//    public static boolean ifOrder(int[] arr){
//        for (int i = 0; i <arr.length ; i++) {
//            if(arr[i] > arr[i+1]){
//                return false;
//            }
//        }
//        return true;
//    }

//    public static int[] bubbleSort(int[] arr){
//        int j = arr.length-1;
//        int i = 0;
//        int temp = 0;
//        while(j>0){
//            for (i = 0; i<j ; i++) {
//                if(arr[i] > arr[i+1]){
//                    temp = arr[i];
//                    arr[i] = arr[i+1];
//                    arr[i+1]= temp;
//                }
//            }
//            j--;
//        }
//        return arr;
//    }

//    public static int binarySearch(int[] arr,int key){
//        int left = 0;
//        int right = arr.length-1;
//        int mid = (left + right)/2;
//        while(left <= right){
//            mid = (left + right)/2;
//            if(arr[mid] == key){
//                return mid;
//            } else if(arr[mid] < key){
//                left = mid+1;
//            } else {
//                right = mid-1;
//            }
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = new int[]{1,2,3,4,5,6};
//        System.out.println(binarySearch(arr,5));
//    }

        public static String myString(int[] arr){
            if(arr == null){
                return null;
            }
            StringBuilder str= new StringBuilder("[");
            for (int i = 0; i <arr.length ; i++) {
                if(i < arr.length-1){
                    str.append(arr[i]).append(",");
                } else {
                    str.append(arr[i]);
                }
            }
            str.append("]");
            return str.toString();
        }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        String ret = myString(arr);
        System.out.println(ret);
    }

}
