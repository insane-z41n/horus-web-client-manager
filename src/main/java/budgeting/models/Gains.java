package budgeting.models;

import java.util.Date;
import java.util.Optional;

public class Gains {

    private final String value;
    private final Optional<Date> recurringDate;

    public Gains(final String value, final Optional<Date> recurringDate){
        this.value = value;
        this.recurringDate = recurringDate;
    }

}
