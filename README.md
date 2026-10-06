<div align="center">

# 🌌 Obsidian Scientific Calculator

<p align="center">
  <strong>Aplikasi Kalkulator Ilmiah Desktop Modern (Mode Landscape) dengan Dukungan Keyboard & Panel Riwayat</strong>
</p>

[![Java Version](https://img.shields.io/badge/Java-8%2B-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.oracle.com/java/)
[![GUI Framework](https://img.shields.io/badge/GUI-Java%20Swing-5382A1?style=for-the-badge&logo=openjdk&logoColor=white)](https://docs.oracle.com/javase/8/docs/technologies/desktop/swing.html)
[![Dependencies](https://img.shields.io/badge/Dependencies-Zero-brightgreen?style=for-the-badge)](#)
[![License](https://img.shields.io/badge/License-MIT-blue.svg?style=for-the-badge)](LICENSE)

## 📸 Skema Antarmuka (Landscape Mode)

Antarmuka dirancang khusus untuk layar laptop/desktop dengan pembagian dua panel utama (Kalkulator di kiri, Riwayat di kanan):

```text
+-------------------------------------------------------------+
| Scientific Calculator                                 - [] X|
+-------------------------------------------------------------+
|  +-----------------------+  +----------------------------+  |
|  |           1,250 + 450 |  | Riwayat Kalkulasi          |  |
|  |                 1,700 |  | -------------------------- |  |
|  +-----------------------+  | 1,250 + 450 = 1,700        |  |
|                             | sin(90) = 1                |  |
|  [ v ] [x^2] [AC] [<x] [/]  | 5^2 = 25                   |  |
|  [sin] [ 7 ] [ 8 ] [ 9 ] [*]  | log(100) = 2               |  |
|  [cos] [ 4 ] [ 5 ] [ 6 ] [-]  |                            |  |
|  [tan] [ 1 ] [ 2 ] [ 3 ] [+]  |                            |  |
|  [log] [ +-] [ 0 ] [ . ] [=]  | [ Hapus Riwayat ]          |  |
|  +-----------------------+  +----------------------------+  |
+-------------------------------------------------------------+
✨ Fitur Unggulan
Landscape Dual-Panel UI: Tata letak melebar yang memaksimalkan ruang layar komputer, memisahkan area input angka dan panel pemantauan riwayat.

Operasi Ilmiah (Scientific): Dilengkapi dengan fungsi matematika lanjutan seperti Trigonometri (sin, cos, tan), Logaritma (log), Akar Kuadrat (v), dan Pangkat (x^2).

Native Keyboard Integration: Mengetik angka dan operator langsung dari keyboard fisik menggunakan teknologi KeyBindings.

Live History Tracker: Setiap operasi yang berhasil dieksekusi langsung dicatat secara runut di panel kanan, lengkap dengan tombol hapus riwayat.

Anti-Aliased Vector Rendering: Rendering grafis 2D kustom yang menghasilkan tepi tombol melengkung dengan sangat halus.

🎨 Sistem Desain & Warna
Dibangun dengan estetika Obsidian Dark, memberikan kontras warna yang nyaman di mata:

App Background (#0F111A) : Obsidian gelap untuk latar belakang utama.

Panel Base (#181A26) : Layar & Panel Riwayat bertema gelap transparan.

Border Glow (#2A2D3E) : Garis batas pemisah antar panel.

Numeric Keys (#1F2232) : Abu-abu kebiruan gelap untuk angka 0-9.

Math Functions (#2D3148) : Indigo pudar untuk tombol trigonometri & aljabar.

Basic Operators (#6366F1) : Indigo cerah sebagai aksen operator dasar.

Equals & Enter (#10B981) : Hijau Zamrud penanda eksekusi kalkulasi.

⌨️ Panduan Pintasan Keyboard
Gunakan keyboard fisik Anda untuk mempercepat perhitungan:

Angka 0-9 : Ketik langsung dari Numpad atau baris angka atas.

Operator + - * / : Menjalankan operasi dasar.

Tombol Enter : Mengeksekusi hasil (Sama dengan tombol =).

Tombol Backspace : Menghapus satu karakter terakhir.

Tombol Escape (Esc) : Menghapus semua layar (AC).

🚀 Panduan Menjalankan Aplikasi
Aplikasi ini tidak membutuhkan dependensi eksternal. Anda hanya membutuhkan Java Development Kit (JDK) 8+.

Persiapan File: Simpan kode sumber aplikasi ke dalam file bernama ScientificCalculator.java.

Kompilasi (Build): Buka Terminal/CMD, ketik javac ScientificCalculator.java

Eksekusi (Run): Jalankan program dengan perintah java ScientificCalculator

Dibuat untuk tujuan edukasi & Open Source | MIT License
