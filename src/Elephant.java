public class Elephant {
        private String name;
        private int age;
        private int weight;
        private boolean asleep;

        public Elephant(String name, int age, int weight, boolean asleep) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.asleep = asleep;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public boolean isAsleep() {
            return asleep;
        }

        public void setAsleep(boolean asleep) {
            this.asleep = asleep;
        }

        public void printInfo() {
            System.out.println("NAME: " + name);
            System.out.println("AGE: " + age);
            System.out.println("WEIGHT " + weight);
            System.out.println("ASLEEP: " + asleep);
            System.out.println();
        }

        public void greet (Elephant greeting) {
            System.out.println("Hello " + getName() + " how are you?");
        }
        

        public static void main(String[] args) {

            Elephant father = new Elephant("Kalle", 50, 500, false);

            Elephant mother = new Elephant("Kerstin", 47, 450, false);

            Elephant daughter = new Elephant("Kristina", 14, 200, true);
            
            father.greet(daughter);
        }
}
