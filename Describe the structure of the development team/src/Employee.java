public abstract class Employee {
    private String name;

     Employee(String name) {
         this.name = name;
     };

     String getName() {
         return this.name;
     }

     String getLastName() {
         return "";
     }

     abstract String getPosition();

     abstract String getSeniority();

     String getInfo() {
         return this.getName() + " " + this.getLastName() + " is a " + this.getPosition();
     }

}
