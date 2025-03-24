public class Course {
    private String courseName;
    private String courseCode;
    private String courseFacilitator;

    public Course(String courseName, String courseCode, String courseFacilitator) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseFacilitator = courseFacilitator;
    }

    public String getCourseName() {
        return courseName;
    }
    public String getCourseCode() {
        return courseCode;
    }
    public String getCourseFacilitator() {
        return courseFacilitator;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    public void setCourseFacilitator(String courseFacilitator) {
        this.courseFacilitator = courseFacilitator;
    }

}
