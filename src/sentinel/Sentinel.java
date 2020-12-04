package sentinel;

import java.util.Arrays;
import java.util.Scanner;


public class Sentinel {
	
//	int[] arr;
//	int arrSize;
//	int key;
	
	public int seqSearch(int[] arr, int size, int key) {
		int idx = 0;
		
		for(int i = 0; i <= size; i++) {
			if(i==size) {
				idx=-1;
			}
			if(arr[i]==key) {
				idx = i;
			}
		}
		return idx;
	}
	
	public int seqSearchSen(int[] arr, int size, int key) {
		int idx = 0;
		arr[size] = key;
		
		for(int i = 0; i <= size; i++) {
			if(arr[i]==key) {
				idx=i;
				break;
			}
		}
		return idx==size? -1:idx;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
	}
}