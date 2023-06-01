package com.example.doctorapp.navigation.screen

sealed class HomeScreen(val route: String, val name: String) {
    object Home :
        HomeScreen(route = "HOME", name = "Home")

    object BookVisit :
        HomeScreen(route = "BOOK_VISIT", name = "Book visit")

    object RequestPrescription :
        HomeScreen(route = "REQUEST_PRESCRIPTION", name = "Request prescription")

    object RequestCertificate :
        HomeScreen(route = "REQUEST_CERTIFICATE", name = "Request certificate")

    object DetectBiomedicalData :
        HomeScreen(route = "DETECT_BIOMEDICAL_DATA", name = "Detect biomedical data")
}