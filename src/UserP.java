import java.io.Serializable;

/**
 * Created by m on 18.09.2017.
 */
public class UserP implements Serializable {



    public  String  IP_address;

    static UserP user;



    UserP( String IP_address){



        this.IP_address = IP_address;



    }




}

