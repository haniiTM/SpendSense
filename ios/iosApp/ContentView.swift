//
//  ContentView.swift
//  iosApp
//
//  Created by  user on 5/11/24.
//

import SwiftUI
import shared

struct ContentView: View {
    var body: some View {
        RootView()
    }
}

struct RootView: UIViewControllerRepresentable {
    func makeUIViewController(context: Context) -> some UIViewController {
        RootViewKt.RootViewController()
    }

    func updateUIViewController(_ uiViewController: UIViewControllerType, context: Context) {}
}
