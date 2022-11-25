

// in multithreading u cant expect the order of execution
// of threads, every order of execution will be different



public class multithreading_2nd {

    public static void main(String[] args) {

        thrds tr = new thrds();


        //creating object of Thread cause Runnable interface
        // does not have any start method
        Thread ref = new Thread(tr); 

        ref.start();


        for (int i=1;i<=5;i++)
            System.out.println("Main thread");


    }
    
}



class thrds implements Runnable{


    public void run(){
        
        for (int i=1; i<=5;i++)
            System.out.println("Child threaed");
    }
}
