package it.polito.tdp.parole.model;

import java.util.*;
import java.util.*;

public class Parole {
	private LinkedList<String> list; //cambiare in arraylist a mano
		
	public Parole() {
		//TODO
		list=new LinkedList<String>();
	}
	
	public void addParola(String p) {
		//TODO
		this.list.add(p.toLowerCase());
	}
	
	public List<String> getElenco() {
		//TODO
		Collections.sort(this.list);
		return list;
	}
	
	public void reset() {
		// TODO
		this.list.clear();
	}

}
