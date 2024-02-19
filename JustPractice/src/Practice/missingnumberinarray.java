package Practice;

public class missingnumberinarray {

	public static void main(String[] args) {

		int sum = 0;
		int wsum = 0;
		int[] a = { 1, 4, 5, 6 };
		for (int i = 0; i < a.length; i++) 
		{
			sum = sum + a[i];

		}

		for (int j = 1; j <= 6; j++) {
			wsum = wsum + j;
		}
		
		System.out.println(wsum-sum);
	}
	

}
