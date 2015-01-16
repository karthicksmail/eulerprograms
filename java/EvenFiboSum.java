public class EvenFiboSum {
	public static void main(String[] args) {
		int sum = 10;
		int prevnum = 2;
		int num = 8;
		while ((4 * num + prevnum) < 4000000) {
			int temp = (4 * num + prevnum);
			sum += temp;
			prevnum = num;
			num = temp;
			System.out.println(num + "\t" + sum);
		}
		System.out.println(sum);
	}
}

