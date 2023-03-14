package inherance_abstract_association.association.ex7;

import java.util.*;

public class User {
    public final List<Address> addresses;
    User(List<Address>addresses)
    {
        this.addresses = addresses;
    }

    public List<Address> getTotalAddresses()
    {

        return addresses;
    }
}
