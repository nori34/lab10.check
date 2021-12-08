package electionSort;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class testSelectionSort {
	SelectionSort sort = new SelectionSort();
	@Test
	public void test() {
		//testPositive();
		//testNegative();
		//testMixed();
		testDuplicates();
	}

    public testSelectionSort() {
    }





























	
    public void testMixed(){

        /** Test data contains with both positive, negative and zeros **/
    	 int[] arr = new int[]{-7,-10,4,-11,1,0};
         int[] Sortedarr = new int[]{-11,-10,-7,0,1,4};
         sort.basicSelectionSort(arr);
         assert(Arrays.equals(arr,Sortedarr));
    }

    public void testDuplicates(){

        /** Test data contains duplicates **/
    	 int[] arr = new int[]{-7,-10,5,3,-7,3,-11,3,0};
         int[] Sortedarr = new int[]{-11,-10,-7,-7,0,3,3,3,5};
         sort.basicSelectionSort(arr);
         assert(Arrays.equals(arr,Sortedarr));
    }


}
