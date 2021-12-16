package com.example.finalproject.adapetrs

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.Navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.R
import com.example.finalproject.fragments.QuestionsLevelFragmentDirections
import com.google.android.material.bottomsheet.BottomSheetDialog

class LevelsAdapter(var list: ArrayList<String>) :
    RecyclerView.Adapter<LevelsAdapter.LevelsViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LevelsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return LevelsViewHolder(view)
    }

    override fun onBindViewHolder(holder: LevelsViewHolder, position: Int) {
        holder.bind(list, position)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class LevelsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val levelText: TextView = itemView.findViewById<TextView>(R.id.text_level)
        private val cardLevel: CardView = itemView.findViewById<CardView>(R.id.card_view)
        fun bind(list: ArrayList<String>, position: Int) {
            levelText.text = list[position]
            cardLevel.setOnClickListener {
                val bottomSheetDialog =
                    BottomSheetDialog(itemView.context, R.style.BottomSheetStyle)
                val bottomSheetView = LayoutInflater.from(itemView.context).inflate(
                    R.layout.bottom_sheet_layout,
                    itemView.findViewById<ConstraintLayout>(R.id.sheet_container)
                )
                bottomSheetDialog.setContentView(bottomSheetView)
                bottomSheetDialog.show()

                val nextAction =
                    QuestionsLevelFragmentDirections.actionQuestionsLevelFragmentToQuizFragment(
                        1,
                        5
                    )
            }
        }
    }
}