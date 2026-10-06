<div align="center">

# 🌌 Obsidian Scientific Calculator

<p align="center">
  <strong>Aplikasi Kalkulator Ilmiah Desktop Modern (Mode Landscape) dengan Dukungan Keyboard & Panel Riwayat</strong>
</p>

[![Java Version](https://img.shields.io/badge/Java-8%2B-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.oracle.com/java/)
[![GUI Framework](https://img.shields.io/badge/GUI-Java%20Swing-5382A1?style=for-the-badge&logo=openjdk&logoColor=white)](https://docs.oracle.com/javase/8/docs/technologies/desktop/swing.html)
[![Dependencies](https://img.shields.io/badge/Dependencies-Zero-brightgreen?style=for-the-badge)](#)
[![License](https://img.shields.io/badge/License-MIT-blue.svg?style=for-the-badge)](LICENSE)

---

[✨ Fitur Unggulan](#-fitur-unggulan) • [🎨 Sistem Desain](#-sistem-desain--warna) • [🚀 Cara Menjalankan](#-panduan-menjalankan-aplikasi) • [⌨️ Pintasan Keyboard](#-panduan-pintasan-keyboard)

---

</div>

## 📸 Skema Antarmuka (Landscape Mode)

Antarmuka dirancang khusus untuk layar laptop/desktop dengan pembagian dua panel utama (Kalkulator di kiri, Riwayat di kanan):

```text
┌────────────────────────────────────────────────────────────────────────┐
│   Scientific Calculator                                          ─ ▢ × │
├────────────────────────────────────────────────────────────────────────┤
│  ┌─────────────────────────┐   ┌────────────────────────────────────┐  │
│  │     1,250 + 450         │   │ Riwayat Kalkulasi                  │  │
│  │     1,700               │   │ ─────────────────────────────────  │  │
│  └─────────────────────────┘   │ 1,250 + 450 = 1,700                │  │
│                                │ sin(90) = 1                        │  │
│  [ √ ] [x² ] [AC ] [⌫ ] [÷ ]   │ 5² = 25                            │  │
│  [sin] [ 7 ] [ 8 ] [ 9 ] [× ]  │ log(100) = 2                       │  │
│  [cos] [ 4 ] [ 5 ] [ 6 ] [- ]  │                                    │  │
│  [tan] [ 1 ] [ 2 ] [ 3 ] [+ ]  │                                    │  │
│  [log] [ ± ] [ 0 ] [ . ] [= ]  │ [ Hapus Riwayat ]                  │  │
│  └─────────────────────────┘   └────────────────────────────────────┘  │
└────────────────────────────────────────────────────────────────────────┘
✨ Fitur Unggulan💻
Landscape Dual-Panel UI: Tata letak melebar yang memaksimalkan ruang layar komputer, memisahkan area input angka dan panel pemantauan riwayat.
🧮 Operasi Ilmiah (Scientific): Dilengkapi dengan fungsi matematika lanjutan seperti Trigonometri (sin, cos, tan), Logaritma (log), Akar Kuadrat (√), dan Pangkat (x²).
⌨️ Native Keyboard Integration: Mengetik angka dan operator langsung dari keyboard fisik. Menggunakan teknologi KeyBindings Java untuk mencegah masalah hilangnya fokus (berbeda dengan KeyListener biasa).
📜 Live History Tracker: Setiap operasi yang berhasil dieksekusi akan langsung dicatat secara runut di panel kanan, lengkap dengan tombol untuk membersihkan riwayat.
🎨 Anti-Aliased Vector Rendering: Rendering grafis 2D kustom yang menghasilkan tepi tombol dan layar melengkung (Squircle) dengan sangat halus tanpa piksel bergerigi.
🎨 Sistem Desain & WarnaDibangun dengan estetika Obsidian Dark, memberikan kontras warna yang nyaman di mata untuk penggunaan jangka panjang:Elemen UIKode HexVisualDeskripsiApp Background#0F111A⬛Deep Obsidian untuk latar belakang utamaPanel Base#181A26
🌑Layar & Panel Riwayat bertema Glass ElevatedBorder Glow#2A2D3E
🌘Garis batas (outline) pemisah antar panelNumeric Keys#1F2232
🌚Abu-abu kebiruan gelap untuk angka 0-9Math Functions#2D3148
🫐Muted Indigo untuk tombol trigonometri & aljabarBasic Operators#6366F1
🔵Vibrant Indigo sebagai aksen operator dasarEquals & Enter#10B981🟢Emerald Green penanda eksekusi kalkulasi⌨️ Panduan Pintasan KeyboardGunakan keyboard fisikmu untuk mempercepat perhitungan:Angka 0-9 : Ketik langsung dari Numpad atau baris angka atas.Operator + - * / : Menjalankan operasi dasar.Tombol Enter : Mengeksekusi hasil (Sama dengan =).Tombol Backspace : Menghapus satu karakter terakhir (⌫).Tombol Escape (Esc) : Menghapus semua layar / All Clear (AC).🚀 Panduan Menjalankan AplikasiAplikasi ini tidak membutuhkan dependensi eksternal (seperti Maven/Gradle). Kamu hanya membutuhkan Java Development Kit (JDK) 8+.1. Persiapan FileSimpan kode sumber aplikasi ke dalam file bernama ScientificCalculator.java.2. Kompilasi (Build)Buka Terminal atau Command Prompt di direktori tempat kamu menyimpan file, lalu ketik:Bashjavac ScientificCalculator.java
3. Eksekusi (Run)Setelah proses kompilasi sukses, jalankan program dengan perintah:Bashjava ScientificCalculator
🏗️ Struktur Kode UtamaProyek ini dibangun secara modular menggunakan komponen kustom untuk memaksimalkan tampilan:ScientificCalculator.java: Kelas utama (JFrame) yang mengatur tata letak BorderLayout dan GridLayout.RoundedPanel.class: Kelas custom untuk menggambar panel layar dan riwayat dengan sudut melengkung.RoundedButton.class: Kelas custom untuk menggambar tombol dengan efek Hover, Pressed, dan teks presisi di tengah.
