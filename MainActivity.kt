    package com.example.laboratorio6

    import android.content.Intent
    import android.os.Bundle
    import androidx.activity.ComponentActivity
    import androidx.activity.compose.setContent
    import androidx.compose.foundation.background
    import androidx.compose.foundation.layout.Column
    import androidx.compose.foundation.layout.Spacer
    import androidx.compose.foundation.layout.fillMaxSize
    import androidx.compose.foundation.layout.fillMaxWidth
    import androidx.compose.foundation.layout.height
    import androidx.compose.foundation.layout.padding
    import androidx.compose.foundation.layout.size
    import androidx.compose.foundation.layout.width
    import androidx.compose.material3.Button
    import androidx.compose.material3.ExperimentalMaterial3Api
    import androidx.compose.material3.Icon
    import androidx.compose.material3.MaterialTheme
    import androidx.compose.material3.Surface
    import androidx.compose.material3.Text
    import androidx.compose.material3.TextField
    import androidx.compose.runtime.Composable
    import androidx.compose.runtime.getValue
    import androidx.compose.runtime.mutableStateOf
    import androidx.compose.runtime.remember
    import androidx.compose.runtime.setValue
    import androidx.compose.ui.Alignment
    import androidx.compose.ui.Modifier
    import androidx.compose.ui.graphics.Color
    import androidx.compose.ui.platform.LocalContext
    import androidx.compose.ui.res.painterResource
    import androidx.compose.ui.text.font.FontWeight
    import androidx.compose.ui.text.input.PasswordVisualTransformation
    import androidx.compose.ui.tooling.preview.Preview
    import androidx.compose.ui.unit.dp
    import androidx.compose.ui.unit.sp
    import com.example.laboratorio6.ui.theme.Laboratorio6Theme

    class MainActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContent {
                Laboratorio6Theme {
                    // A surface container using the 'background' color from the theme
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                    ) {
                        Login()
                    }
                }
            }
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun Login(modifier: Modifier = Modifier) {
        var username by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        val buttonLogin = LocalContext.current
        Column(modifier.fillMaxSize()){
            Text(
                text ="Login",
                fontSize = 45.sp,
                fontWeight = FontWeight.ExtraBold,
                modifier = modifier
                    .padding(bottom = 19.dp, top = 15.dp)
                    .align(Alignment.CenterHorizontally),
                color =  Color(85,150,200)
            )
            val imageLogin = R.drawable.baseline_photo_library_24
            Icon(
                painter = painterResource(id = imageLogin),
                contentDescription = "PhotoGallery",
                modifier = modifier
                    .align(Alignment.CenterHorizontally)
                    .size(100.dp)
                    .padding(bottom = 20.dp),
                tint = Color(100,149,237)
            )
            val imageUserLogin = R.drawable.baseline_person_outline_24

            TextField(
                value = username,
                label = {
                    Text(text = "Ingrese su nombre de usuario ",
                       fontSize = 13.sp
                    )
                },
                onValueChange = {username = it},
                leadingIcon = {
                    Icon(
                    painter = painterResource(id = imageUserLogin),
                    "LoginUser",
                        modifier = modifier
                            .size(35.dp)
                            .padding(end = 2.dp)
                )},
                modifier = modifier
                    .width(300.dp)
                    .height(70.dp)
                    .align(Alignment.CenterHorizontally)
            )
            Spacer(
                modifier = modifier
                    .fillMaxWidth()
                    .height(35.dp)
                    .background(Color.Transparent)
            )
            val imagePasswordLogin = R.drawable.baseline_password_24
            TextField(
                value = password,
                label = {
                    Text(text = "Ingrese su contraseña",
                        fontSize = 13.sp
                    )
                },
                visualTransformation = PasswordVisualTransformation(),
                onValueChange = {password = it},
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = imagePasswordLogin),
                        "LoginPassword",
                        modifier = modifier
                            .size(45.dp)
                            .padding(end = 2.dp)
                    )},
                modifier = modifier
                    .width(300.dp)
                    .height(70.dp)
                    .align(Alignment.CenterHorizontally)
            )
            Spacer(
                modifier = modifier
                    .fillMaxWidth()
                    .height(33.dp)
                    .background(Color.Transparent)
            )
            Button(onClick ={
                if (username == "AbbyDonis" && password == "Uvg$23!"){
                    buttonLogin.startActivity(Intent(buttonLogin, MainActivity2::class.java))
                }
            },
                modifier = modifier
                    .align(Alignment.CenterHorizontally)
            ){
                Text(text = "Iniciar Sesión",
                    fontSize = 20.sp)
            }
        }

    }

    @Preview(showBackground = true)
    @Composable
    fun LoginPreview() {
        Laboratorio6Theme {
            Login()
        }
    }