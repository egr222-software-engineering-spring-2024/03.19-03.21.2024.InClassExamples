import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.time.DateTimeException;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    private static final int TIMEOUT = 2;

    @Test
    @Timeout(TIMEOUT)
    void constructInvalidDateInFebruaryNonLeapYear() {
        assertThrows(DateTimeException.class,
                () -> new Date(2021, 2, 29)
        );
    }

    @Test
    @Timeout(TIMEOUT)
    void addDate_withinSameMonth() {
        addHelper(2050, 2, 15, 4, 2050, 2, 19);
//        Date d = new Date(2050, 2, 15);
//        d.addDays(4);
//        Date expected = new Date(2050, 2, 19);
//        assertEquals(expected, d, "date object after adding 4 days to 2/15/2050");
//        assertEquals(2051, d.getYear(), "year after adding 4 days to 2/15/2050");
//        assertEquals(2, d.getMonth(), "month after adding 4 days to 2/15/2050");
//        assertEquals(19, d.getDay(), "day after adding 4 days to 2/15/2050");
    }

    @Test
    @Timeout(TIMEOUT)
    void addDate_rolloverToMarchFromFebruaryNonLeapYear() {
        addHelper(2050, 2, 15, 14, 2050, 3, 1);
//        Date d = new Date(2050, 2, 15);
//        d.addDays(14);
//        Date expected = new Date(2050, 3, 1);
//        assertEquals(expected, d, "date object after adding 14 days to 2/15/2050");
//        assertEquals(2051, d.getYear(), "year after adding 4 days to 2/15/2050");
//        assertEquals(2, d.getMonth(), "month after adding 4 days to 2/15/2050");
//        assertEquals(19, d.getDay(), "day after adding 4 days to 2/15/2050");
    }

    private void addHelper(int y1, int m1, int d1, int add,
                           int y2, int m2, int d2) {
        Date actual = new Date(y1, m1, d1);
        actual.addDays(add);
        Date expected = new Date(y2, m2, d2);
        assertEquals(expected, actual, "date object after adding " + add + " days");
    }

    @Test
    public void repeatNextDayOneBillionTimes() {
        assertTimeoutPreemptively(
                Duration.ofSeconds(5),
                () -> {
                    Date act = new Date();
                    for (int i = 1; i < 1000000000; i++) {
                        act.nextDay();
                    }
                }
        );
    }
}