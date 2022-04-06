package main;

public class BonusBinarySearch {

    /**
     * A binary search implementation for integer arrays.
     *
     * Info about binary search: https://www.geeksforgeeks.org/binary-search/
     *
     * @param sortedNumbers - must be sorted from least to greatest
     * @param n - number to search for
     * @return index of search item if it's found, -1 if not found
     */
    public static int binarySearch(int[] sortedNumbers, int n) {
        int right = sortedNumbers.length - 1;
        int left = 0;
        while (right >= left) {
            int mid = ((right - left) / 2)+left;
            if (sortedNumbers[mid] > n) {
                right = mid;
            } else if (sortedNumbers[mid] < n) {
                left = mid;
                if(right-left <= 1){
                    if(right == sortedNumbers.length-1){
                        left = right;
                    } else {
                        break;
                    }
                }
            } else {
                return mid;
            }
        }
        return -1;
    }

}
