package Taller2;

import java.util.Date;


public class Students{
    private String id;
    private String firstName;
    private String lastName;
    private Date birthDate;


/***
 * 
 * @param id
 * @param firstName
 * @param lastName
 * @param birthDate
 */

public Students(String id, String firstName, String lastName, Date birthDate) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthDate = birthDate;
}
/**
 * 
 * @return id
 */
public String getId() {
    return id;
}
/***
 * 
 * @param id
 */
public void setId(String id) {
    this.id = id;
}
/***
 * 
 * @return firstname
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
 * @return lastname
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
     * @return nombre completo
     */
    public String getFullname( ) { 
        String st=firstName+" "+lastName;     
        return st;}

    /***
     * 
     * @return Muestra la edad completa
     */
    public int getAge(){
        return (int) Math.floor((Math.abs((new Date().getTime()- getBirthDate().getTime())/ (1000 * 60 * 60 * 24))/365));
    }
    
       /**
        * imprime la informacion del estudiante
        */
    public void printStudent () {
        System.out.println("*******" + this.getFullname()+"*******");
        System.out.println("ID "+ this.getId());
        System.out.println("Fecha de nacimiento " + this.getBirthDate());
        System.out.println("edad " +this.getAge());
    }
}