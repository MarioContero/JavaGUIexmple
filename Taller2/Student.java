package Taller2;

import java.util.Date;

public class Student extends Person {
   private int level;
/***
 * 
 * @param id
 * @param firstName
 * @param lastName
 * @param birthDate
 * @param email
 * @param phoneNumber
 * @param level
 */

   
public Student(String id, String firstName, String lastName, Date birthDate, String email, String phoneNumber,
        int level) {
    super(id, firstName, lastName, birthDate, email, phoneNumber);
    this.level = level;
}
/***
 * 
 * @return level
 */
public int getLevel() {
    return level;
}
/***
 * 
 * @param level
 */
public void setLevel(int level) {
    this.level = level;
}
/***
 * Imprime la informacion herdada mas el nivel
 */
@Override
public void print() {
     
    super.print();
    System.out.println("Level: " + this.level);
}    
}
