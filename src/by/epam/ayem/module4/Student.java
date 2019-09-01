package by.epam.ayem.module4;/*3. Создайте класс с именем task3student, содержащий поля: фамилия и инициалы, намер группы, успеваемость
(массив из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность
вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.*/

class Student {

    private String fio;
    private String groupNumber;
    private int[] performance;

    String getFio() {
        return fio;
    }

    void setFio(String fio) {
        this.fio = fio;
    }

    String getGroupNumber() {
        return groupNumber;
    }

    void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    int[] getPerformance() {
        return performance;
    }

    void setPerformance(int[] performance) {
        this.performance = performance;
    }
}


