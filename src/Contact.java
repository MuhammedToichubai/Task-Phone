
public class Contact {
    //    1. Contact деген класс тузунуз, полелери(contactName, phoneNumber).
    private String contactName;
    private String phoneNumber;

    public Contact (){
    }

    public Contact(String contactName, String phoneNumber){
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
    }

    public String getContactName(){
        return contactName;
    }

    public void  setContactName(String contactName){
        this.contactName = contactName;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getInfo(){
        return String.format("""
                Contact name: %s
                Phone number: %s
                """, contactName, phoneNumber);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contactName='" + contactName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

