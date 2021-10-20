public class Main5 {
    public static void main(String[] args) {
        Encapsulamiento objeto1 = new Encapsulamiento();
        Encapsulamiento objeto2 = new Encapsulamiento();

        objeto1.SetEdad(10);
        System.out.println("La edad es: " + objeto1.GetEdad());

        objeto2.Setnombre("Maria");
        System.out.println("Mi nombre es: " + objeto2.Getnombre());
    }
}
