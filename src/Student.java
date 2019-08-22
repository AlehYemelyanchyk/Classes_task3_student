/*3. Создайте класс с именем task3student, содержащий поля: фамилия и инициалы, намер группы, успеваемость
(массив из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность
вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.*/

public class Student {

    private String fio;
    private String groupNumber;
    private int[] performance;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getPerformance() {
        return performance;
    }

    public void setPerformance(int[] performance) {
        this.performance = performance;
    }
}


