package Classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.sql.SQLException;
import java.util.List;

@Component
public class EmployeeService {
    
    private final EmployeeDAOImpl empDao;

    @Autowired
    public EmployeeService(EmployeeDAOImpl empDao) {
        this.empDao = empDao;
    }

    public void addEmployee(int id, String name, int salary, String department) throws SQLException {
        EmployeePOJO emp = new EmployeePOJO(id, name, department, salary);
        empDao.addEmployee(emp);
    }

    public void getAllEmployees() throws SQLException {
        List<EmployeePOJO> employees = empDao.getAllEmployee();
        for (EmployeePOJO emp : employees) {
            System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getSalary() + " " + emp.getDepartment());
        }
    }

    public void updateSalary(int id, int salary) throws SQLException {
        empDao.updateSalary(id, salary);
    }

    public void deleteEmployee(int id) throws SQLException {
        empDao.deleteEmployee(id);
    }
}
