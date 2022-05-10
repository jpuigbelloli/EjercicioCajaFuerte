package cajafuerte;

public class CajaFuerte {

    private Boolean estadoApertura;
    private Integer codigoApertura;
    private Integer codigoDefault = 725325;

    public CajaFuerte() {
	this.estadoApertura = Boolean.TRUE;
    }

    public Boolean estaAbierta() {

	return estadoApertura;
    }

    public void cerrar(Integer codigoApertura) {
	this.estadoApertura = Boolean.FALSE;
	this.codigoApertura = codigoApertura;
    }

    public void abrir(Integer codigoApertura) {
	
	if ((this.codigoApertura == codigoApertura) || (this.codigoDefault == codigoApertura)) {
	    this.estadoApertura = Boolean.TRUE;
	}
	
    }

    public Integer codigoDefault() {
	
	return this.codigoDefault;
    }

}
