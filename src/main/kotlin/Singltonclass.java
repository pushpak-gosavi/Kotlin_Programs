public class Singltonclass {
    private Singltonclass(){
     System.out.println("Hello, this is Singlton");
    }
    private static Singltonclass instance;

    public static synchronized Singltonclass getInstance(){
        if(instance==null)
            instance = new Singltonclass();
        return instance;
    }

}

/**
 * synchronized use for the thread safe and at at time only one thread can access the method
 * preventing the multiple instance of the Singleton
 *
 */

class CheckSinglton{
    public static void main(String args[]){
        Singltonclass obj =  Singltonclass.getInstance();

        System.out.println(obj);
    }
}
