package br.com.colman.nato

object NatoAlphabet {
  fun values(): List<Any> = listOf(
    Alfa,
    Bravo,
    Charlie,
    Delta,
    Echo,
    Foxtrot,
    Golf,
    Hotel,
    India,
    Juliett,
    Kilo,
    Lima,
    Mike,
    November,
    Oscar,
    Papa,
    Quebec,
    Romeo,
    Sierra,
    Tango,
    Uniform,
    Victor,
    Whiskey,
    XRay,
    Yankee,
    Zulu,
    Zero,
    One,
    Two,
    Three,
    Four,
    Five,
    Six,
    Seven,
    Eight,
    Nine,
    DecimalPoint,
    Hundred,
    Thousand,
    FullStop
  )

}

private fun NatoAlphabetSymbol(symbol: String, codeWord: String) = object : NatoAlphabetSymbol {
  override val symbol: String = symbol
  override val codeWord: String = codeWord
}

interface NatoAlphabetSymbol {
  val symbol: String
  val codeWord: String
}

object Alfa : NatoAlphabetSymbol by NatoAlphabetSymbol("A", "Alfa")
object Bravo : NatoAlphabetSymbol by NatoAlphabetSymbol("B", "Bravo")
object Charlie : NatoAlphabetSymbol by NatoAlphabetSymbol("C", "Charlie")
object Delta : NatoAlphabetSymbol by NatoAlphabetSymbol("D", "Delta")
object Echo : NatoAlphabetSymbol by NatoAlphabetSymbol("E", "Echo")
object Foxtrot : NatoAlphabetSymbol by NatoAlphabetSymbol("F", "Foxtrot")
object Golf : NatoAlphabetSymbol by NatoAlphabetSymbol("G", "Golf")
object Hotel : NatoAlphabetSymbol by NatoAlphabetSymbol("H", "Hotel")
object India : NatoAlphabetSymbol by NatoAlphabetSymbol("I", "India")
object Juliett : NatoAlphabetSymbol by NatoAlphabetSymbol("J", "Juliett")
object Kilo : NatoAlphabetSymbol by NatoAlphabetSymbol("K", "Kilo")
object Lima : NatoAlphabetSymbol by NatoAlphabetSymbol("L", "Lima")
object Mike : NatoAlphabetSymbol by NatoAlphabetSymbol("M", "Mike")
object November : NatoAlphabetSymbol by NatoAlphabetSymbol("N", "November")
object Oscar : NatoAlphabetSymbol by NatoAlphabetSymbol("O", "Oscar")
object Papa : NatoAlphabetSymbol by NatoAlphabetSymbol("P", "Papa")
object Quebec : NatoAlphabetSymbol by NatoAlphabetSymbol("Q", "Quebec")
object Romeo : NatoAlphabetSymbol by NatoAlphabetSymbol("R", "Sierra")
object Sierra : NatoAlphabetSymbol by NatoAlphabetSymbol("S", "Bravo")
object Tango : NatoAlphabetSymbol by NatoAlphabetSymbol("T", "Tango")
object Uniform : NatoAlphabetSymbol by NatoAlphabetSymbol("U", "Uniform")
object Victor : NatoAlphabetSymbol by NatoAlphabetSymbol("V", "Victor")
object Whiskey : NatoAlphabetSymbol by NatoAlphabetSymbol("W", "Whiskey")
object XRay : NatoAlphabetSymbol by NatoAlphabetSymbol("X", "X-Ray")
object Yankee : NatoAlphabetSymbol by NatoAlphabetSymbol("Y", "Yankee")
object Zulu : NatoAlphabetSymbol by NatoAlphabetSymbol("Z", "Zulu")

object Zero : NatoAlphabetSymbol by NatoAlphabetSymbol("0", "Zero")
object One : NatoAlphabetSymbol by NatoAlphabetSymbol("1", "One")
object Two : NatoAlphabetSymbol by NatoAlphabetSymbol("2", "Two")
object Three : NatoAlphabetSymbol by NatoAlphabetSymbol("3", "Three")
object Four : NatoAlphabetSymbol by NatoAlphabetSymbol("4", "Four")
object Five : NatoAlphabetSymbol by NatoAlphabetSymbol("5", "Five")
object Six : NatoAlphabetSymbol by NatoAlphabetSymbol("6", "Six")
object Seven : NatoAlphabetSymbol by NatoAlphabetSymbol("7", "Seven")
object Eight : NatoAlphabetSymbol by NatoAlphabetSymbol("8", "Eight")
object Nine : NatoAlphabetSymbol by NatoAlphabetSymbol("9", "Nine")

object DecimalPoint : NatoAlphabetSymbol by NatoAlphabetSymbol(".", "Decimal")
object Hundred : NatoAlphabetSymbol by NatoAlphabetSymbol("00", "Hundred")
object Thousand : NatoAlphabetSymbol by NatoAlphabetSymbol("000", "Thousand")
object FullStop : NatoAlphabetSymbol by NatoAlphabetSymbol(".", "Stop")
