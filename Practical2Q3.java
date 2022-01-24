public class Practical2Q3 {
    // Don't use inheritance because no need
    // More focused on the methods
    // So use implementation (polymorphism)
    // Think in such a way that it makes adding new categories easy
    // Or more logical
    // Scalability and maintainability

    public interface Machine{
        abstract String move();
    }

    class Car implements Machine{

        public Car() {
        }

        @Override
        public String move(){
            return "roll";
        }
    }

    class Plane implements Machine{

        public Plane() {
        }

        @Override
        public String move(){
            return "roll";
        }
    }

    class Ship implements Machine{

        public Ship() {
        }

        @Override
        public String move(){
            return "float";
        }
    }

    class MachineOperation
    {
        Machine m;

        public MachineOperation(Machine m)
        {
            this.m=m;
        }

        public String moveMachine()
        {
            return this.m.move();
        }
    }
}
