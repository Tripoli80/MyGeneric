public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Generic!");

        Gen<Integer> exemple = new Gen<>();
        exemple.x=5;
        exemple.y=5;
        Gen<String> exempel2= new Gen<>();
        exempel2.x = "hi my gemeric";
        exempel2.y=10;
        System.out.print(" Sout expmpel_1 = ");exemple.show();
        System.out.print(" Sout expmpel_2 = ");exempel2.show();

    }
}
