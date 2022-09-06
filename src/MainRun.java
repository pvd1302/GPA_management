import entity.subject;
import entity.GPA_manage;
import entity.student;
import DB.DB_Engine;

import java.io.*;
import java.util.Scanner;
import java.util.ServiceLoader;

public class MainRun {
    private static GPA_manage gpam;
    private static DB_Engine db = new DB_Engine();
    private static student[] STUDENT = new student[100];
    private static subject[] SUBJECT = new subject[100];
    private static GPA_manage[] GPAMANAGE = new GPA_manage[100];

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        while (true) {
            int functionChoice = functionChoice();
            switch (functionChoice) {
                case 1:
                    InputSubject();
                    break;
                case 2:
                    showSubject();
                    break;
                case 3:
                    inputStudent();
                    break;
                case 4:
                    showStudent();
                    break;
                case 5:
                    try {
                        gpam.InputMark();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;

            }
        }
    }

    private static int functionChoice() {
        Scanner sc=new Scanner(System.in);
        System.out.println("========= Chương trình quản lý điểm sinh viên ============ ");
        System.out.println("1.Nhập danh sách môn học mới");
        System.out.println("2.Hiển thị danh sách môn học");
        System.out.println("3.Nhập danh sách sinh vien mới");
        System.out.println("4.Hiển thị danh sách sinh vien");
        System.out.println("5.Kê khai giảng dạy");
        System.out.println("6.Bảng kê khai giảng dạy");
        System.out.println("7.Sắp xếp danh sách kê khai theo tên");
        System.out.println("8.Sắp xếp danh sách kê khai theo số tiết");
        System.out.println("9.Bảng tiền công cho giảng viên ");
        System.out.println("10.Thoát");
        System.out.println("Mời bạn chọn: ");
        int choice=-1;
        do {
            choice=sc.nextInt();
            if(choice<9&&choice>=1){
                break;
            }
        }while (choice>9||choice<1);
        return choice;
    }

    private static void InputSubject(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập số môn học muốn thêm");
        int quantiSubject=sc.nextInt();
        subject[] subjectArr =  new subject[quantiSubject];
        for (int i = 0; i < quantiSubject; i++) {
            System.out.println("Nhập thông tin môn học thứ "+i+" : ");
            subject subject=new subject();
            subject.inputInforSubject();
            subjectArr[i] = subject;
        }
        //lưu thông tin môn học
        try {

            db.SaveFileSubject("src/data/subject.txt",subjectArr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void showSubject(){
        try {
            db.readFile("src/data/subject.txt");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void inputStudent(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên muốn thêm: ");
        int quantiStudent=sc.nextInt();
        student[] studentArr =  new student[quantiStudent];
        for (int i = 0; i < quantiStudent; i++) {
            System.out.println("Nhập thông tin sinh viên thứ "+i+":");
            student st=new student();
            st.inputInforStudent();
            studentArr[i]=st;

        }
        //Save thông tin sinh viên
        try {
            db.SaveFileStudent("src/data/student.txt",studentArr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void showStudent(){
        try {
            db.readFile("src/data/student.txt");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
