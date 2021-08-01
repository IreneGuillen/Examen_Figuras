import java.util.ArrayList;
import java.util.List;

public class Lienzo implements Draw{
    
    Figura figura;
    IFigura ifigura;
    List<Figura> lista = new ArrayList<Figura>();

    public void Dibujar(){

        figura.setColorBorde("Lila");
        figura.setColorFondo("Azul");
    }

    public void add(Figura figura, Rectangle rectangle){

        figura.setRectangle(rectangle);
        lista.add(figura);
        figura.Dibujar();
        figura.setColorBorde("Lila");
        figura.setColorFondo("Azul");
        System.out.println("Soy un/a: " + figura.getClass().getName() + "\nTengo un fondo: " + figura.getColorFondo() + "\nTengo un color de borde: " + figura.getColorBorde());
    }

    public String getSelected(Point point){

       for(int i = 0; i <= lista.size(); i++){

           if(lista.get(i).getRectangle().buscarFigura(point)){
                System.out.println("En estas coordenadas se encuenta un/a: " + lista.get(i).getClass().getName());
                break;
            }
       }
        return "En estas coordenadas no hay ninguna figura";  
    } 
}
