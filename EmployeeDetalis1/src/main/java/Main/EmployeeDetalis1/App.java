package Main.EmployeeDetalis1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import Classes.EmployeeService;
import Classes.SpringConfig;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
        System.out.println("🚀 Application Started!");

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        EmployeeService es = context.getBean(EmployeeService.class);

        try {
            System.out.println("🔹 Adding Employees...");
            es.addEmployee(4, "Mauli", 600, "MCA");
            es.addEmployee(5, "Amit", 700, "IT");  // Added another employee

            System.out.println("\n🔹 Updating Salary...");
            es.updateSalary(4, 900);

            System.out.println("\n🔹 Fetching All Employees:");
            es.getAllEmployees();

            System.out.println("\n🔹 Deleting Employee with ID 3...");
            es.deleteEmployee(3);
        } catch (SQLException e) {  // Catch only SQL exceptions
            System.err.println("❌ SQL Error: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("❌ Unexpected Error: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("✅ Application Finished!");
    }
}
