package java1;

public class Removeduplicate {

	public static void main(String[] args) {
		int[] arr1 = {10,20,20,30,40,30,10,50};
		for(int i=0;i<=arr1.length;i++){
			for(int j=1;j<arr1.length;j++){
				if(arr1[i]==arr1[j])
					continue;
				else{
					System.out.println("duplicate elements are"+arr1[j]);
				}
			}
			
		}

	}

}
 