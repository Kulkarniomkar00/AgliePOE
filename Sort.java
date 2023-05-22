class Sort{  
    public static void main(String args[]){  
    	int[] arr = {52, 26, 7, 95, 57, 8, 21, 93, 12, 47};
		bubbleSort(arr, 10);
		System.out.println("Bubble Sort");
		printArr(arr, 10);
    }

// A function to implement bubble sort
    public static bubbleSort(int[] arr, int n 10) {
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

    public static void printArr(int[] arr, int n 10) {
		for(int i = 0; i < n; i++) {
			Arrays.stream(arr)
            .forEach(e->System.out.print(e + " "));
		}
    }
}  