package br.com.colman.nato

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement.Absolute.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.colman.nato.ui.component.NatoAlphabetCard
import br.com.colman.nato.ui.theme.NATOAlphabetMemorizerTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      NATOAlphabetMemorizerTheme {

        // A surface container using the 'background' color from the theme
        Surface(
          modifier = Modifier.fillMaxSize(),
          color = MaterialTheme.colorScheme.background,
        ) {
          Column(Modifier.verticalScroll(rememberScrollState()), spacedBy(16.dp)) {
            NatoAlphabet.values().forEach {
              NatoAlphabetCard(it)
            }
          }
        }
      }
    }
  }
}
