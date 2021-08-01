public class Build {
    
    static Figura build(String figura){

        if(figura == Enumeracion.CORAZON.name()){

            return new Corazon();

        }else if(figura == Enumeracion.ESTRELLA.name()){

            return new Estrella();

        }else if(figura  == Enumeracion.RAYO.name()){
            
            return new Rayo();
        }
        return null;
    }
}
