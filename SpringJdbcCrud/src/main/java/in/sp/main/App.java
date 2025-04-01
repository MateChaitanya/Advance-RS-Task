package in.sp.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigFile;

public class App 
{
    public static void main( String[] args )
    {

    	 
    	
    	
    ApplicationContext context =  new AnnotationConfigApplicationContext(SpringConfigFile.class);
    
  JdbcTemplate jdbcTemplate =  context.getBean(JdbcTemplate.class);
 // ---------Insert Operation-----------
  /*int std_roll=101;
	 String std_name="Chaitanya";
	 float std_marks = 95;
  
  String insert_sql_query ="insert into student values(?,?,?)";
  int count =jdbcTemplate.update(insert_sql_query,std_roll,std_name,std_marks );
  if(count >0){
	  System.out.println("insert Success");
	  
  }
  else {
	 System.out.println("insert not Success");

  }*/
  //-----------UPDATE OPERATION ------------
  
  float marks =98.33f;
  int rollno =101;
  String update_sql_query ="update student  set std_marks=? where std_roll=?";
  int count =jdbcTemplate.update(update_sql_query,marks,rollno );
  if(count >0){
	  System.out.println("updation Success");
	  
  }
  else 
  {
	 System.out.println("updation failed");

  }
  
  
  //------------------- DELETE OPERATION-------------
  /*int rollno=101;
    String delete_sql_query="delete from student where std_roll=?";
    int count =jdbcTemplate.update(delete_sql_query,rollno );
    if(count >0){
  	  System.out.println("delete Success");
  	  
    }
    else 
    {
  	 System.out.println("delete failed");

    }*/
  

 }

    }

