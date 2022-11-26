package Taller2;

import java.util.Date;

public class Staff extends Person {
 Double salary;
 String department;  

 /***
  * 
  * @param id
  * @param firstName
  * @param lastName
  * @param birthDate
  * @param email
  * @param phoneNumber
  * @param salary
  * @param department
  */
  
   public Staff(String id, String firstName, String lastName, Date birthDate, String email, String phoneNumber,
        Double salary, String department) {
    super(id, firstName, lastName, birthDate, email, phoneNumber);
    this.salary = salary;
    this.department = department;

} 
/***
 * 
 * @return salary
 */

public Double getSalary() {
    return salary;
}
/***
 * 
 * @param salary
 */

public void setSalary(Double salary) {
    this.salary = salary;
}
/***
 * 
 * @return department
 */

public String getDepartment() {
    return department;
}
/***
 * 
 * @param department
 */

public void setDepartment(String department) {
    this.department = department;
}
/**
 * Imprime la informacion de pesonas mas salario y departamento
 * */
@Override
public void print() {
    
    super.print();
   
    System.out.println("Salario: $" + String.format("%.2f",getSalary()));
    System.out.println("Departamento: " + this.department );

}

}