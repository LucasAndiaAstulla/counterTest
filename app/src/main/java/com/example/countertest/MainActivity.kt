package com.example.countertest

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

//muito importante importar ara qualquer erro
import android.widget.TextView
import android.widget.Button



class MainActivity : AppCompatActivity() {

    //declarando uma variável/Crindo a variável
    private lateinit var counter_txt : TextView
    private lateinit var button_click: Button

    private lateinit var counter2_txt : TextView
    private lateinit var button2_click: Button

    private lateinit var counter3_txt : TextView
    private lateinit var button3_click: Button

    private lateinit var counter4_txt : TextView
    private lateinit var button4_click: Button


    override fun onCreate(savedInstanceState: Bundle?) {

        //Código já pré-feito
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        } //Código já pré-feito


        //Receber dados input do botão e mostrar no conuter
        counter_txt = findViewById(R.id.counter_txt)
        button_click = findViewById(R.id.bnt_click)

        counter2_txt = findViewById(R.id.counterDiarias_txt)
        button2_click = findViewById(R.id.bnt_clickDia)

        counter3_txt = findViewById(R.id.counterVisitas_txt)
        button3_click = findViewById(R.id.bnt_clickVisi)

        counter4_txt = findViewById(R.id.counterMensal_txt)
        button4_click = findViewById(R.id.bnt_clickMen)

        //Definir que valor principal
        var timesClicked = 0
        var timesClickedDia = 0
        var timesClickedVisi = 0
        var timesClickedMen = 0

        //Metodo para fazer a contagem
        button_click.setOnClickListener {

            timesClicked += 1

            counter_txt.text = timesClicked.toString()

        }

        button2_click.setOnClickListener {

            timesClickedDia += 1

            counter2_txt.text = timesClickedDia.toString()

        }

        button3_click.setOnClickListener {

            timesClickedVisi += 1

            counter3_txt.text = timesClickedVisi.toString()

        }

        button4_click.setOnClickListener {

            timesClickedMen += 1

            counter4_txt.text = timesClickedMen.toString()

        }

    }
}