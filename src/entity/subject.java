package entity;

import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class subject implements Serializable{
    private int ID;
    private String nameSubject;
    private int teach_unit;
    private String type;

    private int quantiSubject;

    public int getQuantiSubject() {
        return quantiSubject;
    }

    public void setQuantiSubject(int quantiSubject) {
        this.quantiSubject = quantiSubject;
    }

    private static final String DAICUONG="Đại cương";
    private static final String COSONGANH="Cơ sở ngành";
    private static final String CHUYENNGANH="Chuyên ngành";


    private static int AUTO_ID=-1;
    public subject(){

        if(AUTO_ID==-1){
            AUTO_ID=100;
            this.ID=AUTO_ID;
            return;
        }
        this.ID=++AUTO_ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String tenMon) {
        this.nameSubject = nameSubject;
    }

    public int getTeach_unit() {
        return teach_unit;
    }

    public void setTeach_unit(int teach_unit) {
        this.teach_unit = teach_unit;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public subject(int ID, String nameSubject, int teach_unit, String type) {
        this.ID = ID;
        this.nameSubject = nameSubject;
        this.teach_unit = teach_unit;
        this.type = type;
    }


    @Override
    public String toString(){
        return "entity.subject{" +
                "ID="+ID+'\''+
                ", nameSubject='"+nameSubject+'\''+
                ", teach_unit='"+teach_unit+'\''+
                ", type='"+type+'\''+
                '}';
    }

    public void inputInforSubject(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập tên môn học: ");
        this.nameSubject=sc.nextLine();
        try {
            System.out.print("Nhập số đơn vị học trình : ");
            this.teach_unit=sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println(e);
            System.out.println("Xảy ra lỗi khi nhập số đơn vị học trình");
        }

        System.out.println("Loại môn thuộc 1 trong 3 lựa chọn dưới đây");
        System.out.println("1.Đại cương");
        System.out.println("2.Cơ sở ngành");
        System.out.println("3.Chuyên ngành");
        System.out.print("Mời bạn chọn: ");
        int choice=-1;
        do {
            try {
                choice=sc.nextInt();
                if(choice<4&&choice>=1){
                    break;
                }
                System.out.println("Chỉ lựa chọn 1 trong 3lựa chọn trên");
            }catch (Exception ex){
                System.out.println(ex);
                System.out.println("Xảy ra lỗi khi chọn 1 trong loai môn học");
            }

        }while (choice>4||choice<1);
        switch (choice){
            case 1:
                this.type=DAICUONG;
                break;
            case 2:
                this.type=COSONGANH;
                break;
            case 3:
                this.type=CHUYENNGANH;
                break;
        }
    }

}
