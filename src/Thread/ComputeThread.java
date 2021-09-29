package Thread;

import java.math.BigInteger;

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
			if (str1.equals(""))
			{
				str1 = (i + "!");
			}
			else
			{
				str1 = (str1 + " + " + i + "!");
			}

			s *= i;
			result += s;
			threadframe.output.setText(str1);
			threadframe.jprogressBar.setValue(i);
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