package electionSort;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class testSelectionSort {
	SelectionSort sort = new SelectionSort();
	@Test
	public void test() {




	}

    public testSelectionSort() {
    }

		public void testPositive(){
		        int[] arr = new int[5];
		        arr[0] = 8;
		        arr[1] = 9;
		        arr[2] = 7;
		        arr[3] = 10;
		        arr[4] = 2;

		        int[] Sortedarr = new int[5];
		        Sortedarr[0] = 2;
		        Sortedarr[1] = 7;
		        Sortedarr[2] = 8;
		        Sortedarr[3] = 9;
		        Sortedarr[4] = 10;

		        /** add tests to check for this unit test **/
		        sort.basicSelectionSort(arr);
		        assert(Arrays.equals(arr,Sortedarr));
		    }

		    public void testNegative(){

		        /** Test data contains negative values only **/
		    	  int[] arr = new int[]{-7,-5,-6,-9,-1};
		          int[] Sortedarr = new int[]{-9,-7,-6,-5,-1};
		          sort.basicSelectionSort(arr);
		          assert(Arrays.equals(arr,Sortedarr));
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
