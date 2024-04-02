package com.shrey.firstcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreView() {
    LazyColumn(content = {
        items(getCategoryList()){item ->
            Blog(img =item.img, title =item.title, subtitle =item.subtitle)
        }
    })
}

@Composable
fun Blog(img: Int, title: String, subtitle: String) {
    Card(
        elevation = CardDefaults.cardElevation(8.dp),
        modifier = Modifier.padding(18.dp)

    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = img),
                contentDescription = "",
                modifier = Modifier
                    .size(60.dp)
                    .padding(5.dp)
                    .weight(.2f)
            )
              Extracted(title, subtitle, Modifier.weight(.8f))
        }
    }
}

@Composable
fun Extracted(title: String, subtitle: String, modifier: Modifier) {
    Column(modifier) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleLarge
        )
        Text(
            text = subtitle,
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Thin
        )
    }
}

data class Category(
        val img: Int,
        val title: String,
        val subtitle: String
        )

fun getCategoryList(): MutableList<Category> {
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.working, "Programming", "Learn different Language"))
    list.add(Category(R.drawable.working, "Technology", "Learn different Language"))
    list.add(Category(R.drawable.working, "Full Stack Web", "Learn different Language"))
    list.add(Category(R.drawable.working, "Full Stack Mobile", "Learn different Language"))
    list.add(Category(R.drawable.working, "AI & ML", "Learn different Language"))
    list.add(Category(R.drawable.working, "Backend development", "Learn different Language"))
    list.add(Category(R.drawable.working, "GoLang", "Learn different Language"))
    list.add(Category(R.drawable.working, "Rust", "Learn different Language"))
    list.add(Category(R.drawable.working, "DevOps", "Learn different Language"))
    list.add(Category(R.drawable.working, "Programming", "Learn different Language"))
    list.add(Category(R.drawable.working, "Programming", "Learn different Language"))
    list.add(Category(R.drawable.working, "Programming", "Learn different Language"))

    return list
}












