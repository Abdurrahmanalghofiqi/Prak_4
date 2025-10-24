package com.example.prak_4

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ActivitasPertama(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(top = 100.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Judul
        Text(
            text = stringResource(id = R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(id = R.string.univ),
            fontSize = 22.sp
        )

        Spacer(modifier = Modifier.height(25.dp))

        // Card Informasi
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            colors = CardDefaults.cardColors(containerColor = Color.DarkGray)
        ) {
            Row(
                modifier = Modifier.padding(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                val gambar = painterResource(id = R.drawable.logo)
                Image(
                    painter = gambar,
                    contentDescription = stringResource(id = R.string.nama),
                    modifier = Modifier
                        .size(100.dp)
                        .padding(5.dp)
                )
                Spacer(modifier = Modifier.width(30.dp))
                Column {
                    Text(
                        text = stringResource(id = R.string.nama),
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Cursive,
                        color = Color.White,
                        modifier = Modifier.padding(top = 15.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.alamat),
                        fontSize = 20.sp,
                        color = Color.Yellow,
                        modifier = Modifier.padding(top = 10.dp)
                    )
                }
            }
        }

        Spacer(modifier = Modifier.weight(1f)) // dorong ke bawah

        // Footer
        Text(
            text = stringResource(id = R.string.copy),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(bottom = 50.dp)
        )
    }
}
