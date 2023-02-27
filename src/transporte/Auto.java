package transporte;

public class Auto extends UnidadTransporte {
    public Auto() {
        super("Auto", 60);
    }
}

 class Moto extends UnidadTransporte {
    public Moto() {
        super("Moto", 80);
    }
}

class Combi extends UnidadTransporte {
    public Combi() {
        super("Combi", 40);
    }
}
