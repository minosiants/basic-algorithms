package com.minosiants.learning.algorithms

import scala.collection.mutable.ArrayBuffer

object Sorting {
  
  /**
   * ex. 1.3.1
   * http://en.wikipedia.org/wiki/Counting_sort
   */
  def countingSort(a:Array[Int],max:Int)={
    val elements=new Array[Int](max+1)
    val result=a.clone
    result.map{el=>elements.update(el, elements(el)+1)} 
    var indexInArray:Int=0
    for(i <- 0 until elements.length if elements(i)!=0)
    	for(j <-0 until elements(i) ){
    		result(indexInArray)=i
    		indexInArray+=1
    	}
    result		
  }
  
  /**
   * 
   * http://en.wikipedia.org/wiki/Merge_sort
   */
  def mergeSort(a:Array[Int]):Array[Int]={
    
    def merge(left:Array[Int],right:Array[Int])={
      val result= new ArrayBuffer[Int]
      var _left=left;
      var _right=right;
      while(_left.length>0 && _right.length >0){
        if(_left(0)<=_right(0)){
          result+=_left(0)
          _left=_left.slice(1,_left.length)
        }else{
          result+=_right(0)
          _right=_right.slice(1, _right.length)
        }
      }
      if(_left.length > 0) result++=_left
	  if(_right.length > 0) result++=_right
      result.toArray
    }
    
    
    if(a.length <=1){
      a
    }else{
      val middle=a.length/2
      val left = mergeSort(a.slice(0, middle)) 
      val right = mergeSort(a.slice(middle, a.length))
      merge(left,right);
    }
  }
  
 /**
  * http://en.wikipedia.org/wiki/Quicksort 
  */
  def quickSort(a:Array[Int]):Array[Int]={
    
    def qsort(array:Array[Int],low:Int,hight:Int):Array[Int]={
      var pivot=array((hight+low)/2)
      var i=low
      var j=hight
      while(i<=j){
    	 while(array(i)<pivot) i+=1
    	 while(array(j)>pivot) j-=1
    	 if(i<=j){
    	   exchange(array,i,j)
    	   i+=1
    	   j-=1
    	 } 
    	 if(low<j) qsort(array,low,j)
    	 if(i<hight) qsort(array,i,hight)
    	 
      }
      array
    }
    def exchange(array:Array[Int],i:Int,j:Int){
      val t=array(i)
      array(i)=array(j)
      array(j)=t
    }
    
    if(a.length==0){
    	a
    }else{
    	qsort(a,0,a.length-1)
    }
              
  }
  
  def main(args: Array[String]) {
	  countingSort(Array(35,81,98,14,47),98).map{el=>print(el+",")}
 }
  
  
  
}


