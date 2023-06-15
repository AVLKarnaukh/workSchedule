package ru.netology.services.WorkScheduleService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.services.WorkScheduleService;

public class WorkScheduleServiceTest {
    @Test
    public void shouldCalcWorkSchedule() {
        WorkScheduleService service = new WorkScheduleService();
        int income = 10_000;
        int expenses = 3000;
        int threshold = 20_000;
        int expected = 3;
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldCalcWorkSchedule2() {
        WorkScheduleService service = new WorkScheduleService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);

    }
}
