import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import cloning.Address1;
import cloning.Person1;
import copyconstructor.Address2;
import copyconstructor.Person2;
import serializable.Address3;
import serializable.Person3;

public class App {
  public static void main(String[] args) throws Exception {
    /* 
     * Using Clone (not recommended)
     */
    System.out.println("=== Using Clone");
    Person1 person1 = new Person1(new String[]{"Parikshit", "Patil"},
                      new Address1("Sanjivani", 416));
    // clone person1
    Person1 person2 = (Person1) person1.clone();
    person2.names[1] = "XXX";
    person2.address.houseNumber = 417;

    System.out.println(person1);
    System.out.println(person2);

    /* 
     * Copy Constructor
     */
    System.out.println("=== Using Copy Constructor");
    Person2 person3 = new Person2(new String[]{"Parikshit", "Patil"},
                      new Address2("Sanjivani", 416));
    // copy person3
    Person2 person4 = new Person2(person3);
    person4.names[1] = "XXX";
    person4.address.houseNumber = 417;

    System.out.println(person3);
    System.out.println(person4);

    /* 
     * Using Serializable
     */
    System.out.println("=== Using Copy Constructor");
    Person3 person5 = new Person3(new String[]{"Parikshit", "Patil"},
                      new Address3("Sanjivani", 416));
    // Serialization
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    ObjectOutputStream out = new ObjectOutputStream(bos);
    out.writeObject(person5);

    //De-serialization
    ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
    ObjectInputStream in = new ObjectInputStream(bis);
    Person3 person6 = (Person3) in.readObject();
    
    person6.names[1] = "XXX";
    person6.address.houseNumber = 417;

    System.out.println(person5);
    System.out.println(person6);
  }
}
