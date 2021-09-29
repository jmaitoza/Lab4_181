package Thread;

public class ComputeThread implements Runnable{
	ThreadFrame threadframe ;
	static public double result = 0;
	static public int i;
	String str1 = "";
	//Runnable runnable = new ComputeThread(threadframe);

	public ComputeThread(ThreadFrame t) {
		threadframe = t;
	}
	public void run() {
		long s=1;
		for(i=1;i<=30;i++)
		{
			//add code starting here
			//Thread thread1 = new Thread(runnable);
			//thread1.start();
			if (str1.equals(""))
			{
				str1 = (i + "!");
			}
			else
			{
				str1 = str1 + " + " + i + "!";
			}

			s *= i;
			result += s;


			//add code stopping here
			//thread1.stop();
			threadframe.output.setText(str1);
			threadframe.jprogressBar.setValue(i);

			try {
				Thread.sleep((long)(500 + 500 * Math.random()));
			} catch (InterruptedException e) {
				
				e.printStackTrace();
				System.out.println("Error in the first thread");
			}

		}
	}
}