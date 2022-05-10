package cajafuerte;

import org.junit.Assert;
import org.junit.Test;

public class CajaFuerteTest {

    private CajaFuerte caja;
    
    private Integer CodigoDefault = 725325;

    //Concepto de caja fuerte de un hotel, en donde cambia la clave aquel que la cierra

    @Test
    public void alCrearUnaCajaFuerteEstaAbierta() {
	//Error original
	//fail("Not yet implemented");

	//Preparacion (dado)

	//Ejecucion (cuando)

	CajaFuerte caja = whenCreoUnaCajaFuerte();

	//Validacion / constratación (entonces)

	thenLaCajaFuerteEstaAbierta(caja);

    }

    private CajaFuerte whenCreoUnaCajaFuerte() {
	caja = new CajaFuerte();
	return caja;
    }

    private void thenLaCajaFuerteEstaAbierta(CajaFuerte caja) {
	Assert.assertTrue(caja.estaAbierta());
    }

    @Test
    public void alCerrarDeberiaEstarCerrada() {
	//Preparacion (dado)

	CajaFuerte caja = givenExisteUnaCajaFuerte();

	//Ejecucion (cuando)

	whenCierroUnaCajaFuerte(caja);

	//Validacion / constratación (entonces)

	thenLaCajaFuerteEstaCerrada(caja);

    }

    private CajaFuerte givenExisteUnaCajaFuerte() {

	caja = new CajaFuerte();
	return caja;
    }

    private void whenCierroUnaCajaFuerte(CajaFuerte caja) {

	//Esto no deberia cerrar sin codigo
	//null es un interger valido, quien lo diria!
	caja.cerrar(null);
    }

    private void thenLaCajaFuerteEstaCerrada(CajaFuerte caja) {
	Assert.assertTrue(!caja.estaAbierta());
    }

    @Test
    public void alAbrirConLaClaveDeCierreDeberiaEstarAbierta() {
	//Preparacion (dado)

	Integer codigoApertura = 123;
	//CajaFuerte caja = givenExisteUnaCajaFuerte();
	CajaFuerte caja = new CajaFuerte();
	//givenCierroLaCajaFuerte(caja, codigoApertura);
	caja.cerrar(codigoApertura);

	//Ejecucion (cuando)

	//whenAbroLaCajaFuerteConCodigo(codigoApertura);
	caja.abrir(codigoApertura);

	//Validacion / constratación (entonces)

	//thenLaCajaFuerteEstaAbierta(caja);
	Assert.assertTrue(caja.estaAbierta());

    }

    @Test
    public void alAbrirConClaveIncorrectaDebeQuedarCerrada() {

	//Dada una caja fuerte cerrada

	Integer codigoApertura = 123;
	CajaFuerte caja = givenCajafuerteCerrada(codigoApertura);

	//cuando se abre con clave incorrecta

	whenAbroConCodigoIncorrecto(codigoApertura, caja);

	//Debe quedar cerrada

	thenCajaFuerteCerrada(caja);
    }

    private CajaFuerte givenCajafuerteCerrada(Integer codigoApertura) {

	CajaFuerte caja = new CajaFuerte();
	caja.cerrar(codigoApertura);
	return caja;
    }

    private void whenAbroConCodigoIncorrecto(Integer codigoApertura, CajaFuerte caja) {

	caja.abrir(codigoApertura + 1);

    }

    private void thenCajaFuerteCerrada(CajaFuerte caja) {
	Assert.assertTrue(!caja.estaAbierta());

    }
    
    
    
    public void alCrearUnaCajaFuerteDebeTenerElCodigoPorDefault() {
	//Error original
	//fail("Not yet implemented");

	//Preparacion (dado)

	//Ejecucion (cuando)

	CajaFuerte caja = whenCreoUnaCajaFuerte();

	//Validacion / constratación (entonces)

	thenLaCajaFuerteTieneCodigoPorDefault(caja);

    }

    private void thenLaCajaFuerteTieneCodigoPorDefault(CajaFuerte caja) {
	
	Assert.assertTrue(caja.codigoDefault() == CodigoDefault);
	
    }
    
    
    
    @Test
    public void alAbrirConElCodigoPorDefaultDebeQuedarAbierta() {
	
	//dada una caja ferte cerrada
	CajaFuerte caja = givenCajafuerteCerrada(123456);
	
	//cuando la abro con el codigo por default
	whenAbroConCodigoPorDefault(caja);
	
	//Entonces la caja fuerte esta abierta
	thenLaCajaFuerteEstaAbierta(caja);
    }

    private void whenAbroConCodigoPorDefault(CajaFuerte caja) {

	caja.abrir(CodigoDefault);
    }

}
