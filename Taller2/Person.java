package Taller2;

import java.util.Date;

public class Person{
String id;
String firstName;
String lastName;
Date birthDate;
String email;
String phoneNumber;
/**
 * 
 * @param id
 * @param firstName
 * @param lastName
 * @param birthDate
 * @param email
 * @param phoneNumber
 */

public Person(String id, String firstName, String lastName, Date birthDate, String email, String phoneNumber) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthDate = birthDate;
    this.email = email;
    this.phoneNumber = phoneNumber;
}

/***
 * 
 * @return id
 */

public String getId() {
    return id;
}
/***
 * 
 * @return firstName
 */
public String getFirstName() {
    return firstName;
}
/***
 * 
 * @param firstName
 */
public void setFirstName(String firstName) {
    this.firstName = firstName;
}
/***
 * 
 * @return lastName
 */
public String getLastName() {
    return lastName;
}
/***
 * 
 * @param lastName
 */
public void setLastName(String lastName) {
    this.lastName = lastName;
}
/***
 * 
 * @return birthDate
 */
public Date getBirthDate() {
    return birthDate;
}
/***
 * 
 * @param birthDate
 */
public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
}
/***
 * 
 * @return email
 */
public String getEmail() {
    return email;
}
/***
 * 
 * @param email
 */
public void setEmail(String email) {
    this.email = email;
}
/***
 * 
 * @return phoneNumber
 */
public String getPhoneNumber() {
    return phoneNumber;
}
/***
 * 
 * @param phoneNumber
 */
public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
}
/***
 * 
 * @return birthDate
 */
public Date getbirthDate() {
    return birthDate;}

/***
 * 
 * @return Nombre completo
 */
public String getFullname( ) { 
    String st=firstName+" "+lastName;     
    return st;}

 /***
  * 
  * @return Edad MM/DD/YYYY
  */
    public int getAge(){
        
        return (int) Math.floor((Math.abs((new Date().getTime()- getBirthDate().getTime())/ (1000 * 60 * 60 * 24))/365));  
    
    }

/**
 * Imprime la infomracion completa de Persona
 */
public void print () {
    System.out.println("*******" + this.getFullname()+"*******");
    System.out.println("ID:" + this.id);
    System.out.println("Birth Date" + this.birthDate);
    System.out.println("edad " + this.getAge());
    System.out.println("Email" + this.email);
    System.out.println("Phone Number " + this.phoneNumber);

}
        
}
