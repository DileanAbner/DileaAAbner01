package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By btnAbrirConta = By.cssSelector(
			"body > div.viewport-primary > nav.nav-desktop > div.right > div.nav-item.nav-item-nova-conta > a");

	public By getBtnParaVoce() {
		return btnParaVoce;
	}

	public void setBtnParaVoce(By btnParaVoce) {
		this.btnParaVoce = btnParaVoce;
	}

	public By getCampoNome() {
		return campoNome;
	}

	public void setCampoNome(By campoNome) {
		this.campoNome = campoNome;
	}

	public By getCampoTelefone() {
		return campoTelefone;
	}

	public void setCampoTelefone(By campoTelefone) {
		this.campoTelefone = campoTelefone;
	}

	public By getCampoEmail() {
		return campoEmail;
	}

	public void setCampoEmail(By campoEmail) {
		this.campoEmail = campoEmail;
	}

	public By getCampoCpf() {
		return campoCpf;
	}

	public void setCampoCpf(By campoCpf) {
		this.campoCpf = campoCpf;
	}

	public By getBtnQueroSerCliente() {
		return btnQueroSerCliente;
	}

	public void setBtnQueroSerCliente(By btnQueroSerCliente) {
		this.btnQueroSerCliente = btnQueroSerCliente;
	}

	public By getTextoFaltaPouco() {
		return textoFaltaPouco;
	}

	public void setTextoFaltaPouco(By textoFaltaPouco) {
		this.textoFaltaPouco = textoFaltaPouco;
	}

	public void setBtnAbrirConta(By btnAbrirConta) {
		this.btnAbrirConta = btnAbrirConta;
	}

	private By btnParaVoce = By.id("bt1");
	private By campoNome = By.id("nome");
	private By campoTelefone = By.id("telefone");
	private By campoEmail = By.id("email");
	private By campoCpf = By.id("cpf");
	private By btnQueroSerCliente = By.id("btnEnviar");
	private By textoFaltaPouco = By.cssSelector("#pu-modalSucesso > div > div:nth-child(2) > p > span:nth-child(1)");

	public By getBtnAbrirConta() {
		return btnAbrirConta;
	}

}
