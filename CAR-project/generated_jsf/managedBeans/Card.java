package de.vogella.jsf.starter.model;

public class Card {
	
	private int leftside;
	
	private int rightside;
	
	private int result = 0;
		
	public int getleftside(){
		return leftside;
	}

	public int getrightside(){
		return rightside;
	}

	public int getresult(){
		return result;
	}


	public void setleftside(int leftside){
		this.leftside = leftside;
	}

	public void setrightside(int rightside){
		this.rightside = rightside;
	}

	public void setresult(int result){
		this.result = result;
	}


	public String show(){
		// TODO: implement this method
		throw new UnsupportedOperationException();
	}		
	
	public String clear(){
		// TODO: implement this method
		throw new UnsupportedOperationException();
	}		
	
}