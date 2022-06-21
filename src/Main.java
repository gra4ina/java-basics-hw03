public class Main {
    public static void main(String[] args) {
        Student stud1 = new Student(11, "Oleksiy");

        Student stud2 = new Student(22, "Grisha");

        Student stud3 = new Student();
        stud3.setName("Vasyl");
        stud3.setRating(46);

        System.out.println("Students count is " + Student.studentsCount);
        System.out.println("---");

        System.out.println("Students average rating is " + Student.getAvgRating());
        System.out.println("---");

        System.out.println("Student №2 has higher rating than Student №1 -> " + stud2.betterStudent(stud1));
        System.out.println("---");

        stud3.changeRating(56);
        System.out.println("The new rating for the Student №3 is '" + stud3.getRating() + "' new average rating is " + Student.getAvgRating());
        System.out.println("---");

        Student.removeStudent(stud3);
        System.out.println("New average rating after removing Student №3 is " + Student.getAvgRating());
    }
}