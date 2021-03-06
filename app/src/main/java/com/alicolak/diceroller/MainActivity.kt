package com.alicolak.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.alicolak.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    lateinit var rollButton : Button
    lateinit var imageView1 : ImageView
    lateinit var imageView2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        rollButton = binding.rollButton
        imageView1 = binding.imageView1
        imageView2 = binding.imageView2

        rollButton.setOnClickListener {
            rollDice()
        }

    }


    private fun rollDice() {
        val dice1 = Dice(6)
        val dice2 = Dice(6)
        val diceRoll1 = dice1.roll()
        val diceRoll2 = dice2.roll()

        when (diceRoll1) {
            1 -> binding.imageView1.setImageResource(R.drawable.dice_1)
            2 -> binding.imageView1.setImageResource(R.drawable.dice_2)
            3 -> binding.imageView1.setImageResource(R.drawable.dice_3)
            4 -> binding.imageView1.setImageResource(R.drawable.dice_4)
            5 -> binding.imageView1.setImageResource(R.drawable.dice_5)
            6 -> binding.imageView1.setImageResource(R.drawable.dice_6)
        }

        when (diceRoll2) {
            1 -> binding.imageView2.setImageResource(R.drawable.dice_1)
            2 -> binding.imageView2.setImageResource(R.drawable.dice_2)
            3 -> binding.imageView2.setImageResource(R.drawable.dice_3)
            4 -> binding.imageView2.setImageResource(R.drawable.dice_4)
            5 -> binding.imageView2.setImageResource(R.drawable.dice_5)
            6 -> binding.imageView2.setImageResource(R.drawable.dice_6)
        }

        if (diceRoll1 == 1 && diceRoll2 ==1) {
            val toast = Toast.makeText(this,"Hep Yek",Toast.LENGTH_SHORT)
            toast.show()
        } else if ((diceRoll1 == 1 && diceRoll2 ==2) || (diceRoll1 == 2 && diceRoll2 ==1)) {
            val toast = Toast.makeText(this,"D?? Yek",Toast.LENGTH_SHORT)
            toast.show()
        } else if (diceRoll1 == 2 && diceRoll2 ==2) {
            val toast = Toast.makeText(this,"D?? Bara",Toast.LENGTH_SHORT)
            toast.show()
        } else if ((diceRoll1 == 3 && diceRoll2 ==1) || (diceRoll1 == 1 && diceRoll2 ==3)) {
            val toast = Toast.makeText(this,"Se Yek",Toast.LENGTH_SHORT)
            toast.show()
        } else if ((diceRoll1 == 3 && diceRoll2 ==2) || (diceRoll1 == 2 && diceRoll2 ==3)) {
            val toast = Toast.makeText(this,"Seba-i D??",Toast.LENGTH_SHORT)
            toast.show()
        } else if (diceRoll1 == 3 && diceRoll2 ==3) {
            val toast = Toast.makeText(this,"D?? Se",Toast.LENGTH_SHORT)
            toast.show()
        } else if ((diceRoll1 == 4 && diceRoll2 ==1) || (diceRoll1 == 1 && diceRoll2 ==4)) {
            val toast = Toast.makeText(this,"Caar-i Yek",Toast.LENGTH_SHORT)
            toast.show()
        } else if ((diceRoll1 == 4 && diceRoll2 ==2) || (diceRoll1 == 2 && diceRoll2 ==4)) {
            val toast = Toast.makeText(this,"Caar-i D??",Toast.LENGTH_SHORT)
            toast.show()
        } else if ((diceRoll1 == 4 && diceRoll2 ==3) || (diceRoll1 == 3 && diceRoll2 ==4)) {
            val toast = Toast.makeText(this,"Caar-i Se",Toast.LENGTH_SHORT)
            toast.show()
        } else if (diceRoll1 == 4 && diceRoll2 ==4) {
            val toast = Toast.makeText(this,"D??rt Caar",Toast.LENGTH_SHORT)
            toast.show()
        } else if ((diceRoll1 == 5 && diceRoll2 ==1) || (diceRoll1 == 1 && diceRoll2 ==5)) {
            val toast = Toast.makeText(this,"Penc-?? Yek",Toast.LENGTH_SHORT)
            toast.show()
        } else if ((diceRoll1 == 5 && diceRoll2 ==2) || (diceRoll1 == 2 && diceRoll2 ==5)) {
            val toast = Toast.makeText(this,"Penc i D??",Toast.LENGTH_SHORT)
            toast.show()
        } else if ((diceRoll1 == 5 && diceRoll2 ==3) || (diceRoll1 == 3 && diceRoll2 ==5)) {
            val toast = Toast.makeText(this,"Penc-?? Se",Toast.LENGTH_SHORT)
            toast.show()
        } else if ((diceRoll1 == 5 && diceRoll2 ==4) || (diceRoll1 == 4 && diceRoll2 ==5)) {
            val toast = Toast.makeText(this," Penc-?? Caar",Toast.LENGTH_SHORT)
            toast.show()
        } else if (diceRoll1 == 5 && diceRoll2 ==5) {
            val toast = Toast.makeText(this,"D?? Be??",Toast.LENGTH_SHORT)
            toast.show()
        } else if ((diceRoll1 == 6 && diceRoll2 ==1) || (diceRoll1 == 1 && diceRoll2 ==6)) {
            val toast = Toast.makeText(this,"??e??-?? Yek",Toast.LENGTH_SHORT)
            toast.show()
        } else if ((diceRoll1 == 6 && diceRoll2 ==2) || (diceRoll1 == 2 && diceRoll2 ==6)) {
            val toast = Toast.makeText(this,"??e??-i D??",Toast.LENGTH_SHORT)
            toast.show()
        } else if ((diceRoll1 == 6 && diceRoll2 ==3) || (diceRoll1 == 3 && diceRoll2 ==6)) {
            val toast = Toast.makeText(this,"??e??-?? Se",Toast.LENGTH_SHORT)
            toast.show()
        } else if ((diceRoll1 == 6 && diceRoll2 ==4) || (diceRoll1 == 4 && diceRoll2 ==6)) {
            val toast = Toast.makeText(this,"??e?? Caar",Toast.LENGTH_SHORT)
            toast.show()
        } else if ((diceRoll1 == 6 && diceRoll2 ==5) || (diceRoll1 == 5 && diceRoll2 ==6)) {
            val toast = Toast.makeText(this,"??e?? Be??",Toast.LENGTH_SHORT)
            toast.show()
        } else if (diceRoll1 == 6 && diceRoll2 ==6) {
            val toast = Toast.makeText(this,"D?? ??e??",Toast.LENGTH_SHORT)
            toast.show()
        }

    }

}

class Dice (private val numSides : Int ) {
    fun roll() : Int {
        return (1..numSides).random();
    }
}