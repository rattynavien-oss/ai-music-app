# AI Music Generator APK

An Android application that generates music using artificial intelligence.

## Features

- 🎵 Generate music from text descriptions
- 🎨 Multiple music styles
- 💾 Save and manage generated tracks
- 🎨 Modern Material Design 3 UI
- 📱 Works on Android 7.0+

## Tech Stack

- **Language:** Kotlin
- **UI Framework:** Jetpack Compose
- **API:** Retrofit + OkHttp
- **Audio:** Media3 ExoPlayer
- **Database:** Room
- **DI:** Koin

## Setup

### Prerequisites

- Android Studio Flamingo or newer
- JDK 11+
- Android SDK 34

### Installation

1. Clone the repository
   ```bash
   git clone https://github.com/rattynavien-oss/ai-music-app.git
   cd ai-music-app
   ```

2. Open in Android Studio

3. Configure API Key
   - Get an API key from [Suno AI](https://suno.ai) or your preferred service
   - Update `MusicRepository.kt` with your API key

4. Build and Run
   ```bash
   ./gradlew build
   ./gradlew installDebug
   ```

## Building APK

### Debug APK
```bash
./gradlew assembleDebug
```
Output: `app/build/outputs/apk/debug/app-debug.apk`

### Release APK
```bash
./gradlew assembleRelease
```
Output: `app/build/outputs/apk/release/app-release.apk`

## API Integration

Currently configured for Suno AI. To use a different service:

1. Update `MusicApiService.kt` with new endpoints
2. Modify request/response models
3. Update `MusicRepository.kt` with proper authentication

## Project Structure

```
app/src/main/java/com/rattynavien/aimusicapp/
├── MainActivity.kt
├── data/
│   ├── api/
│   │   └── MusicApiService.kt
│   └── repository/
│       └── MusicRepository.kt
└── ui/
    ├── screens/
    │   └── MainScreen.kt
    └── theme/
        ├── Theme.kt
        ├── Color.kt
        └── Type.kt
```

## Future Features

- [ ] User authentication
- [ ] Cloud sync for generated music
- [ ] Offline music generation
- [ ] Advanced audio editing
- [ ] Sharing to social media
- [ ] Premium features

## License

MIT License - see LICENSE file for details

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.
