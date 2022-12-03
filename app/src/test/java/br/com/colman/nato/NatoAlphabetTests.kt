package br.com.colman.nato

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.collections.shouldContainInOrder
import io.kotest.matchers.collections.shouldHaveSize

class NatoAlphabetTests : FunSpec(
  {
    context("Companion Object") {
      val target = NatoAlphabet

      test("Contains 40 values") {
        target.values() shouldHaveSize 40
      }

      test("Includes all letter symbols") {
        target.values() shouldContainInOrder listOf(
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
        )
      }

      test("Includes all number symbols") {
        target.values() shouldContainInOrder listOf(
          Zero, One, Two, Three, Four, Five, Six, Seven, Eight, Nine
        )
      }

      test("Includes all extra symbols") {
        target.values() shouldContainInOrder listOf(
          DecimalPoint, Hundred, Thousand, FullStop
        )
      }
    }

    test("Contains 40 values") {
      NatoAlphabet.values() shouldHaveSize 40
    }
    test("Includes all ")
  },
)
