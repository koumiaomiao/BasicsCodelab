package com.kmj.basicscodelab.ui.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel : ViewModel() {
    
    private val _shouldShowOnboarding = MutableStateFlow(true)
    val shouldShowOnboarding: StateFlow<Boolean> = _shouldShowOnboarding.asStateFlow()
    
    private val _greetingNames = MutableStateFlow(List(1000) { "$it" })
    val greetingNames: StateFlow<List<String>> = _greetingNames.asStateFlow()
    
    fun onContinueClicked() {
        _shouldShowOnboarding.value = false
    }
    
    fun resetToOnboarding() {
        _shouldShowOnboarding.value = true
    }
    
    fun updateGreetingNames(names: List<String>) {
        _greetingNames.value = names
    }
} 