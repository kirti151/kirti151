public class objectcreation 
{
    public static void main(String[] args) 
    {
        patient p1= new patient();
        p1.name="annu";
        p1.ID=23;
        p1.display();

        
    }
    static class patient 
    {
        String name;
        int ID;
        void display()
        {
            System.out.println("name:" +name);
            System.out.println("id:" +ID);
        }
    }
}
