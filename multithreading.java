package multiThreading;
import java.util.*;
import java.lang.Thread;

 class MyThread extends Thread{
	public void run() {
		System.out.println("the thread is running");
	}
}

public class multithreading {

	
	public static void main(String[] args) {
		
		MyThread thread= new MyThread();
		thread.start();

	}

}
