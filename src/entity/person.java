package entity;

public class person {
    protected String name;
    protected String address;
    protected String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString(){
        return "entity.person{" +

                ", name='"+this.name+'\''+
                ", address='"+this.address+'\''+
                ", phoneNumber='"+this.phoneNumber+'\''+
                '}';
    }
}
