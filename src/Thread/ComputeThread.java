package Thread;

public class ComputeThread implements Runnable{
	ThreadFrame threadframe ;
	static public double result = 0;
	static public int i;
	String str1 = "";
	public ComputeThread(ThreadFrame t) {
		threadframe = t;
	}
	public void run() {
		long s=1;
		for(i=1;i<=30;i++)
		{
			//add code starting here






			//add code stopping here

			try {
				Thread.sleep((long)(500 + 500 * Math.random()));
			} catch (InterruptedException e) {
				
				e.printStackTrace();
				System.out.println("Error in the first thread");
			}

		}
	}
}