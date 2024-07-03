package Punto;

public class PuntoHijoImpl extends PuntoImpl {

    public PuntoHijoImpl() {
        super(1, 1);
    }

    @Override
    public void setX(double x) {
        throw new ModificationNotAllowedException("Modifying x is not allowed in PuntoHijoImpl.");
    }

    @Override
    public void setY(double y) {
        throw new ModificationNotAllowedException("Modifying y is not allowed in PuntoHijoImpl.");
    }
}

class ModificationNotAllowedException extends RuntimeException {
    public ModificationNotAllowedException(String message) {
        super(message);
    }
}
