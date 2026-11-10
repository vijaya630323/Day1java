class Animal {
    String color="white";
    Integer height=6;
    Integer weight=70;
    void sound(){
        System.out.println("ambaaa");
    }
    void behaviour(){
         System.out.println("domestic");
    }
        
    }
class Cow{
    public static void main(String[] args) {
        Animal obj = new Animal();
        System.out.println(obj.color);
        System.out.println(obj.height);
        System.out.println(obj.weight);
        obj.sound();
        obj.behaviour();
        

    }
}