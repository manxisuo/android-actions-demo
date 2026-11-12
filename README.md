# 交互实验室 Android App

This repository wraps [Interactive Labs](https://manxisuo.github.io/interactive-labs/) in a native Android WebView shell.

- Online content stays up to date with the GitHub Pages website.
- JavaScript, DOM storage, Canvas and Web Audio are enabled.
- Android Back navigates WebView history.
- Links outside the Interactive Labs site open in the system browser.
- GitHub Actions builds a debug APK; no local Android Studio required.

Go to **Actions → Build Android APK → Artifacts → android-demo-debug-apk** to download.

The app requires an internet connection. WebView behavior may differ from Chrome, and audio requires a user gesture.
