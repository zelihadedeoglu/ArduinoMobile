// NavGraph.kt
package com.example.sports.ui

import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.compose.ui.Modifier
import com.example.sports.ui.theme.FirstScreen

@Composable
fun NavGraph(
    navController: NavHostController,
    windowSizeClass: WindowWidthSizeClass,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = "first_screen",
        modifier = modifier
    ) {
        composable("first_screen") {
            FirstScreen(navController = navController)
        }
        composable("sports_screen/{ids}") { backStackEntry ->
            val ids = backStackEntry.arguments?.getString("ids")?.split(",")?.map { it.toInt() } ?: emptyList()
            SportsScreen(
                windowSize = windowSizeClass,
                onBackPressed = { navController.popBackStack() },
                sportsIds = ids
            )
        }
        composable("coffee_places") {
            SportsScreen(
                windowSize = windowSizeClass,
                onBackPressed = { navController.popBackStack() },
                sportsIds = listOf(4, 5, 6)
            )
        }
        composable("parks") {
            SportsScreen(
                windowSize = windowSizeClass,
                onBackPressed = { navController.popBackStack() },
                sportsIds = listOf(7, 8, 9, 10)
            )
        }
    }
}
