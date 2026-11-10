class Car{
    String color;
    void speed(int num){
        System.out.println("speed...+ num");
        
    }
}

class Main7 {
    public static void main(String[] args) {
        Car bmw=new Car();
        Car RR=new Car();
        Car Tesla=new Car();
        Car Ferari=new Car();
        bmw.color="red";
        RR.color="white";
        Tesla.color="black";
        Ferari.color="blue";
        System.out.println("bmw.color");
        System.out.println("RR.color");
        System.out.println("Tesla.color");
        System.out.println("Ferari.color");
        bmw.speed(200);
        RR.speed(200);
        Tesla.speed(200);
        Ferari.speed(200);

    }
    
}
 
    

