package br.com.caelum.estoque.ws;

import javax.xml.ws.Endpoint;

public class PublicaWebService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EstoqueWS webService = new EstoqueWS();
		String url = "http://localhost:8080/estoquews";
		
		System.out.println("Service Rodando: " + url + "?wsdl");
		Endpoint.publish(url, webService);

	}

}
