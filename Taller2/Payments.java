package Taller2;
import java.util.*;

public class Payments {
private int id;
private Students student;
private float amount;
private Date paymentDate;


public Payments(int id, Students student2, float amount, Date i) {
    this.id = id;
    this.student = student2;
    this.amount = amount;
    this.paymentDate = i;
}


public int getId() {
    return id;
}


public void setId(int id) {
    this.id = id;
}


public Students getStudent() {
    return student;
}


public void setStudent(Students student) {
    this.student = student;
}


public float getAmount() {
    return amount;
}


public void setAmount(float amount) {
    this.amount = amount;
}


public Date getPaymentDate() {
    return paymentDate;
}


public void setPaymentDate(Date paymentDate) {
    this.paymentDate = paymentDate;
}

 

public void printPayment () {
    System.out.println("*******Factura N- "+ this.getId()+ "******" );
    System.out.println("Estudiante " + this.getStudent().getFullname());
    System.out.println("monto " + this.amount);
    System.out.println("fecha " + this.paymentDate);
           
}
}
