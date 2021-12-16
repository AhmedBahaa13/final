package com.example.finalproject.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.finalproject.adapetrs.LevelsAdapter
import com.example.finalproject.databinding.FragmentQuestionsLevelBinding
import com.google.android.material.navigation.NavigationView


class QuestionsLevelFragment : Fragment() {
    private lateinit var binding: FragmentQuestionsLevelBinding
    private var list:ArrayList<String> = ArrayList()
    private lateinit var navController:NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        list.add("One")
        list.add("Two")
        list.add("Three")
        list.add("Four")
        list.add("Five")
        list.add("Sex")
        list.add("Seven")
        list.add("Eight")
        binding = FragmentQuestionsLevelBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpRecycler()
    }

   private fun setUpRecycler(): Unit {
        val adapter = LevelsAdapter(list)
        binding.recyclerView.layoutManager =
            GridLayoutManager(activity, 2, LinearLayoutManager.VERTICAL, false)
        binding.recyclerView.adapter = adapter
    }
}