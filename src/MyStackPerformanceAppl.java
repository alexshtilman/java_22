
public class MyStackPerformanceAppl {
	private static final int N_RUNS = 1000;
	private static final int N_ELEMENTS = 100000;
	
	public static void main(String[] args) {
		PerformanceTest test = new MyStackPerformanceTest("Stack list test",N_RUNS,new MyStack(),N_ELEMENTS);
		test.run();
	}

}
