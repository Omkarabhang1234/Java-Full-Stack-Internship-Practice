import java.sql.*;

public class StudentDAO {

    // Add Student
    public void addStudent(Student student) {

        String sql = "INSERT INTO students(name, age, course, email) VALUES (?, ?, ?, ?)";

        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, student.getName());
            ps.setInt(2, student.getAge());
            ps.setString(3, student.getCourse());
            ps.setString(4, student.getEmail());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("\nStudent Added Successfully!");
            }

            con.close();

        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    // View Students
    public void viewStudents() {

        String sql = "SELECT * FROM students";

        try {
            Connection con = DBConnection.getConnection();

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                System.out.println("----------------------------");
                System.out.println("ID      : " + rs.getInt("id"));
                System.out.println("Name    : " + rs.getString("name"));
                System.out.println("Age     : " + rs.getInt("age"));
                System.out.println("Course  : " + rs.getString("course"));
                System.out.println("Email   : " + rs.getString("email"));
            }

            con.close();

        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    // Search Student
    public void searchStudent(int id) {
        System.out.println("Search Student feature will be added.");
    }

    // Update Student
    public void updateStudent(int id, String name, int age, String course, String email) {
        System.out.println("Update Student feature will be added.");
    }

    // Delete Student
    public void deleteStudent(int id) {
        System.out.println("Delete Student feature will be added.");
    }
}









