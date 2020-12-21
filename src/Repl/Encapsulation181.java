package Repl;

public class Encapsulation181 {

    public static void main(String[] args) {
        EncapsulationDemo obj = new EncapsulationDemo();
        obj.setName("Mario");
        obj.setAge(32);
        System.out.println("Employee Name: " + obj.getName());
        System.out.println("Employee Age: " + obj.getAge());

    }

    static class EncapsulationDemo {
        private String empName;
        private int empAge;

        public String getName() {
            return empName;
        }

        public int getAge() {
            return empAge;
        }

        public void setName(String newName) {
            empName = newName;
        }

        public void setAge(int newAge) {
            empAge = newAge;
        }


    }

}
