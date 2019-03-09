package college;

public class MySpecialArrayUtils  {
	public static void reverse(int[] arr) {
		 int var;
		 int count;
		for (count=0 ; count<(arr.length/2) ; count++ ) {
			var = arr[count];
			arr[count]=arr[(arr.length-1)-count];
			arr[(arr.length-1)-count]=var;
		}
	}
	public static int[] sumEvenOdd(int[] arr) {
		int arrayOfSum[] = {0,0} ;
	    int count ; 
		
		for (count = 0 ; count < (arr.length) ; count++) {
			if (arr[count] % 2 == 0) {
				arrayOfSum[0] += arr[count];
			}
			else {
				arrayOfSum[1] += arr[count];
			}
		}
		return arrayOfSum ;
}
	public static double average(int[] arr) {
		double average = 0;
		for (int i =0 ; i< arr.length ; i++) {
			average += arr[i]/arr.length;
		}
		return average;
	}
	public static void moveValue(int[] arr, int val) {
		int x,i;
		for ( i=0 ; i<(arr.length) ; i++) {
			if (arr[i] != val) {
				continue;
			}
			else {
				x=i+1;
				 while (arr[x-1] == val && x<=(arr.length-1)){
	                    if (arr[x] == val){
	                        x++;
	                        if (x>(arr.length-1)){
	                           break;
	                        }
	                    }
	                    else {
	                        arr[x-1]=arr[x];
	                        arr[x]=val;
	                        x--;
	                    }
	                }
			}
		}
	}
	public static void transpose(int[] [] arr) {
		int i,j,t;
		if (arr.length == 0) {
			return;
	}
		for (i=0 ; i<arr.length ; i++) {
			for (j=i ; j<arr[i].length ; j++) {
				if (arr.length != arr[i].length) {
					return;
				}
				t=arr[j][i];
				arr[j][i]=arr[i][j];
				arr[i][j]=t;
			}
		}
		
	}
}
