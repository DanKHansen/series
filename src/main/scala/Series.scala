object Series:
   def slices(i: Int, s: String): List[List[Int]] =
      s.sliding(i, 1).map(_.toList.map(_.toString.toInt)).toList