public class Main {
    public static void main(String[] args) {
        var totalTime = 640;
        var employeeTime = 8;
        var numberOfEmployees = totalTime / employeeTime;
        System.out.println("В компании, при проекте, требующим " + totalTime + " часов, в который каждый сотрудник вкладывает " + employeeTime + " часов, работает " + numberOfEmployees + " сотрудников");
        numberOfEmployees = numberOfEmployees + 94;
        employeeTime = totalTime / numberOfEmployees;
        System.out.println("Если в компании работает " + numberOfEmployees + " человека, то всего " + employeeTime + " часа работы может быть поделено между сотрудниками");
    }
}