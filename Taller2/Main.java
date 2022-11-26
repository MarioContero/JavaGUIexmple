package Taller2;

import java.util.Date;

public class Main {

      public static void main(String[] args) {
           
       Students student = new Students("1721689295", "Mario", "Contero", new Date("6/09/1991"));
       student.printStudent();
       
        Payments factura  = new Payments(00100200120, student, 100.55f, new Date());
        factura.printPayment();

      Person humano = new Person("1721689295", "Mario", "Contero", new Date("6/09/1991"), "mcontero91@gmial.com", "0992651869");
        humano.print();

        Student  estudiante = new Student("1721689295", "Mario", "Contero", new Date("6/09/1991"), "mcontero91@gmial.com", "0992651869", 2);
        estudiante.print();

        Staff profesor = new Staff("147893652", "Pablo", "Barbecho", new Date("7/09/1981"), "pb@puce.com", "09985698745", 1500., "Tecnologia");
        profesor.print();
       }
      }
      

    
 

