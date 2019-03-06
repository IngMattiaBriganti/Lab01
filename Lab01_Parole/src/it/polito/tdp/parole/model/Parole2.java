package it.polito.tdp.parole.model;

import java.util.*;

public class Parole2 {
	private ArrayList<String> list;

	
	public Parole2() {
		//TODO
		list=new ArrayList<String>();
	}
	
	public void addParola2(String p) {
		//TODO
		this.list.add(p.toLowerCase());
	}
	
	public List<String> getElenco2() {
		//TODO
		Collections.sort(this.list);
		return list;
	}
	
	public void reset2() {
		// TODO
		this.list.clear();
	}
}
