package br.com.colman.nato.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.colman.nato.Alfa
import br.com.colman.nato.NatoAlphabetSymbol

@Preview
@Composable
fun NatoAlphabetCardPreview() = NatoAlphabetCard(Alfa)

@Composable
fun NatoAlphabetCard(symbol: NatoAlphabetSymbol) {
  Card(Modifier.fillMaxWidth(), elevation = 3.dp) {
    Column(Modifier.padding(16.dp)) {
      Text("${symbol.symbol} - ${symbol.codeWord}")
    }
  }
}
