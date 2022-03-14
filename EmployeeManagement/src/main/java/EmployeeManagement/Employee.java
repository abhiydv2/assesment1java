package EmployeeManagement;

public class Employee{  
    public static void main(String args[]) {  
          
        EmployeeDetails emp = new EmployeeDetails(0, 0, null, null, null, null);  
        emp.setEmp_id(101);  
        emp.setName("Abhi");  
        emp.setDepartment("IT");  
        emp.setSalary(30000);  
        emp.setAddress("New Delhi");  
        emp.setEmail("abhi123@gmail.com");  
          
        //Showing Employee details  
        System.out.println(emp);    
    }  
}  