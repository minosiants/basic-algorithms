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
  def main(args: Array[String]) {
	  countingSort(Array(35,81,98,14,47),98).map{el=>print(el+",")}
 }
}