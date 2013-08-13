class Multi implements Runnable {
	static int id = 0;
	static long result = 0;
	final static int NT = 10;
	final static int BILLION = 1000000000;

	public void run() {
		int i;
		long local_result = 0;
		int start;
		int end;
		synchronized(this){
			start = (BILLION / NT) * id + 1;
			end = BILLION / NT * (id + 1);
			id++;
		}
		for(i = start ; i <= end ; i++){
			local_result += i;
		}

		synchronized(this) {
			result += local_result;
		}
	}

	public static void main(String[] args) throws Exception{
		Multi test = new Multi();
		Thread[] ta = new Thread[NT];
		for(int i = 0 ; i < NT ; i++) {
			ta[i] = new Thread(test);
			ta[i].start();
		}

		for (Thread t : ta)
			t.join();

		System.out.println(result);
	}
}

