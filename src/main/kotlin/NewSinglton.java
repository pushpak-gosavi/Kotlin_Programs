import kotlin.jvm.Synchronized;

public class NewSinglton {

    private  static NewSinglton getNewInstance;

    private NewSinglton(){
        System.out.println("Helloo");
    }

    public static synchronized  NewSinglton getGetNewInstance(){

        if (getNewInstance == null)
            getNewInstance = new NewSinglton();
        return getNewInstance;
    }
}


class newCheckSinglton{

    NewSinglton onjNew = NewSinglton.getGetNewInstance();
}