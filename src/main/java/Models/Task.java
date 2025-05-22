package Models;

import java.time.LocalDate;

public class Task {
    private String title;
    private LocalDate dueDate;

    public Task(String title, LocalDate dueDate) {
        this.title = title;
        this.dueDate = dueDate;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }
}
