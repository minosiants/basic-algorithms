package com.minosiants.learning.algorithms
import Search._
import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class SearchSpec extends Specification {
  "Search object" should{
    "perform binary search" in {
      binarySearch(Array(20,25,50,55,59), 50) must equalTo(2)
    }
  }

}