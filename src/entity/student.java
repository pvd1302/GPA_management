package entity;

import java.io.Serializable;
import java.util.Scanner;
import java.util.SortedMap;
public class student extends person implements Serializable{

    private int ID;
    private String name;
    private String address;
    private String phoneNumber;

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String hoTen) {
        this.name = name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String diaChi) {
        this.address = address;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void setPhoneNumber(String sdt) {
        this.phoneNumber = phoneNumber;
    }

    private String claSS;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getClaSS() {
        return claSS;
    }

    public void setClaSS(String claSS) {
        this.claSS = claSS;
    }
    private static int AUTO_ID=-1;

    public student(){

        if (AUTO_ID==-1){
            AUTO_ID=100;
            this.ID=AUTO_ID;
            return;
        }
        this.ID=++AUTO_ID;
    }
    public student(int ID,String name,String address,String phoneNumber, String claSS) {

        this.ID = ID;
        this.name=name;
        this.address=address;
        this.phoneNumber=phoneNumber;
        this.claSS = claSS;
    }



    public void inputInforStudent(){
        Scanner sc=new Scanner(System.in);
        try {
            System.out.print("Nhập tên sinh viên: ");
            this.name=sc.nextLine();
            System.out.print("Nhập địa chỉ: ");
            this.address=sc.nextLine();
            System.out.println("Nhập SĐT: ");
            this.phoneNumber=sc.nextLine();
            System.out.println("Nhập lớp: ");
            this.claSS=sc.nextLine();
        }catch (Exception ex){
            System.out.println(ex);
            System.out.println("Đã xảy ra lỗi trong quá trình nhập");
        }

    }

    @Override
    public String toString(){
        return "entity.student{" +
                "ID"+this.ID+'\''+
                ", name='"+this.name+'\''+
                ", address='"+this.address+'\''+
                ", phoneNumber='"+this.phoneNumber+'\''+
                ",claSS='"+this.claSS+'\''+
                '}';
    }
}
