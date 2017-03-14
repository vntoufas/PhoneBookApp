
public class Contact {
    
    private String Name;
    private String Address;
    private String Phone_Number;
    
    public Contact()
    {
        Name = null;
        Address = null;
        Phone_Number = null;
    }
    public Contact(String Name, String Address, String Phone_Number)
    {
        this.Name=Name;
        this.Address=Address;
        this.Phone_Number=Phone_Number;
    }
    
    public String getName() {return Name;}
    public String getAddress() {return Address;};
    public String getPhone_Number(){return Phone_Number;};
    
    public void setName(String Name){this.Name=Name;};
    public void setAddress(String Address){this.Address=Address;};
    public void setPhone_Number(String Phone_Number){this.Phone_Number=Phone_Number;};
    
    public String toString()
    {
        return "Onoma " + Name + " Dieuthinsi " + Address + " Thlefwno " + Phone_Number;
    }
    
    
    
}
