package com.octest.forms;

import javax.servlet.http.HttpServletRequest;

public class ConnectionForm {
	private String resultat;

	public void verifId(HttpServletRequest request){
		String login=request.getParameter("login");
		String mdp=request.getParameter("mdp");
		if(mdp.equals(login+"123")){
			resultat="vous êtes bien connectés";
		}else{
			resultat="mauvais identifiant";
		}
	}
	
	public String getResultat() {
		return resultat;
	}

	public void setResultat(String resultat) {
		this.resultat = resultat;
	}

}
