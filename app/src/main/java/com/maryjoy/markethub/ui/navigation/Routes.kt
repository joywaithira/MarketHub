package com.maryjoy.markethub.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.maryjoy.markethub.ui.screens.about.AboutScreen
import com.maryjoy.markethub.ui.screens.auth.LoginScreen
import com.maryjoy.markethub.ui.screens.auth.RegisterScreen
import com.maryjoy.markethub.ui.screens.home.HomeScreen
import com.maryjoy.markethub.ui.screens.intent.IntentScreen
import com.maryjoy.markethub.ui.screens.onboarding.OnBoardingScreen
import com.maryjoy.markethub.ui.screens.payment.PaymentScreen
import com.maryjoy.markethub.ui.screens.service.ServiceScreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_OnBoarding
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUTE_Home) {
            HomeScreen(navController)
        }
        composable(ROUTE_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUTE_Login) {
            LoginScreen(navController)
        }
        composable(ROUTE_Register) {
            RegisterScreen(navController)
        }
        composable(ROUTE_OnBoarding) {
            OnboardingScreen(navController)
        }

        composable(ROUTE_Payments) {
            PaymentScreen(navController)
        }
        composable(ROUTE_Service) {
            ServiceScreen(navController)
        }

        composable(ROUTE_Intent) {
            IntentScreen(navController)
        }






    }
}