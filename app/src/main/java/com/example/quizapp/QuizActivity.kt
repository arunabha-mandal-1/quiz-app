package com.example.quizapp

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import android.graphics.Color
import com.example.quizapp.databinding.ActivityQuizBinding

class QuizActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuizBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var totalScore = 0

        binding.checkBox1.isClickable = false
        binding.checkBox2.isClickable = false
        binding.checkBox3.isClickable = false
        binding.checkBox4.isClickable = false
        binding.checkBox5.isClickable = false

        binding.questionButton1.setOnClickListener {
            var score1 = 0
            val options = arrayOf("Arunabha", "Kittu", "Samrat", "Kushal")
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("What is my name?")
            builder1.setSingleChoiceItems(options, -1, DialogInterface.OnClickListener { _, i ->
                if (options[i] == "Arunabha"){
                    score1 = 5
                }
            })
            builder1.setPositiveButton("Submit", DialogInterface.OnClickListener { dialogInterface, i ->
                binding.checkBox1.isChecked = true
                binding.questionButton1.isClickable = false
                totalScore += score1
                binding.tvScore.text = totalScore.toString()
                if(score1 == 5) {
                    binding.questionButton1.setBackgroundResource(R.drawable.checkbox_correct)
                    binding.questionButton1.setTextColor(Color.WHITE)
                }else {
                    binding.questionButton1.setBackgroundResource(R.drawable.checkbox_false)
                    binding.questionButton1.setTextColor(Color.WHITE)
                }
            })
            builder1.setNegativeButton("Cancel", DialogInterface.OnClickListener { dialogInterface, i ->
                dialogInterface.dismiss()
            })
            builder1.show()
        }

        binding.questionButton2.setOnClickListener {
            var score2 = 0
            val options = arrayOf("07/05", "17/10", "17/04", "16/11")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("What is my DOB?")
            builder2.setSingleChoiceItems(options, -1, DialogInterface.OnClickListener { _, i ->
                if (options[i] == "07/05"){
                    score2 = 5
                }
            })
            builder2.setPositiveButton("Submit", DialogInterface.OnClickListener { _, i ->
                binding.checkBox2.isChecked = true
                binding.questionButton2.isClickable = false
                totalScore += score2
                binding.tvScore.text = totalScore.toString()
                if(score2 == 5) {
                    binding.questionButton2.setBackgroundResource(R.drawable.checkbox_correct)
                    binding.questionButton2.setTextColor(Color.WHITE)
                }else {
                    binding.questionButton2.setBackgroundResource(R.drawable.checkbox_false)
                    binding.questionButton2.setTextColor(Color.WHITE)
                }
            })
            builder2.setNegativeButton("Cancel", DialogInterface.OnClickListener { dialogInterface, i ->
                dialogInterface.dismiss()
            })
            builder2.show()
        }

        binding.questionButton3.setOnClickListener {
            var score3 = 0
            val options = arrayOf("Chicken", "Prawn", "Fish", "Mutton")
            val builder3 = AlertDialog.Builder(this)
            builder3.setTitle("What is my favourite food?")
            builder3.setSingleChoiceItems(options, -1, DialogInterface.OnClickListener { _, i ->
                if (options[i] == "Prawn"){
                    score3 = 5
                }
            })
            builder3.setPositiveButton("Submit", DialogInterface.OnClickListener { _, i ->
                binding.checkBox3.isChecked = true
                binding.questionButton3.isClickable = false
                totalScore += score3
                binding.tvScore.text = totalScore.toString()
                if(score3 == 5) {
                    binding.questionButton3.setBackgroundResource(R.drawable.checkbox_correct)
                    binding.questionButton3.setTextColor(Color.WHITE)
                }else {
                    binding.questionButton3.setBackgroundResource(R.drawable.checkbox_false)
                    binding.questionButton3.setTextColor(Color.WHITE)
                }
            })
            builder3.setNegativeButton("Cancel", DialogInterface.OnClickListener { dialogInterface, i ->
                dialogInterface.dismiss()
            })
            builder3.show()
        }

        binding.questionButton4.setOnClickListener {
            var score4 = 0
            val options = arrayOf("Blue", "Black", "White", "Red")
            val builder4 = AlertDialog.Builder(this)
            builder4.setTitle("What is my favourite color?")
            builder4.setSingleChoiceItems(options, -1, DialogInterface.OnClickListener { _, i ->
                if (options[i] == "Black"){
                    score4 = 5
                }
            })
            builder4.setPositiveButton("Submit", DialogInterface.OnClickListener { _, i ->
                binding.checkBox4.isChecked = true
                binding.questionButton4.isClickable = false
                totalScore += score4
                binding.tvScore.text = totalScore.toString()
                if(score4 == 5) {
                    binding.questionButton4.setBackgroundResource(R.drawable.checkbox_correct)
                    binding.questionButton4.setTextColor(Color.WHITE)
                }else {
                    binding.questionButton4.setBackgroundResource(R.drawable.checkbox_false)
                    binding.questionButton4.setTextColor(Color.WHITE)
                }
            })
            builder4.setNegativeButton("Cancel", DialogInterface.OnClickListener { dialogInterface, i ->
                dialogInterface.dismiss()
            })
            builder4.show()
        }

        binding.questionButton5.setOnClickListener {
            var score5 = 0
            val options = arrayOf("Biology", "Mathematics", "Physics", "Chemistry")
            val builder5 = AlertDialog.Builder(this)
            builder5.setTitle("What was my favourite subject in high school?")
            builder5.setSingleChoiceItems(options, -1, DialogInterface.OnClickListener { _, i ->
                if (options[i] == "Physics"){
                    score5 = 5
                }
            })
            builder5.setPositiveButton("Submit", DialogInterface.OnClickListener { _, i ->
                binding.checkBox5.isChecked = true
                binding.questionButton5.isClickable = false
                totalScore += score5
                binding.tvScore.text = totalScore.toString()
                if(score5 == 5) {
                    binding.questionButton5.setBackgroundResource(R.drawable.checkbox_correct)
                    binding.questionButton5.setTextColor(Color.WHITE)
                }else {
                    binding.questionButton5.setBackgroundResource(R.drawable.checkbox_false)
                    binding.questionButton5.setTextColor(Color.WHITE)
                }
            })
            builder5.setNegativeButton("Cancel", DialogInterface.OnClickListener { dialogInterface, i ->
                dialogInterface.dismiss()
            })
            builder5.show()
        }

        binding.btnReset.setOnClickListener {
            binding.questionButton1.isClickable = true
            binding.questionButton1.setBackgroundResource(R.drawable.checkbox_normal)
            binding.questionButton1.setTextColor(Color.BLACK)
            binding.checkBox1.isChecked = false

            binding.questionButton2.isClickable = true
            binding.questionButton2.setBackgroundResource(R.drawable.checkbox_normal)
            binding.questionButton2.setTextColor(Color.BLACK)
            binding.checkBox2.isChecked = false

            binding.questionButton3.isClickable = true
            binding.questionButton3.setBackgroundResource(R.drawable.checkbox_normal)
            binding.questionButton3.setTextColor(Color.BLACK)
            binding.checkBox3.isChecked = false

            binding.questionButton4.isClickable = true
            binding.questionButton4.setBackgroundResource(R.drawable.checkbox_normal)
            binding.questionButton4.setTextColor(Color.BLACK)
            binding.checkBox4.isChecked = false

            binding.questionButton5.isClickable = true
            binding.questionButton5.setBackgroundResource(R.drawable.checkbox_normal)
            binding.questionButton5.setTextColor(Color.BLACK)
            binding.checkBox5.isChecked = false

            binding.tvScore.text = 0.toString()
        }
    }
}