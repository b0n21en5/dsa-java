


//multithreading refers to a process of executing
// two or more threads simultaneously for maximum 
// utilization of cpu



//in multithreading order of execution of threads
// will be different in every run



public class multiThreading {
    

    //main thread will considered as thread-1
    public static void main(String[] args) throws InterruptedException {

        result ref = new result();

        ref.start(); // this will call thread-2 & both thread will run simultaneously

        for (int i=1; i<=5; i++)
            System.out.println("Tripura");
            Thread.sleep(1000);
    }
}


//inheriting result class with Thread class
class result extends Thread{


    //override of run method from thread class
    @Override
    public void run(){

        try{
        for(int i=1;i<=5;i++){
            System.out.println("India");
            Thread.sleep(1000);
            }
        }
        catch (InterruptedException i){}
            
    }


    void fun(){

        try{
        for (int i=1;i<=5;i++){
            System.out.println("Delhi");
            Thread.sleep(1000);}
        }
        catch(InterruptedException i){}
    }
}
