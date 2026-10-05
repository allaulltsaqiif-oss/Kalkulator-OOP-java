# Kalkulator-OOP-java
# 💎 Modern Glassmorphic Java Swing Calculator

Aplikasi Kalkulator Desktop bertema **Dark Glassmorphic** ala iOS/macOS yang dibangun menggunakan **Java Swing**. Memiliki antarmuka visual modern dengan teknik *custom rendering* 2D (Anti-Aliasing) untuk hasil tampilan yang halus, tajam, dan responsif tanpa menggunakan pustaka eksternal.

---

## ✨ Fitur Utama

- **Glassmorphism Dark Theme**: Tampilan *elevated glass display* dengan skema warna *Obsidian* dan *Vibrant Indigo*.
- **Anti-Aliased Vector Rendering**: Sudut tombol dan layar melengkung secara presisi (*Squircle / Rounded Corners*) tanpa garis bergerigi.
- **Interaksi Mikro**: Efek visual *hover highlight* dan *pressed feedback* saat tombol ditekan.
- **Live Expression Tracker**: Menampilkan ekspresi angka dan operator aktif di bagian atas kalkulator.
- **Operasi Aritmatika Lengkap**:
  - Penjumlahan (`+`), Pengurangan (`-`), Perkalian (`×`), Pembagian (`÷`).
  - Persentase (`%`), Hapus per karakter (`⌫`), Positive/Negative Toggle (`±`), dan Reset (`AC`).
- **Safety Handling**: Proteksi otomatis terhadap kesalahan kalkulasi (seperti pembagian dengan nol).

---

## 🛠️ Prasyarat & Teknologi

- **Bahasa Pemrograman**: Java (JDK 8 atau versi lebih baru)
- **GUI Framework**: Java Swing & AWT (Library standar Java, tanpa *dependency* tambahan)

---

## 🚀 Cara Menjalankan Aplikasi

### 1. Buat File Kode
Buat file bernama **`Calculator.java`** dan salin seluruh kode Java yang telah disediakan ke dalam file tersebut.

### 2. Kompilasi Kode
Buka Terminal atau Command Prompt di direktori tempat file disimpan, lalu jalankan perintah:

```bash
javac Calculator.java
