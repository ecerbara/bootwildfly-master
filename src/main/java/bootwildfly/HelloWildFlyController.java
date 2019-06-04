package bootwildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWildFlyController {


    @RequestMapping("hello")
    public String sayHello(){
        return ("Hello, SpringBoot on Wildfly");
    }
	
	@RequestMapping("/helloIonic")
	public Saluto testClient() {
		System.out.println("entrati con app");
	
		return new Saluto("emiliano", "ciao Ionic");
	}
	
	private class Saluto{
		private String nome;
		private String valore;
		
		public Saluto(String nome, String valore) {
			super();
			this.nome = nome;
			this.valore = valore;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getValore() {
			return valore;
		}

		public void setValore(String valore) {
			this.valore = valore;
		}
	}
}