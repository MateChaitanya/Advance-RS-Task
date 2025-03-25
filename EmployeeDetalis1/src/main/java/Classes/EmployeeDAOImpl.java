package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import interfaces.IEmployeeDAO;

@Component
public class EmployeeDAOImpl implements IEmployeeDAO {
    private DB db;

    public EmployeeDAOImpl() {
        super();
    }

    public DB getDb() {
        return db;
    }

    @Autowired
    public void setDb(DB db) {
        this.db = db;
    }

    public void addEmployee(EmployeePOJO emp) {
        String checkSql = "SELECT COUNT(*) FROM employee1 WHERE id = ?";
        String insertSql = "INSERT INTO employee1 (id, name, salary, department) VALUES (?, ?, ?, ?)";
        try (Connection conn = db.getConnection();
             PreparedStatement checkStmt = conn.prepareStatement(checkSql);
             PreparedStatement insertStmt = conn.prepareStatement(insertSql)) {

            checkStmt.setInt(1, emp.getId());
            ResultSet rs = checkStmt.executeQuery();
            if (rs.next() && rs.getInt(1) > 0) {
                System.out.println("Employee with ID " + emp.getId() + " already exists.");
                return;
            }

            insertStmt.setInt(1, emp.getId());
            insertStmt.setString(2, emp.getName());
            insertStmt.setInt(3, emp.getSalary());
            insertStmt.setString(4, emp.getDepartment());

            int rowsInserted = insertStmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Employee added successfully.");
            } else {
                System.out.println("Employee insertion failed.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<EmployeePOJO> getAllEmployee() {
        List<EmployeePOJO> employees = new ArrayList<>();
        String sql = "SELECT * FROM employee1";

        try (Connection conn = db.getConnection();
             PreparedStatement pstm = conn.prepareStatement(sql);
             ResultSet rs = pstm.executeQuery()) {

            while (rs.next()) {
                EmployeePOJO emp = new EmployeePOJO();
                emp.setId(rs.getInt("id"));
                emp.setName(rs.getString("name"));
                emp.setSalary(rs.getInt("salary"));
                emp.setDepartment(rs.getString("department"));
                employees.add(emp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }

    public void updateSalary(int id, int salary) {
        String sql = "UPDATE employee1 SET salary = ? WHERE id = ?";

        try (Connection conn = db.getConnection();
             PreparedStatement pstm = conn.prepareStatement(sql)) {

            pstm.setInt(1, salary);
            pstm.setInt(2, id);

            int rowsUpdated = pstm.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Salary updated successfully.");
            } else {
                System.out.println("Salary update failed: Employee not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteEmployee(int id) {
        String sql = "DELETE FROM employee1 WHERE id = ?";

        try (Connection conn = db.getConnection();
             PreparedStatement pstm = conn.prepareStatement(sql)) {

            pstm.setInt(1, id);

            int rowsDeleted = pstm.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Employee deleted successfully.");
            } else {
                System.out.println("Employee deletion failed: Employee not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

	@Override
	public void getEmployee() {
		// TODO Auto-generated method stub
		
	}
}
