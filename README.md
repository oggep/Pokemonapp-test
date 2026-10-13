# Oskars Pokémonsamling – Android-app

Samlingssidan inpackad som en Android-app. Hela sidan och Palafin-bilden ligger i appen, så den fungerar utan nät (typsnitten hämtas från Google Fonts när nät finns, annars används systemtypsnitt). Slumphistoriken och kortet i one touch-hållaren sparas i appen.

## Få fram APK:n – välj ett sätt

### A. Via GitHub (inget att installera)
1. Skapa ett nytt repo på github.com och ladda upp allt i den här mappen (dra in filerna under *Add file → Upload files*). Mappen `.github` måste följa med.
2. Gå till fliken **Actions**. Bygget "Bygg APK" startar av sig självt och tar ett par minuter.
3. Öppna körningen när den är grön och ladda ner **Pokemonsamling-apk** längst ner. Packa upp zip-filen – där ligger `app-release.apk`.

### B. Med Android Studio
1. Öppna mappen i Android Studio (*File → Open*) och vänta tills Gradle-synken är klar.
2. Koppla in telefonen med USB-felsökning påslaget och tryck på ▶ Run – eller välj *Build → Build APK(s)*.

## Installera på telefonen
Skicka APK-filen till telefonen och öppna den. Android frågar om du vill tillåta installation från den appen (t.ex. Filer eller Chrome) – godkänn så installeras **Pokémonsamling**.

## Uppdatera samlingen
Ersätt `app/src/main/assets/index.html` med en ny version av sidan, höj `versionCode` i `app/build.gradle.kts` och bygg igen. Den nya APK:n installeras ovanpå den gamla och behåller historiken.
