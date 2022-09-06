package entity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import DB.DB_Engine;

public class GPA_manage {
    private static DB_Engine db = new DB_Engine();

    private student Student;
    private subject Subject[];
    private float[] mark;

    public student getStudent() {
        return Student;
    }

    public void setStudent(entity.student student) {
        this.Student = student;
    }

    public subject[] getSubject() {
        return Subject;
    }

    public void setSubject(entity.subject[] subject) {
        this.Subject = subject;
    }
    public void InputMark() throws IOException {
        Scanner sc=new Scanner(System.in);
        FileReader fr = new FileReader("src/Data/student.txt");
        FileReader fr2 = new FileReader("src/Data/subject.txt");
        BufferedReader br = new BufferedReader(fr);
        BufferedReader br2 = new BufferedReader(fr2);
        String line = "", line2 = "", temp ="";
        int i = 0;
        while (true){
            if(line == null){
                break;
            }
            try {
                line = br.readLine();
                String[] lineArr = line.split(",");
                temp = lineArr[1].substring(8);
                System.out.print(lineArr[1].substring(8));
                while (true){
                    if(line == null){
                        break;
                    }
                    try {
                        line2 = br2.readLine();
                        String[] lineArr2 = line.split(",");
                        System.out.println(lineArr2[1].substring(11));
                        mark[i] = sc.nextFloat();
                        temp = temp + " " + mark[i];
                        i++;
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }

                }

            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            FileWriter fw = new FileWriter("src/data/mark.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(temp);
            bw.newLine();
            bw.close();
            fw.close();
        }
    }

    public void OutputMark() {

    }

    @Override
    public String toString() {
        return "Mark{" +
                "Student=" + Student +
                ", GPA-detail="  +
                '}';
    }


    public float[] getMark() {
        return mark;
    }


    public void setMark(float[] diem) {
        this.mark = mark;
    }
}
