object Series:
   def slices(i: Int, s: String): List[List[Int]] =
      s.sliding(i).map(_.map(_.asDigit).toList).toList