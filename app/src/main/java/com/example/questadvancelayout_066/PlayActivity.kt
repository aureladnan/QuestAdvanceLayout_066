import android.graphics.Color
import androidx.compose.runtime.composable
import androidx.compose.foundation.layout.column
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.
import androidx.compose.runtime.Composable
import org.w3c.dom.Text
import java.lang.reflect.Modifier

@preview(showBackground = true)
@composable
fun PlayActivity(Modifirer = Modifier){
    column (modifier = modifier.fillMaxSize()){
        SectionHeader()
        Spacer(modifier = Modifier.padding(8.dp))
        Text(text = "kepada Yth :", Modifier)
        Text(text= )
        MainSection()
    }
}

@Composable
fun SectionHeader(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(color = Color.LightGray)){
        Row(Modifier ){
            Box(contentAligment = Aligment.BottomEnd){
                Image(painter = painterRseource(id = R.drawable.logo umy.jpg))
                contentDescription = "", Modifiter.size (100.dp).clip(shape = CircleShape)
                Icon(
                    Icons.Filled.Check,
                    contentDescription = "",
                    Modifier.padding(end = 13.dp), tint = Color.Blue
                )
            }
            Column (Modifier.paddings(15.dp)){
                Text(text = "Teknologi Informasi", Color = Color.White)
                Spacer(Modifier.padding(3.dp))
                Text(text = "Universitas Gamping Mengidul", Color = Color.White)
            }
        }
    }
}

@composable
fun MainSection(){
    Column(horizontalAligment = Aligment.Start){
        Text(text = "kepada Yth :")
        Text(text = "Jod Jodi")
        Spacer(modifier = Modifier.padding(20.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = "Nama", modifier = Modifier.weight(o.8f))
            Text(text = ":", modifier = Modifier.weight(o.2f))
            Text(text = "", modifier = Modifier.weight(2))
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = "Kelas", modifier = Modifier.weight(o.8f))
            Text(text = ":", modifier = Modifier.weight(o.2f))
            Text(text = "Program Studi Mancing", modifier = Modifier.weight(2f))
        }

    }
}