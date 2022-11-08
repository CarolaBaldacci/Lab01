package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.LinkedList;


public class Parole {
	
	List <String> parole = new LinkedList<String>();
	
	public Parole() {
		
	}
	
	public void addParola(String p) {
		String nuovaParola= p;
		parole.add(nuovaParola);
	}
	
	public List<String> getElenco() {
		Collections.sort(parole);
		return parole;
	}
	
	public void reset() {
		parole.clear();
	}
	
	public void removeParola(String string) {
		parole.remove(string);
	}


}
