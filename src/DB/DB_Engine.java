package DB;

import entity.subject;
import entity.student;

import java.io.*;

public class DB_Engine {
    public void SaveFileSubject ( String fileName , subject[] subjects )
            throws Exception {
        FileWriter fw = new FileWriter(fileName,true);
        BufferedWriter bw = new BufferedWriter(fw);
        for(subject sj : subjects){
            bw.write(sj.toString());
            bw.newLine();
        }
        bw.close();
        fw.close();
    }

    public void SaveFileStudent ( String fileName , student[] students )
            throws Exception {
        FileWriter fw = new FileWriter(fileName,true);
        BufferedWriter bw = new BufferedWriter(fw);
        for(student st : students){
            bw.write(st.toString());
            bw.newLine();
        }
        bw.close();
        fw.close();
    }

    public void readFile ( String fileName ) throws Exception {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        while (true){
            if(line == null){
                break;
            }
            line = br.readLine();
            System.out.println(line);
        }
    }
}
