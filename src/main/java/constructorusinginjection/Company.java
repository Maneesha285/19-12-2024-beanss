package constructorusinginjection;

public class Company {



        private String name;
        private int id;
        private String state;
        private String city;

   public Company() {

        }

    public Company(String name, int id, String state, String city){
            this.name = name;
            this.id = id;
            this.state = state;
            this.city = city;

        }
        public void printCompany () {
            System.out.println(name);
            System.out.println(id);
            System.out.println(state);
            System.out.println(city);
        }

    }


