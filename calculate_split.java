class calculate_split {
	public static void main(String args[]) {
		if (args.length == 0) {
			return;
		}

		int arr[] = new int[args.length];

		for (int i = 0; i < args.length; i++) {
			arr[i] = Integer.parseInt(args[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			if (sum(arr, 0, i) == sum(arr, i, arr.length)) {
				System.out.println("True !");
				return;
			}
		}

		System.out.println("False !");
	}

	static int sum(int[] arr, int i, int j) {
		int s = 0;
		for (int k = i; k < j; k++) {
			s += arr[k];
		}

		return s;
	}
}
