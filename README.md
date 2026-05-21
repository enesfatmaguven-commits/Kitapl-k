# Kitaplık 📚

Android için PDF Kitap Okuyucu Kütüphanesi - Notlar, Highlight ve Sesli Notlar ile

## 🎯 Özellikler

- 📖 **PDF Kitap Görüntüleme**: Telefon ve tablet desteği
- 🖍️ **Metin Altını Çizme (Highlight)**: Önemli cümleleri vurgulayın
- 📝 **Yazılı Notlar**: Sayfalara notlar ekleyin
- 🎤 **Sesli Notlar**: Ses kaydı yaparak notlar bırakın
- 🗂️ **Yapışkan Notlar**: Sayfaya yapışkan notlar ekleyin
- 🔍 **Kitap Arama**: Başlık ve yazar ile kitap arayın
- 📊 **Okuma Takibi**: Son okunan sayfa ve tarihi takip edin

## 🛠️ Teknoloji Stack

- **Dil**: Kotlin
- **Mimari**: MVVM (Model-View-ViewModel)
- **Database**: Room
- **PDF Viewer**: PDFium
- **Async**: Coroutines & Flow
- **Android Min SDK**: 24
- **Android Target SDK**: 34

## 📦 Yapı

```
src/main/
├── kotlin/com/kitaplik/
│   ├── data/
│   │   ├── entity/        # Veri modelleri
│   │   ├── dao/           # Database erişim nesneleri
│   │   └── database/      # Room veritabanı
│   ├── domain/
│   │   ├── repository/    # Repository arayüzleri
│   │   └── usecase/       # İş mantığı
│   └── ui/
│       ├── viewmodel/     # ViewModels
│       └── view/          # UI bileşenleri
└── res/                   # Kaynaklar
```

## 🚀 Kurulum

### 1. Projeyi Klonlayın
```bash
git clone https://github.com/enesfatmaguven-commits/Kitapl-k.git
cd Kitapl-k
```

### 2. Android Studio'da Açın
Android Studio açıp **File > Open** ile projeyi açın.

### 3. Gradle Build Yapın
```bash
./gradlew build
```

## 📖 Kullanım

### Kitap Ekleme
```kotlin
val book = Book(
    title = "Sabahattin Ali",
    author = "Kürk Mantılı Madonna",
    pdfPath = "/path/to/book.pdf"
)
bookRepository.addBook(book)
```

### Not Ekleme
```kotlin
val note = Note(
    bookId = bookId,
    page = 5,
    type = NoteType.TEXT,
    content = "Bu sayfa önemli"
)
noteRepository.addNote(note)
```

### Metin Vurgulama
```kotlin
val highlight = Highlight(
    bookId = bookId,
    page = 5,
    text = "Önemli metin",
    color = "#FFEB3B"
)
highlightRepository.addHighlight(highlight)
```

## 📝 Veritabanı Şeması

### Books Tablosu
- `id`: Benzersiz kimlik (Primary Key)
- `title`: Kitap başlığı
- `author`: Yazar adı
- `pdfPath`: PDF dosyasının yolu
- `currentPage`: Şu anki okunan sayfa
- `totalPages`: Toplam sayfa sayısı
- `lastReadAt`: Son okunma tarihi

### Highlights Tablosu
- `id`: Benzersiz kimlik
- `bookId`: İlişkili kitap (Foreign Key)
- `page`: Sayfa numarası
- `text`: Vurgulanan metin
- `color`: Renk kodu

### Notes Tablosu
- `id`: Benzersiz kimlik
- `bookId`: İlişkili kitap (Foreign Key)
- `page`: Sayfa numarası
- `type`: Not türü (TEXT, VOICE, STICKY)
- `content`: Metin içeriği
- `voicePath`: Ses dosyası yolu
- `x, y`: Yapışkan not pozisyonu

## 🔐 İzinler

```xml
<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
<uses-permission android:name="android.permission.RECORD_AUDIO" />
```

## 🤝 Katkı

Katkılar hoşça karşılanır! Lütfen PR göndermek için bir branch oluşturun.

## 📄 Lisans

Bu proje MIT Lisansı altında lisanslanmıştır.

## 📞 İletişim

Sorularınız için: [enesfatmaguven-commits](https://github.com/enesfatmaguven-commits)

---

**Mutlu okumalar! 📚✨**
