package com.shrey.firstcompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            TextField()
            //NothingHere()
            PreView()
        }
    }
}

@Composable
fun HelloAndroid(name: String) {
    Text(
        text = "Hello $name",
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold,
        color = Color.Blue,
        fontSize = 20.sp,
        textAlign = TextAlign.Center
    )
}

@Preview(
    showBackground = true, name = "Android_1", widthDp = 200,
    heightDp = 200
)
@Composable
private fun PreviewFun() {
    HelloAndroid("Android!!")
}

@Preview(
    showBackground = true, name = "Android_1", widthDp = 200,
    heightDp = 200
)
@Composable
fun Img() {
    Image(
        painter = painterResource(id = R.drawable.andy),
        contentDescription = "Dummy image",
        //colorFilter = ColorFilter.tint(Color.Blue)
        contentScale = ContentScale.Crop
    )
}

@Preview(
    showBackground = true, name = "Android_3",
    widthDp = 400, heightDp = 400
)
@Composable
fun Click() {
    Button(
        onClick = { }, colors = ButtonDefaults.buttonColors(
            contentColor = Color.Green,

            )//, enabled = false

    ) {
        Text(text = "Hello", fontSize = 20.sp)
        Image(
            painter = painterResource(id = R.drawable.andy),
            contentDescription = "cool",
            contentScale = ContentScale.Crop
        )


    }
}


@Composable
fun TextField() {
    val state = remember {
        mutableStateOf("")
    }
    TextField(
        value = state.value,
        onValueChange = {
            state.value = it
            Log.d("shreyy", it)
        },
        label = {
            Text(text = "Enter you Good Nmae")
        }
    )
}

@Preview(showBackground = true, widthDp = 200, heightDp = 300)
@Composable
fun Preview() {
    TextField()
}

@Composable
fun Align() {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally

    )
    {
        Text(text = "Hello", fontSize = 24.sp)
        Text(text = "From", fontSize = 24.sp)
        Text(text = "Shreyank", fontSize = 24.sp)
    }
}

@Preview(showBackground = true, name = "andy", heightDp = 500, widthDp = 300)
@Composable
fun PreviewAlign() {
    Align()
}

@Composable
fun Aalign() {
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically

    )
    {
        Text(text = "Hello", fontSize = 24.sp)
        Text(text = "From", fontSize = 24.sp)
        Column {
            Text(text = "Shreyank", fontSize = 24.sp)
            Text(text = "From", fontSize = 24.sp)
        }
    }
}

@Preview(showBackground = true, name = "andy", heightDp = 500, widthDp = 300)
@Composable
fun PrreviewAlign() {
    Aalign()
}

@Preview(showBackground = true, name = "andy", heightDp = 500, widthDp = 400)
@Composable
private fun PrrreviewAlign() {
    Halign()
}

@Composable
fun Halign() {
    Box(
        contentAlignment = Alignment.Center
    ) {
        Image(painter = painterResource(id = R.drawable.heart), contentDescription = "heart image")
        Image(
            painter = painterResource(id = R.drawable.arroww), contentDescription = "arrow",
        )
    }
}

@Preview(name = "fisty", widthDp = 400, heightDp = 400, showBackground = true)
@Composable
fun NothingHere() {
    Column {

        Koko(R.drawable.working,"John Doe", "Android Developer")
        Koko(R.drawable.working,"Shreyank", "Backend Developer")
        Koko(R.drawable.working,"John Tildy", "Software Developer")
        Koko(R.drawable.working,"Nethan Truth", "Content Creator")
    }
}

@Composable
fun Koko(img: Int, Name: String, Occupation: String) {
    Row (Modifier.padding(8.dp)){
        Image(
            painter = painterResource(id = img), contentDescription = "",
            Modifier.size(65.dp)
        )
        Column {
            Text(
                text = Name,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,


            )
            Text(
                text = Occupation,
                fontWeight = FontWeight.Thin,
                fontSize = 15.sp
            )
        }
    }
}











