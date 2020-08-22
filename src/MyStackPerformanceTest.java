public class MyStackPerformanceTest extends PerformanceTest{
	MyStack  list;
	int nElements;
	
	public MyStackPerformanceTest(String testName, int nRuns, MyStack  list, int nElements) {
		super(testName, nRuns);
		this.list=list;
		this.nElements=nElements;
	}

	@Override
	protected void runTest() {
		for (int i=0; i<nElements;i++) {
			list.push((int)(Math.random()*1000));
		}
		int max = list.getMax();
		list.clear();
		//System.out.println(max);
	}

}
