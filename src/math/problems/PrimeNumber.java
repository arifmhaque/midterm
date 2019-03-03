package math.problems;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		int n = 2;
		int m = 10;
		int count = 0;
		for (int i= n; i <=m;i++ ){
			System.out.println(i);
			if (i%2==0){
				count++;
				break;
			}

		}
		if (count==0){
			System.out.println(count);
		}

	}

}
