package com.example.calculatordemo

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun Calculator() {
    var number1 by remember { mutableStateOf("") }
    var number2 by remember { mutableStateOf("") }
    var result by remember { mutableStateOf("") }

    Box() {
        Column {
            TextField(
                placeholder = {
                    Text(
                        text = "Enter First Digit"
                    )

                }


            )
            TextField(
                placeholder = {
                    Text(
                        text = "Enter Second Digit"
                    )

                }
            )
            TextField(
                placeholder = {
                    Text(
                        text = "Result"
                    )

                }
            )
        }
        Row {
            Button(
                onClick = {}
            ) {
                Text(
                    text = "+"
                )
            }
            Button(
                onClick = {}
            ) {
                Text(
                    text = "-"
                )
            }
            Button(
                onClick = {}
            ) {
                Text(
                    text = "*"
                )

                Button(
                    onClick = {}
                ) {
                    Text(
                        text = "/"
                    )
                }

            }
        }
    }
}




    @Preview(showBackground = true)
    @Composable
    fun CalculatorPreview() {
        Calculator()


    }


