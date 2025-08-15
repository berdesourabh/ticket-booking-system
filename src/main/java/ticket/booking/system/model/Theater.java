package ticket.booking.system.model;

import java.util.List;

public class Theater {

    private String name;
    private Address address;
    private List<Show> shows;

    private static class Address {
        private String addressLine1;
        private String addressLine2;
        private String zipCode;
    }
}


