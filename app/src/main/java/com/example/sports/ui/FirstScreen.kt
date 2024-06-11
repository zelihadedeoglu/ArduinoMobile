package com.example.sports.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.sports.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FirstScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Box(modifier = Modifier.fillMaxWidth()) {
                        Text(
                            "ARDUNİO",
                            fontSize = 35.sp, // Increase the text size
                            fontWeight = FontWeight.Bold, // Make the text bold
                            color = Color.Black, // Set the text color to black
                            modifier = Modifier.align(Alignment.Center) // Center the text
                        )
                    }
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = Color(0xFF00979D) // Set the background color to red
                )
            )
        },
        content = { innerPadding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFF00979D)) // Set the background color to orange
                    .verticalScroll(rememberScrollState())
                    .padding(innerPadding)
            ) {
                // Add the box containing image and text here
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 0.dp) // Adjust padding as needed
                ) {
                    // Text box under the image
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 0.dp, horizontal = 0.dp)
                    ) {
                        Text(
                            "Ne ile ilgili bir proje istiyorsun",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            "KARAR VERDİYSEN BAŞLAYALIM ",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                        )
                    }
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    ClickableImageWithText(
                        imageRes = R.drawable.led,
                        text = "LED",
                        onClick = { navController.navigate("sports_screen/1") }
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    ClickableImageWithText(
                        imageRes = R.drawable.buton,
                        text = "BUTON",
                        onClick = { navController.navigate("sports_screen/2") }
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    ClickableImageWithText(
                        imageRes = R.drawable.potas,
                        text = "POTASYOMETRE",
                        onClick = { navController.navigate("sports_screen/3") }
                    )
                    ClickableImageWithText(
                        imageRes = R.drawable.servo,
                        text = "SERVO MOTOR",
                        onClick = { navController.navigate("sports_screen/4") }
                    )
                    ClickableImageWithText(
                        imageRes = R.drawable.mb,
                        text = "MESAFE SENSÖRÜ VE BUZZER",
                        onClick = { navController.navigate("sports_screen/5") }
                    )
                    Spacer(modifier = Modifier.height(1.dp))
                    ClickableImageWithText(
                        imageRes = R.drawable.lcd,
                        text = "LCD",
                        onClick = { navController.navigate("sports_screen/6") }
                    )
                    Spacer(modifier = Modifier.height(1.dp))
                    ClickableImageWithText(
                        imageRes = R.drawable.segment,
                        text = "7 SEGMENT DİSPLAY",
                        onClick = { navController.navigate("sports_screen/7")
                        }
                    )
                }
            }
        }
    )
}
@Composable
fun ClickableImageWithText(imageRes: Int, text: String, onClick: () -> Unit) {
    Card(
        shape = RoundedCornerShape(87.dp),
        elevation = CardDefaults.cardElevation(),
        modifier = Modifier
            .clickable { onClick() }
            .padding(15.dp)
            .fillMaxWidth()
            .height(75.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(300.dp)
            ) {
                Image(
                    painter = painterResource(imageRes),
                    contentDescription = text,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(0.dp) // Padding for the image
                )
            }
            // Right section for text
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .weight(2f)
                    .padding(start = 16.dp) // Add padding for the text
            ) {
                Text(
                    text,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewFirstScreen() {
    FirstScreen(navController = rememberNavController())
}
