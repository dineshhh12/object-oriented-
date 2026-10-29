package timetable.model;

public class Course {
    private final String courseId;
    private final String courseName;
    private final boolean laboratoryRequired;

    public Course(String courseId, String courseName,
                  boolean laboratoryRequired) {
        if (courseId == null || courseId.isBlank()
                || courseName == null || courseName.isBlank()) {
            throw new IllegalArgumentException("Course details are required.");
        }

        this.courseId = courseId;
        this.courseName = courseName;
        this.laboratoryRequired = laboratoryRequired;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public boolean requiresLaboratory() {
        return laboratoryRequired;
    }
}