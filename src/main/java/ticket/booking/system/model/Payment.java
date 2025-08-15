package ticket.booking.system.model;

import ticket.booking.system.enums.Mode;

import java.util.UUID;

public class Payment {
    private UUID paymentId;
    private Integer amount;
    private Mode paymentMode;
}
