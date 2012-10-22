package com.minosiants.learning.algorithms

object Search {
  
  
	/**
	 * http://en.wikipedia.org/wiki/Binary_search_algorithm
	 */
	def binarySearch(a:Array[Int],el:Int):Int={
	  
	  def bsearch(a:Array[Int],el:Int,min:Int,max:Int):Int={
	    if(max<min){
	      -1
	    }else{
	      val mid=min + (max - min) / 2;
	      if(a(mid)>el) bsearch(a,el,min,mid-1)
	      else if(a(mid)<el) bsearch(a,el,mid+1,max)
	      else mid
	    }
	    
	  }
	  bsearch(a,el,0,a.length-1)
	} 
}