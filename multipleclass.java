public class multipleclass {
    public static void main(String[] args) {
        
        //obj for patient class

        patient p1=new patient();
        p1.name="anku";
        p1.ID=67;

        // object for fruit class

        Fruit f1=new Fruit();
        f1.fname="mango";
        f1.fprice=23;
        p1.display();
        f1.displayinfo();

        
    }
    static class patient
    {
        String name;
        int ID;
        void display()
        {
            System.out.println("Name: "+name);
            System.out.println("ID: " +ID);
        }
    }
    static class Fruit 
    {
       String fname;
       int fprice;
       void displayinfo()
       {
        System.out.println("Fruit name: "+fname);
        System.out.println("Fruit rpice: "+fprice);
       }
    }
    
}
