package br.unisal.interfaces;

import javax.jws.*;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.soap.SOAPException;

import br.unisal.exceptions.DivisionByZeroArithymeticException;

import static br.unisal.util.Constants.*;

/**
 * 
 * @author jether.rodrigues
 *
 * Style.RPC: menos verboso, menos detalhes
 * Style.DOCUMENT: mais verboso, gera mais detalhes
 */

@WebService
@SOAPBinding(style = Style.DOCUMENT) 
public interface Calculable {
	
	/**
	 * 
	 * @param dividend
	 * @param divisor
	 * @return
	 * @throws DivisionByZeroArithymeticException
	 * @throws SOAPException
	 */
	
	@WebMethod(action=HOST + "/divide", operationName="division")
	public double divide(
		@WebParam(name = "dividend") double dividend,
		@WebParam(name = "divisor") double divisor
	) throws DivisionByZeroArithymeticException, SOAPException;
	
	/**
	 * 
	 * @param portion1
	 * @param portion2
	 * @return
	 * @throws DivisionByZeroArithymeticException
	 * @throws SOAPException
	 */
	
	@WebMethod(action=HOST + "/sum", operationName="sum")
	public double sum(
		@WebParam(name = "portion1") double portion1,
		@WebParam(name = "portion2") double portion2
	) throws DivisionByZeroArithymeticException, SOAPException;
	
	/**
	 * 
	 * @param minuend
	 * @param subtraend
	 * @return
	 * @throws DivisionByZeroArithymeticException
	 * @throws SOAPException
	 */
	
	@WebMethod(action=HOST + "/subtract", operationName="difference")
	public double sub(
		@WebParam(name = "minuend") double minuend,
		@WebParam(name = "subtraend") double subtraend
	) throws DivisionByZeroArithymeticException, SOAPException;
	
	/**
	 * 
	 * @param multiplicand
	 * @param multiplier
	 * @return
	 * @throws DivisionByZeroArithymeticException
	 * @throws SOAPException
	 */
	
	@WebMethod(action=HOST + "/multiply", operationName="product")
	public double mul(
		@WebParam(name = "multiplicand") double multiplicand,
		@WebParam(name = "multiplier") double multiplier
	) throws DivisionByZeroArithymeticException, SOAPException;
}
