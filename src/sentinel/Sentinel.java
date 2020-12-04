package sentinel;

import java.util.Arrays;
import java.util.Scanner;


public class Sentinel {
	

	
	public static int seqSearch(int[] arr, int size, int key) {
		int idx = 0;
		
		for(int i = 0; i < size; i++) {
			if(i==size) {
				idx=-1;
				return idx;
			}
			if(arr[i]==key) {
				idx = i;
			}
		}
		return idx;
	}
	
	public static int seqSearchSen(int[] arr, int size, int key) {
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
	
	/**
	 * 현재 선형검색의 위치 반환 
	 * @param i 선형 검색 중인 인덱스 번호
	 * @return
	 */
	public static int traceSearching(int i) {
		return i;
		
	}
	
	/**
	 * 선형검색 과정을 문자열로 출력
	 * @param arr
	 * @param key
	 */
	public static void printOutSen(int[] arr, int key) {
		int keyIdx = seqSearch(arr, arr.length, key);
		// 배열 내부에 key값이 없을 때
		if(keyIdx==-1) {
			System.out.println(key+"은(는) arr에 존재하지 않습니다.");
			return;
		}
		// 배열 내부에 key값이 존재할 때
		for(int i=0; i<=arr.length; i++ ) {
			System.out.print(" ");
			System.out.print(" | ");
			for(int x=0; x<traceSearching(i); x++) {
				System.out.println(" ");
			}
			System.out.println(" * ");
			System.out.print(" ");
			System.out.print(" | ");
			for(int n : arr) {
				System.out.print(n+" ");
			}
		}
		System.out.println();
		System.out.println(key+"은(는) arr x ["+keyIdx+"]에 있습니다.");
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("데이터 수: ");
		int size = sc.nextInt();
		System.out.println("key값: ");
		int key = sc.nextInt();
		
		//입력받은 크기의 빈 배열을 생성
		int[] arr = new int[size+1];
		
		//데이터를 입력받아 배열 채우기
		for(int i=0; i<=size; i++ ) {
			if(i == size) {
				arr[i]=key;
				break;
			}
			System.out.println((i+1)+"번째 데이터 입력: ");
			arr[i]=sc.nextInt();
		}
		//System.out.println(Arrays.toString(arr));
		
			System.out.print(" ");
			System.out.print(" | ");
			for(int i = 0; i < size; i++) {
				System.out.print(i+ " ");
			}
			System.out.println();
			System.out.println("----------------------------------------");
			System.out.print(" ");
			System.out.print(" | ");
			printOutSen(arr, key);
		
		
		
		
	}
}