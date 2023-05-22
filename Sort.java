class Sort{  
    public static void main(String args[]){  
    	int[] arr = {52, 26, 7, 95, 57, 8, 21, 93, 12, 47};
		System.out.println("Bubble Sort");
		bubbleSort(arr, 10);
		printArr(arr, 10);

		System.out.println("Selection Sort");
		selectionSort(arr, 10);
		printArr(arr, 10);
    }

// A function to implement bubble sort
    public static bubbleSort(int[] arr, int n) {
    	int i, j;
    	for (i = 0; i < n - 1; i++) {
			 // Last i elements are already in place
            for (j = 0; j < n - i - 1; j++) {
            	if (arr[j] > arr[j + 1]) {
		    		int tmp = arr[j];
		   			arr[j] = arr[j+1];
		    		arr[j+1] = tmp;
				}
	   		}
		}
    }

// A function to implement selection sort
	public static void selectionSort(int[] arr, int n) {
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
	}

    public static void printArr(int[] arr, int n) {
		for(int i = 0; i < n; i++) {
			Arrays.stream(arr)
            .forEach(e->System.out.print(e + " "));
		}
    }
}  