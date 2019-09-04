package by.epam.ayem.module4;

/*3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте
возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.*/

import java.util.Random;

public class StudentsBase {

    public void run() {

        Student[] students = new Student[10];
        students[0] = createStudent("ASA", "1674");
        students[1] = createStudent("BSD", "5575");
        students[2] = createStudent("OPS", "3388");
        students[3] = createStudent("RSC", "5575");
        students[4] = createStudent("DKB", "3388");
        students[5] = createStudent("OND", "5575");
        students[6] = createStudent("ZSV", "1674");
        students[7] = createStudent("PPD", "3388");
        students[8] = createStudent("RSC", "5575");
        students[9] = createStudent("CPU", "1674");

        printBestStudents(students);
    }

    public Student createStudent(String fio, String groupNumber) {

        Student student = new Student();

        student.setFio(fio);
        student.setGroupNumber(groupNumber);

        int[] performance = new int[5];
        fillArray(performance);
        student.setPerformance(performance);

        return student;
    }

    private void fillArray(int[] array) {

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = 8 + random.nextInt(3);
        }
    }

    public void printBestStudents(Student[] students) {

        int min = 9;

        for (Student student : students) {

            boolean print = true;

            int[] grades = student.getPerformance();
            for (int grade : grades) {
                if (grade < min) {
                    print = false;
                    break;
                }
            }
            if (print) {
                System.out.println("Student " + student.getFio() + ", " +
                        "group #" + student.getGroupNumber());
            }
        }
    }
}
