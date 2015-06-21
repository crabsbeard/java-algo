import java.io.*;

public class Euler_1{
	public static void main(String[] argv) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String testInput = br.readLine();
		int T = Integer.parseInt(testInput);
		for(int i =0; i<T; i++){
			String naturalNumbers = br.readLine();
			int N = Integer.parseInt(naturalNumbers);
			if(N<=9){
				int acc = 0;
				int inc =0;
				while(inc <= N-1){
					if(inc == 3 || inc == 5 || inc==6){
					acc += inc;
					inc++;
					}
					else{
						inc++;
					}
				}
				System.out.println(acc);
			}
			else{
				Euler_1 object_euler = new Euler_1();
				int output = object_euler.getSum(N);
				System.out.println(output);
			}
		}
	}
	//code to get sum if the input natural number is more than 10, as using an algorithm to calculate the value more efficiently.

	public int getSum(int N){
		int N_array[] = {3, 1, 2, 3, 3, 2, 1};
		int x = 0;
		int adder = 6;
		int checker = 6;
		int acc = 14;
		int inc = 0;
		while(checker<N-1){
			if(x==6){
				x=0;
			}
			inc = N_array[x];
			checker += N_array[x];
			x++;
			checker += N_array[x];
			adder += inc;
			acc += adder;
		}
		return acc;
	}
}	
