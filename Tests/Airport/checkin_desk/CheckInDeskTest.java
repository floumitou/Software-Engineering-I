package Airport.Checkin_Desk;



import Airport.Airport.Airport;
import Airport.Base.BoardingPass;
import Airport.Base.Carrier;
import Airport.Base.Passenger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class CheckInDeskTest {

    private CheckInDesk checkInDesk;
    private Passenger passenger;
    private BoardingPass boardingPass;

    @BeforeEach
    void setUp(){
        checkInDesk = new CheckInDesk(new Airport());
        passenger = new Passenger();
        boardingPass = new BoardingPass();

    }

    @Test
    void open() {
        checkInDesk.open();
    }

    @Test
    void close() {
        checkInDesk.close();
    }

    @Test
    void validatePassport() {
        assertTrue(checkInDesk.validatePassport(passenger));
    }

    @Test
    void checkIn() {
        checkInDesk.checkIn(passenger));
    }

    @Test
    void print() {
        checkInDesk.checkIn(boardingPass);
    }

    @Test
    void weight() {
    }

    @Test
    void checkIn1() {
    }

    @Test
    void print1() {
    }

    @Test
    void place() {
    }

    @Test
    void place1() {
    }

    @Test
    void sendLuggageTubToBaggageSortingUnit() {
    }

    @Test
    void notifyGroundOperations() {
    }
}