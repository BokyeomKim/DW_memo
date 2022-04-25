public class chef {

    private static Chef chef = null;

    public static Chef = getInstance(){
        if(chef == null){
            chef = new chef();
        }
        return chef;
    }

    public void printHello() {
        System.out.println("Hello World");
    }
}