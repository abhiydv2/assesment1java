package EmployeeManagement;

import java.util.HashMap;
import java.util.Map;

public class EmpDB {
	static Map<Integer,EmployeeDetails> EmpDB;
	static {
		EmpDB=new HashMap<Integer, EmployeeDetails>();
		EmpDB.put(11111, new EmployeeDetails(111,15000,"Abhi","Delhi","IT","ab@gmail.com"));
		EmpDB.put(11122, new EmployeeDetails(112,15000,"Aanya","Delhi","IT","aa@gmail.com"));
		EmpDB.put(11133, new EmployeeDetails(113,15000,"Ganesh","Delhi","IT","ga@gmail.com"));
		EmpDB.put(11144, new EmployeeDetails(114,15000,"Kartik","Delhi","IT","kar@gmail.com"));
		EmpDB.put(11155, new EmployeeDetails(115,15000,"Arjun","Delhi","IT","ar@gmail.com"));
		EmpDB.put(11166, new EmployeeDetails(116,15000,"Darshan","Delhi","IT","dar@gmail.com"));
		EmpDB.put(11177, new EmployeeDetails(117,15000,"Vishal","Delhi","IT","vi@gmail.com"));
		EmpDB.put(11188, new EmployeeDetails(118,15000,"Harsh","Delhi","IT","ha@gmail.com"));
		EmpDB.put(11199, new EmployeeDetails(119,15000,"Vivek","Delhi","IT","vi@gmail.com"));
		EmpDB.put(22222, new EmployeeDetails(222,15000,"Kunal","Delhi","IT","ku@gmail.com"));
	}
}
