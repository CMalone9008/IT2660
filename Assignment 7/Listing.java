
package listing;
public class Listing {

private String name;
private String address;
private String idNumber;

public Listing(String name, String address, String idNumber){
    name = name;
    address = address;
    idNumber = idNumber;
}
public String getIdNumber(){
    return idNumber;
}
public void setIdNumber(String idNumber){
    this.idNumber = idNumber;
}
public String toString(){
    return("Name is " + name +"\nAddress is " + address + 
            "\nId number is " + idNumber+ "\n");
}

public Listing clone(){
    Listing clone = new Listing(name, address, idNumber);
    return clone;
}
public void setAddress(String address){
    this.address = address;
}
public String getName(){
    return name;
}
public String getIdNumber(String idNumber){
    return idNumber;
}
}
