package sit707_tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import Models.Task;
import services.TaskReminderService;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class TaskReminderServiceTest {

    @Test
    public void testGetUpcomingTasks_onlyFutureTasks() {
        Task t1 = new Task("Task 1", LocalDate.now().minusDays(1)); // past
        Task t2 = new Task("Task 2", LocalDate.now().plusDays(1));  // future
        Task t3 = new Task("Task 3", LocalDate.now().plusDays(3));  // future

        TaskReminderService service = new TaskReminderService();
        List<Task> result = service.getUpcomingTasks(Arrays.asList(t1, t2, t3), LocalDate.now());

        assertEquals(2, result.size());
        assertEquals("Task 2", result.get(0).getTitle());
        assertEquals("Task 3", result.get(1).getTitle());
    }
}
