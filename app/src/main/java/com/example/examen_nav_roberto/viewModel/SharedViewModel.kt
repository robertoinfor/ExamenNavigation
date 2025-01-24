package com.example.examen_nav_roberto.viewModel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class SharedViewModel: ViewModel() {
    private val _numbers = mutableStateOf(emptyList<Int>())
    val numbers: State<List<Int>> = _numbers

    private val _names = mutableStateOf(emptyList<String>())
    val names: MutableState<List<String>> = _names

    fun generateList() {
        _numbers.value = (0..9).sorted()
        _names.value = listOf("Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine")
    }

}