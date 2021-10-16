package lab1.task2;


import org.w3c.dom.ls.LSOutput;

import java.util.Objects;

public class main {
    public static void main(String[] args) {

        Course Primulcurs = new Course();
        Student[] studenti = new Student[3];

        studenti[0] = new Student();
        studenti[0].setName("Andrei");
        studenti[0].setYear(2020);

        studenti[1] = new Student();
        studenti[1].setName("Alex");
        studenti[1].setYear(2020);

        studenti[2] = new Student();
        studenti[2].setName("Alin");
        studenti[2].setYear(2019);

        Primulcurs.setTitle("POO");
        Primulcurs.setDescription("curs cu sefu de programare pe obiecte");
        Primulcurs.setStudenti(studenti);

        int an = 2020;

        System.out.println("Studentii din anul " + an + " sunt ");

        int j = 0;
        while (Primulcurs.filterYear(an)[j] != null) {

            System.out.println(Primulcurs.filterYear(an)[j]);
            j++;
        }

        Student s1 = new Student(), s2 = new Student();

        s1.setName("Robert");
        s1.setYear(2018);

        s2.setName("Robert");
        s2.setYear(2018);

        System.out.println(Objects.equals(s1, s2));

    }
}