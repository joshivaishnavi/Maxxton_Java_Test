import java.util.Scanner;

public class PeopleCrossingCount {
	
	
	public void accept(int n) {
		int N = n;
		int[] A = new int[1000];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		int result = solution(A);
		
		System.out.println(result);
		sc.close();
	}
	
	public int solution(int[] A) {
        int zeroCount = 0, count = 0;

        for (int i = 0; i < A.length; i++){
            if (A[i] == 0) { 
            	zeroCount++;  
            }
            
            if (A[i] == 1) { 
            	count += zeroCount;
            }
            
            if (count > 1000000000)
            	{
            	return -1;
            	
            	}
        }
        return count;
}
	public static void main(String[] args) {
	
	    Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		PeopleCrossingCount pcc = new PeopleCrossingCount();
		pcc.accept(N);
		sc.close();

	}

}
