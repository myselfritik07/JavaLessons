class MyThread extends Thread{
    @Override
   public void run(){
    System.out.println("Thread is running");
   }
}
public class multithreading {
    public static void main(String[] args) {
        
   
    MyThread t = new MyThread();
        t.start();
    
    // Multiprocessing and Multithreaing both are used to achieve multitasking

    //for ex - using vs code and making multiple files which are going to run simultaneously.
    /*Creation of thread can be done in two ways
    1. Extending thread class 
    2. Implimenting runnable interface
        Concurrency-> Concurrency is the task of running and managing multiple computation at the same time.
        but in concurrency the tasks are done as one task at a time while doing all of them but not simultaneously.

        Parallallism is the task of running multiple computations simultaneously.
        Note :> Diff bw Parameters and arguements.
        Parameters ->These are used when the function or even a constructor is being defined 
        ->Used while  function assigning.

        Arguements -> When the functions is being called and the details are given with respect to the parameters.
    ->Actual value to the parameters.

    */
   //with extending thread
 }

}
