package Thread;

public class ReturnThread extends Thread{
	ThreadFrame threadFrame;
	
	public ReturnThread(ThreadFrame threadFrame){
		this.threadFrame = threadFrame;
	}
	public void run() {
		// add code here starting. it is a loop for computing factorial with 30 evaluations
		long s = 1;
		//double result = 0;
		while (ComputeThread.i != 30)
		{
			ComputeThread.i *= s;
			s++;
		}

		threadFrame.resultfield.setText("" + ComputeThread.result);




		// add code stopping here

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("The second thread is wrong");
		}
		threadFrame.resultfield.setText("" + ComputeThread.result);
		ComputeThread.result = 0;
		ComputeThread.i = 1;
		threadFrame.button.setText("re-computing");
	}
}