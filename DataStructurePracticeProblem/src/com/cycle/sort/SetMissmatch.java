package com.cycle.sort;
//find the no that is occuring twice and the no that is missing
public class SetMissmatch {
	 public int[] findErrorNums(int[] arr) {
	        int i = 0;
	        while (i < arr.length) {
	            int correct = arr[i] - 1;// it hold the index of arr[i]element-1 if at i=0 element=4 it store the index for that no is 3
	            if (arr[i] != arr[correct]) {// here it checks the arr[i] value and arr[correctIndex] value if i=0 arr[0]
	            	//if the first index value is 4 then it compare with arr[correct] arr[3]=1 in this ex. then swap
	            	// swap 4 to 1
// in case of arr[1]=2 the correct= arr[1]-1 = value at arr[1]which is 2=2-1=1 now correct =1
	            	//now check the arr[i] and arr[correct] which is arr[1] and arr[correct] which is arr[1] if the values are same then no need to swap.
	            		
	            	
	                swap(arr, i , correct);
	            } else {
	                i++;
	            }
	        }

	        // search for first missing number
	        for (int index = 0; index < arr.length; index++) {
	            if (arr[index] != index + 1) {  // it checks is the element value is index+1 or not
	                return new int[] {arr[index], index+1};
	            }
	        }
	        return new int[] {-1, -1};
	    }

	    static void swap(int[] arr, int first, int second) {
	        int temp = arr[first];
	        arr[first] = arr[second];
	        arr[second] = temp;
	    }
	    public static void main(String[] args) {
			int arr[]= {4,2,2,1};
			
		}
}
