package com.chainsys.springproject.beans;

public class Movie {
	public String title;
	public String director;
	public Movie(String flimTitle,String flimDirector) {
		title=flimTitle;//this is similar to this.title=flimTitle,but using this. prifix is not coumpulsary
		director=flimDirector;//this is similar to this.director=flimdirector.but using this. prifix is not coumpulsary
	     System.out.println(title);
	     System.out.println(director);
	
	}
	

}
