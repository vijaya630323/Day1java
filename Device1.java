class Laptop{
    String brand="lenevo";
    Integer ramsize=130;
    Float price=23000.0f;
   void bootup(){
        System.out.println("laptop is starting...");
    }
    }
    
class Device1 {
    public static void main(String[] args) {
            Laptop lenv=new Laptop();
            System.out.println(lenv.brand);
            System.out.println(lenv.ramsize);
            System.out.println(lenv.price);
            lenv.bootup();
        }
    }
