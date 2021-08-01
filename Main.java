public class Main {
    public static void main(String[] args) throws Exception {
        

        Lienzo lienzo = new Lienzo();

        Figura figura1 = Build.build("ESTRELLA");
        lienzo.add(figura1, new Rectangle(new Point(2, 2), new Point(5, 5)));

        Figura figura2 = Build.build("CORAZON");
        lienzo.add(figura2, new Rectangle(new Point(0, 0), new Point(3, 3)));

        Figura figura3 = Build.build("RAYO");
        lienzo.add(figura3, new Rectangle(new Point(2, 6), new Point(3, 9)));

        lienzo.getSelected(new Point(5, 5));
    }
}
