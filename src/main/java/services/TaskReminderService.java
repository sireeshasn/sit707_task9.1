package services;


import Models.Task;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskReminderService {

    public List<Task> getUpcomingTasks(List<Task> allTasks, LocalDate currentDate) {
        return allTasks.stream()
                .filter(task -> task.getDueDate().isAfter(currentDate))
                .sorted((a, b) -> a.getDueDate().compareTo(b.getDueDate()))
                .collect(Collectors.toList());
    }
}
