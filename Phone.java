class Smartphone{
    String model=("realme");
    String os=("android");
    Integer storage=120;
    void takePhoto()
    {
        System.out.println("click photo captured..");
    }
    void internet()
    {
        System.out.println("loading website");
    }
}

 class Phone {
    public static void main(String[] args) {
        Smartphone obj= new Smartphone();
        System.out.println(obj.model);
        System.out.println(obj.os);
        System.out.println(obj.storage);
        obj.takePhoto();
        obj.internet();
    }
}

