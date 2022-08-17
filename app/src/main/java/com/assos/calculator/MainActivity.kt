package com.assos.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    fun Toplama(view: View){
        var sayi1=rakam1.text.toString().toDoubleOrNull()
        var sayi2=rakam2.text.toString().toDoubleOrNull()
        if (sayi1==null || sayi2==null){
            textView.text="Sayı girmeyi unutmayın"
        }
        else{
            var sonuc=sayi1+sayi2
            textView.text="Sonuç: ${sonuc}"
        }
    }

    fun Cikarma(view:View){
        var sayi1=rakam1.text.toString().toDoubleOrNull()
        var sayi2=rakam2.text.toString().toDoubleOrNull()
        if (sayi1==null || sayi2==null){
            textView.text="Sayı girmeyi unutmayın"
        }
        else{
            var sonuc=sayi1-sayi2
            textView.text="Sonuç: ${sonuc}"
        }

    }
    fun Carpma(view:View){
        var sayi1=rakam1.text.toString().toDoubleOrNull()
        var sayi2=rakam2.text.toString().toDoubleOrNull()
        if (sayi1==null || sayi2==null){
            textView.text="Sayı girmeyi unutmayın"
        }
        else{
            var sonuc=sayi1*sayi2
            textView.text="Sonuç: ${sonuc}"
        }
    }
    fun Bolme(view:View){
        var sayi1=rakam1.text.toString().toDoubleOrNull()
        var sayi2=rakam2.text.toString().toDoubleOrNull()
        if (sayi1==null || sayi2==null){
            textView.text="Sayı girmeyi unutmayın"
        }
        else{
            var sonuc=sayi1/sayi2
            textView.text="Sonuç: ${sonuc}"
        }
    }
}