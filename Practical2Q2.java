public class Practical2Q2 {
    // Refactor class
    class Staff{
        private String name;
        private int id;
        private String title;
        private Address[] addressList;

        // Constructor

        public Staff(String name, int id, String title, Address[] addressList){
            this.name = name;
            this.id = id;
            this.title = title;
            this.addressList = addressList;
        }

        public String GetAddress() {
            String address = "";

            for(int i = 0; i < addressList.length; i++){
                address += addressList[i].toString();
            }

            return address;
        }

    } // end of class

    class Address{
        private String line1;
        private String line2;
        private String city;
        private String state;
        private String country;
        private String postalCode;

        public Address(String line1, String line2, String city, String state, String country, String postalCode){
            this.line1 = line1;
            this.line2 = line2;
            this.city = city;
            this.state = state;
            this.country = country;
            this.postalCode = postalCode;
        }

        @Override
        public String toString(){
            return String.format("%s, %s, %s, %s, %s, %s", line1, line2, city, postalCode, state, country);
        }

    }

}
