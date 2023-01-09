package ecaps.dna.composeBasicOne

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {//used for creating the layout design
            MessageCard(message = "Good Morning")//composable function
        }
    }

    //normal function having composable annotation, makes its composable function.
    //Composable function is always be called from another composable function or setContent method.
    //Composable function that returns unit should always start with capital letter.
    @Composable
    fun MessageCard(message: String){
        Text(text = message)
    }

    //Preview annotation is used to preview the layout design.
    //preview function doesnt have any parameter, so always wrap parameter function inside a new function having no paramter
    @Preview
    @Composable
    fun PreviewMessageCard(){
        MessageCard(message = "Good Morning Sunshine")
    }
}

