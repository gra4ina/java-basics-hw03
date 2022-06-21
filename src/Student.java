public class Student {
  private int rating;
  private String name;
  static int studentsCount = 0;
  static double totalRating = 0;

  public Student(){
    studentsCount++;
  }

  public Student(String name) {
    studentsCount++;
    this.name = name;
  }

  public Student(int rating, String name) {
    this.rating = rating;
    this.name = name;
    studentsCount++;
    totalRating = totalRating + this.rating;
  }

  public static double getAvgRating() {
    if (studentsCount <= 0) {
      System.out.println("Error, cannot find average rating with studentsCount <= 0 ");
      return 0.0;
    } else return totalRating / studentsCount;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
    totalRating += this.rating;
  }

  public boolean betterStudent(Student student) {
    return this.rating > student.rating;
  }

  public void changeRating(int rating) {
    int diffRating = rating - this.rating;
    this.rating = rating;
    totalRating += diffRating;
  }

  public static void removeStudent(Student student) {
    studentsCount--;
    totalRating = totalRating - student.rating;
    student.name = null;
    student.rating = 0;
  }

  @Override
  public String toString() {
    return " " + this.name + ", rating " + this.rating;
  }
}