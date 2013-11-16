package de.vogella.jsf.starter.model;

public class Card {
	
	private int left;
	
	private int right;
	
	private int result;
	
	public int getleft(){
		return left;
	}

	public int getright(){
		return right;
	}

	public int getresult(){
		return result;
	}


	public void setleft(int left){
		this.left = left;
	}

	public void setright(int right){
		this.right = right;
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