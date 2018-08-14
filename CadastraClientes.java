

/**
 * Classe que representa ...
 * 
 * @author dev1@solucoes.legal
 * @version 1.0
 * @since 2018-08-10
 *
 */
 
 
    
    import javax.ws.rs.client.Client;
    
    import javax.ws.rs.client.ClientBuilder;
    
    import javax.ws.rs.client.Entity;
    
    import javax.ws.rs.core.Response;
    
    import javax.ws.rs.core.MediaType;
 
public class CadastraClientes {

	/**
	 * Construtor
	 **/
	public CadastraClientes (){
	  
	  
	  / Maven : Add these dependecies to your pom.xml (java6+)

    // <dependency>
    
    //     <groupId>org.glassfish.jersey.core</groupId>
    
    //     <artifactId>jersey-client</artifactId>
    
    //     <version>2.8</version>
    
    // </dependency>
    
    // <dependency>
    
    //     <groupId>org.glassfish.jersey.media</groupId>
    
    //     <artifactId>jersey-media-json-jackson</artifactId>
    
    //     <version>2.8</version>
    
    // </dependency>
    
    
    
    
    
    Client client = ClientBuilder.newClient();
    
    Entity payload = Entity.json("{  'ST_NOME_SAC': '',  'ST_NOMEREF_SAC': ''}");
    
    Response response = client.target("https://api.superlogica.net/v2/financeiro/clientes?New%20item=")
    
      .request(MediaType.APPLICATION_JSON_TYPE)
    
      .header("app_token", "Zq5baiPoqzjh")
    
      .header("access_token", "tf8nfifh4l6a")
    
      .post(payload);
    
    
    
    System.out.println("status: " + response.getStatus());
    
    System.out.println("headers: " + response.getHeaders());
    
    System.out.println("body:" + response.readEntity(String.class));
	}

}
