import java.util.*;
public class SortingandSearchingTechiques {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------SEARCHING AND SORTING TECHNIQUES--------------");
		System.out.println("Please Enter the Number of Your Choice: ");
		System.out.println("1. Linear Search      2.Binary Search ");
		System.out.println("3. Bubble Sort        4.Selection Sort");
		System.out.println("5. Insertion Sort     6.Merge Sort        7. QuickSort");
		int choice = sc.nextInt();
		System.out.println("Enter the Size of the Array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements of the Array:");
		for(int i = 0 ; i< size ; i++) {
			arr[i] = sc.nextInt();
		}
		switch(choice) {
		case 1: System.out.println("Enter the Element that You want to search");
				int target = sc.nextInt();
				int result = performLinearSearch(arr, target);
				if(result == -1) {
					System.out.println("The Element "+target+" is not found in the Given Array");
					System.out.println("Linear Search - Time: O(n), Space: O(1)");
				}else {
					System.out.println("Element "+target+" is found at index "+result);
				}
				break;
		case 2: boolean result1 = isSortedArray(arr);
				if(result1 == true) {
					System.out.println("Enter the Element that You want to search");
					int targetElement = sc.nextInt();
					int resultBinary = performBinarySearch(arr, targetElement);
					if(resultBinary == -1) {
						System.out.println("The Element "+targetElement+" is not found in the Given Array");
					}else {
						System.out.println("Element "+targetElement+" is found at index "+resultBinary);
						System.out.println("Binary Search - Time: O(log n), Space: O(1)");
					}
				}else {
					System.out.println("Array is unsorted");
					System.out.println("Sorting the Array...");
					bubbleSort(arr);
					System.out.println("Array has been Sorted");
					System.out.println("Enter the Element that You want to search");
					int targetElement = sc.nextInt();
					int resultBinary = performBinarySearch(arr, targetElement);
					if(resultBinary == -1) {
						System.out.println("The Element "+targetElement+" is not found in the Given Array");
					}else {
						System.out.println("Element "+targetElement+" is found at index "+resultBinary);
						System.out.println("Binary Search - Time: O(log n), Space: O(1)");
					}
				}
				break;
		case 3: System.out.println("The Elements of the Array after sorting using Bubble Sort is:");
				bubbleSort(arr);
				printArray(arr);
				System.out.println("Bubble Sort - Time: O(n^2), Space: O(1)");
				break;
		case 4: System.out.println("The Elements of the Array after sorting using Selection Sort is");
				selectionSort(arr);
				printArray(arr);
				System.out.println("Selection Sort - Time: O(n^2), Space: O(1)");
				break;
		case 5: System.out.println("The Elemnts of the Array after Sorting using Insertion Sort is");
				insertionSort(arr);
				printArray(arr);
				System.out.println("Insertion Sort - Time: O(n^2), Space: O(1)");
				break;
		case 6: System.out.println("The Elements of the Array after Sorting using Merge Sort is ");
				mergeSort(arr, 0 , arr.length - 1);
				printArray(arr);
				System.out.println("Merge Sort - Time: O(n log n), Space: O(n)");
				break;
		case 7: System.out.println("The Elements of the Array after Sorting using Quick Sort is ");
				quickSort(arr, 0 , arr.length - 1);
				printArray(arr);
				System.out.println("Quick Sort - Time: O(n log n), Space: O(log n) (avg case)");
				break;
		default:
			System.out.println("ThankYou!");
		}
		
		
	}
//--------------------------------Linear Search--------------------------------------------------------------
	public static int  performLinearSearch(int[] arr, int target) {
		int n = arr.length;
		for(int i = 0 ; i< n ; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
	public static boolean isSortedArray(int arr[]) {
		int n = arr.length;
		for(int i =0 ; i< n-1 ; i++) {
			if(arr[i] > arr[i + 1]) {
				return false;
			}
		}
		return true;
	}


//--------------------------------Binary  Search--------------------------------------------------------------
	public static int  performBinarySearch(int arr[], int targetElement) {
		int n = arr.length;
		int start = 0 ; 
		int end = arr.length - 1;
		while(start <= end) {
			int mid = start + ((end-start)/2);
			if(targetElement == arr[mid]) {
				return mid;
			}else if(targetElement <= arr[mid]) {
				end = mid - 1;
			}else {
				start = mid + 1;
			}
		}
		return -1;
	
	}
//--------------------------------------Bubble Sort---------------------------------------------------------------------------
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for(int i = 0 ; i< n - 1; i++) {
			for(int j = 0 ; j < n - i - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
//-----------------------------------------Print Array-----------------------------------------------------------------------------------
	public static void printArray(int arr[]) {
		int n = arr.length;
		for(int i =0 ; i< n ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
//-------------------------------------------Selection Sort-----------------------------------------------------------------------------------
	public static void selectionSort(int arr[]) {
		int n = arr.length;
		for(int i = 0 ; i< n - 1 ; i++) {
			int min = i;
			for(int j = i + 1; j< n ; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
//----------------------------------------Insertion Sort---------------------------------------------------------------------------------------------------
	public static void insertionSort(int[] arr) {
		int n = arr.length;
		for(int i = 0 ; i< n ; i++) {
			int temp = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}
//------------------------------------------Merge Sort----------------------------------------------------------------------------------------------------------
	public static void 	mergeSort(int arr[], int low , int high) {
		if(low >= high) {
			return;
		}
		int mid = (low + high)/2;
		mergeSort(arr, low, mid);
		mergeSort(arr, mid + 1, high);
		Merge(arr, low, mid, high);
	}
	
	public static void Merge(int arr[], int low, int mid, int high) {
		int left = low;
		int right = mid + 1;
		ArrayList<Integer> temp = new ArrayList<>();
		while(left<= mid && right <= high){
			if(arr[left] <= arr[right]) {
				temp.add(arr[left]);
				left++;
			}else{
				temp.add(arr[right]);
				right++;
			}
		}
		while(left <= mid) {
			temp.add(arr[left]);
			left++;
		}
		while(right <= high) {
			temp.add(arr[right]);
			right++;
		}
		
		for(int i = low; i<= high; i++) {
			arr[i] = temp.get(i - low);
		}
	}
//--------------------------------------------------Quick Sort-----------------------------------------------------------------------------------------------------------------
	public static void quickSort(int arr[], int lb, int ub) {
		if(lb < ub) {
			int pivot = partition(arr, lb , ub);
			quickSort(arr, lb, pivot -1);
			quickSort(arr, pivot + 1, ub);
		}
	}
	public static int partition(int arr[], int lb, int ub) {
		int pivot = arr[lb];
		int start = lb;
		int end = ub;
		while(start < end) {
			while(start <= ub && arr[start] <= pivot) {
				start++;
			}
			while(end >= lb && arr[end] > pivot) {
				end--;
			}
			if(start < end) {
				swap(arr, start , end);
			}
		}
		swap(arr, lb , end);
		return end;
	}
	public static void swap(int arr[], int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	//-----------------------------------------------------------------------------------------------------------------------------------------------
}