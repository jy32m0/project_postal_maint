package com.example.postal_maint.ui.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.postal_maint.R
import com.example.postal_maint.ui.navigation.NavigationDestination
import com.example.postal_maint.viewmodel.AppViewModelProvider
import com.example.postal_maint.viewmodel.HomeViewModel

object HomeDestination : NavigationDestination {
    override val route = "home"
    override val titleResID = R.string.app_name
}


@Composable
fun HomeScreen(
    navToCallEntry: () -> Unit,
    navToCallUpdate: (Int) -> Unit,
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = viewModel(factory = AppViewModelProvider.Factory)
) {
    val homeUiState by viewModel.homeUiState.collectAsState()
}
