package br.com.caelum.estoque.ws;

import java.util.Date;

import javax.xml.ws.WebFault;

@WebFault(name="AutorizacaoFault")
public class AutorizacaoException extends Exception {
	
	private static final long serialVersionUID = 480394851698655382L;

	public AutorizacaoException(String message) {
		super(message);
	}

	public InfoFault getFaultInfo() {
	    return new InfoFault("Token invalido" , new Date());
	}
	
}
