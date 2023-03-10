import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Integer number;
    private Date chekin;
    private Date checkout;

    public Reservation(Integer number, Date chekin, Date checkout) throws DomainException {
        if (!checkout.after(chekin)) {
            throw new DomainException("Checkout date must be after chekin date:");
        }
        this.number = number;
        this.chekin = chekin;
        this.checkout = checkout;
    }
    public void updateDates(Date chekin, Date checkout)throws DomainException{
        Date now = new Date();
        if (chekin.before(now) || checkout.before(now)){
            throw  new DomainException("reservation date for update must be future dates:");

        }
        if (!checkout.after(chekin)) {
            throw new DomainException("Checkout date must be after chekin date:");
        }
        this.chekin = chekin;
        this.checkout = checkout;



    }
    public long duration(){
        long diff = checkout.getTime() -chekin.getTime();
        return TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS);

    }


    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getChekin() {
        return chekin;
    }

    public Date getCheckout() {
        return checkout;
    }
    @Override
    public String toString(){
        return "Room:"
                + number
                +", check-in: "
                + sdf.format(chekin)
                +", check-out: "
                +sdf.format(checkout)
                +", "
                +duration()
                +" nights";
    }


}
