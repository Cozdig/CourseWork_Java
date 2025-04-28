public class Main {

    private static Employee[] employees = new Employee[10];

    public static void printEmployees() {
        for (Employee employees : employees) {
            System.out.println(employees);
        }
    }

    public static int sumMoney() {
        int sumMoney = 0;
        for (int i = 0; i < employees.length; i++) {
            int currentMoney = employees[i].getMoney();
            sumMoney += currentMoney;
        }
        return sumMoney;
    }

    public static int minMoney() {
        int minMoney = employees[0].getMoney();
        for (int i = 0; i < employees.length; i++) {
            int currentMoney = employees[i].getMoney();
            if (currentMoney < minMoney) {
                minMoney = currentMoney;
            }
        }
        return minMoney;
    }

    public static int maxMoney() {
        int maxMoney = employees[0].getMoney();
        for (int i = 0; i < employees.length; i++) {
            int currentMoney = employees[i].getMoney();
            if (currentMoney > maxMoney) {
                maxMoney = currentMoney;
            }
        }
        return maxMoney;
    }

    public static int mediumMoney() {
        int mediumMoney = sumMoney() / employees.length;
        return mediumMoney;
    }

    public static void printFullNameEmployees() {
        System.out.println(employees[0].getFullName());
        System.out.println(employees[1].getFullName());
        System.out.println(employees[2].getFullName());
        System.out.println(employees[3].getFullName());
        System.out.println(employees[4].getFullName());
        System.out.println(employees[5].getFullName());
        System.out.println(employees[6].getFullName());
        System.out.println(employees[7].getFullName());
        System.out.println(employees[8].getFullName());
        System.out.println(employees[9].getFullName());
    }


    public static void main(String[] args) {
        employees[0] = new Employee("Петров Петр Олегович", "1", 120000);
        employees[1] = new Employee("Лобанов Олег Иванович", "2", 160000);
        employees[2] = new Employee("Черноус Елисей Александрович", "4", 110000);
        employees[3] = new Employee("Романенко Роман Олегович", "5", 40000);
        employees[4] = new Employee("Быков Георгий Григорьевич", "1", 50000);
        employees[5] = new Employee("Коровин Иван Олегович", "3", 155000);
        employees[6] = new Employee("Мухин Александр Васильевич", "2", 60000);
        employees[7] = new Employee("Пчелкин Валерий Олегович", "2", 54000);
        employees[8] = new Employee("Васильев Василий Олегович", "1", 24000);
        employees[9] = new Employee("Фомин Алексей Петрович", "5", 150000);
        printEmployees();
        System.out.println(sumMoney());
        System.out.println(minMoney());
        System.out.println(maxMoney());
        System.out.println(mediumMoney());
        printFullNameEmployees();
    }
}