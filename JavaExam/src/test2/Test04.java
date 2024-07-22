package test2;

public class Test04 {
	public static void main(String[] args) {
		
		int arr[] = {4, 2, 1, 5, 3};
		int temp;
		for(int i=0 ; i<4 ; i++) {
			
			for(int j=i+1 ; j<5 ; j++) {
				
				if(arr[i] > arr[j]) {
					temp = arr[j];
				}else{
					temp = arr[i];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}  
		}
			
			// 정렬된 배열 출력하기
		for(int n : arr) {
			System.out.println(n+" ");
		}
	}

}
