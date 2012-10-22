package com.minosiants.learning.algorithms


import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner
import org.specs2.mutable.Specification
import Sorting._

@RunWith(classOf[JUnitRunner])
class SortingSpec extends Specification {
  "Sorting object" should{
    "perform counting sorting" in {
    	countingSort(Array[Int](20,10,5,10), 20) must equalTo(Array(5,10,10,20))
    }
    "perform merge sorting" in {
    	mergeSort(Array[Int](20,10,5,10)) must equalTo(Array(5,10,10,20))
    }
    "perform quick sorting" in {
    	quickSort(Array[Int](20,10,5,10)) must equalTo(Array(5,10,10,20))
    }
  }
}