 <div align="center">

# 🧮 Calculator

**Aplikasi kalkulator berbasis Java Swing dengan UI modern Dark Theme**

<img src="https://img.shields.io/badge/Java-Swing-orange?style=for-the-badge&logo=openjdk" alt="Java Swing">
<img src="https://img.shields.io/badge/UI-Obsidian%20Dark%20Theme-6366F1?style=for-the-badge" alt="Obsidian Dark Theme">
<img src="https://img.shields.io/badge/Status-Completed-10B981?style=for-the-badge" alt="Completed">

</div>

---

## 📑 Daftar Isi

* [✨ Tentang Project](#-tentang-project)
* [🎨 Tampilan & Konsep UI](#-tampilan--konsep-ui)

  * [🌑 Color Palette](#-color-palette)
* [🚀 Fitur](#-fitur)

  * [1. Basic Arithmetic](#1-basic-arithmetic)
  * [2. Scientific Functions](#2-scientific-functions)
  * [Calculation History](#calculation-history)
* [⌨️ Keyboard Support](#️-keyboard-support)
* [🧩 Struktur Program](#-struktur-program)
* [🏗️ Komponen Utama](#️-komponen-utama)
* [🔢 Layout Tombol](#-layout-tombol)
* [⚙️ Cara Kerja Kalkulasi](#️-cara-kerja-kalkulasi)
* [🛡️ Error Handling](#️-error-handling)
* [▶️ Cara Menjalankan](#️-cara-menjalankan)
* [📁 Struktur Project](#-struktur-project)
* [📊 Format Angka](#-format-angka)
* [💡 Contoh Penggunaan](#-contoh-penggunaan)
* [🎯 Tujuan Project](#-tujuan-project)
* [🔮 Pengembangan Selanjutnya](#-pengembangan-selanjutnya)
* [📝 Catatan](#-catatan)
* [👥 Identitas Tim Pengembang](#-identitas-tim-pengembang)
* [🛠️ Teknologi yang Digunakan](#️-teknologi-yang-digunakan)

---

## ✨ Tentang Project

**Calculator** adalah aplikasi kalkulator desktop yang dikembangkan menggunakan **Java Swing** dengan tampilan modern bertema **Obsidian Dark Theme**.

Aplikasi ini menyediakan operasi aritmatika dasar serta beberapa fungsi matematika ilmiah, seperti `sin`, `cos`, `tan`, `log`, akar kuadrat, dan pangkat dua.

Selain melakukan perhitungan, aplikasi ini dilengkapi dengan panel riwayat kalkulasi, dukungan keyboard, serta komponen antarmuka khusus dengan sudut membulat.

---

## 🎨 Tampilan & Konsep UI

Aplikasi menggunakan konsep **Obsidian Dark Theme** dengan desain antarmuka yang terdiri dari dua bagian utama:

* 🧮 **Panel Kalkulator** — untuk memasukkan angka dan melakukan perhitungan.
* 📜 **Panel Riwayat Kalkulasi** — untuk menampilkan riwayat perhitungan.

Desain menggunakan `RoundedPanel` dan `RoundedButton` untuk memberikan tampilan yang lebih modern.

### 🌑 Color Palette

| Elemen            | Warna     |
| ----------------- | --------- |
| App Background    | `#0F111A` |
| Screen Background | `#181A26` |
| Border            | `#2A2D3E` |
| Number Button     | `#1F2232` |
| Function Button   | `#2D3148` |
| Operator Button   | `#6366F1` |
| Equal Button      | `#10B981` |

---

## 🚀 Fitur

### 1. Basic Arithmetic

Aplikasi mendukung empat operasi aritmatika dasar:

* ➕ Penjumlahan
* ➖ Pengurangan
* ✖️ Perkalian
* ➗ Pembagian

**Contoh perhitungan:**

```text
10 + 5 = 15
20 - 8 = 12
6 × 7 = 42
100 ÷ 4 = 25
```

### 2. Scientific Functions

Aplikasi menyediakan beberapa fungsi matematika ilmiah.

| Tombol | Fungsi                        |
| ------ | ----------------------------- |
| `√`    | Menghitung akar kuadrat       |
| `x²`   | Menghitung pangkat dua        |
| `sin`  | Menghitung sinus              |
| `cos`  | Menghitung cosinus            |
| `tan`  | Menghitung tangen             |
| `log`  | Menghitung logaritma basis 10 |
| `±`    | Mengubah tanda bilangan       |

**Contoh:**

```text
√144 = 12
12² = 144
sin(90) = 1
```

*Catatan: hasil trigonometri di atas mengasumsikan sudut dalam derajat.*

### Calculation History

Setiap kalkulasi yang berhasil dapat ditampilkan pada panel **Riwayat Kalkulasi**.

Contoh riwayat:

```text
10 + 20 = 30
√144 = 12
sin(90) = 1
5 × 8 = 40
```

Riwayat membantu pengguna melihat kembali hasil perhitungan yang telah dilakukan.

---

## ⌨️ Keyboard Support

Aplikasi mendukung penggunaan keyboard untuk memudahkan proses perhitungan.

| Tombol      | Fungsi                   |
| ----------- | ------------------------ |
| `0–9`       | Memasukkan angka         |
| `.`         | Memasukkan desimal       |
| `+`         | Penjumlahan              |
| `-`         | Pengurangan              |
| `*`         | Perkalian                |
| `/`         | Pembagian                |
| `=`         | Menghitung hasil         |
| `Enter`     | Menghitung hasil         |
| `Backspace` | Menghapus angka terakhir |
| `Escape`    | Clear / AC               |

---

## 🧩 Struktur Program

Struktur program dirancang agar komponen kalkulator mudah dipahami.

```text
Calculator.java
│
├── Calculator
│   ├── UI Initialization
│   ├── Button Creation
│   ├── Keyboard Binding
│   ├── Command Processing
│   ├── Number Handling
│   ├── Operator Handling
│   ├── Calculation
│   ├── Math Operations
│   └── History Management
│
├── RoundedPanel
│   └── Custom rounded panel
│
└── RoundedButton
    ├── Rounded button UI
    ├── Hover effect
    └── Pressed effect
```

---

## 🏗️ Komponen Utama

### `Calculator`

Class utama yang menangani:

* 🪟 Window dan inisialisasi UI
* 🔘 Pembuatan tombol
* ⌨️ Input dari keyboard
* 🔢 Pengolahan angka
* ➗ Operasi dan kalkulasi matematika
* 📜 Pengelolaan riwayat perhitungan

### `RoundedPanel`

Komponen panel khusus yang digunakan untuk membuat container dengan sudut membulat.

### `RoundedButton`

Komponen tombol khusus yang mendukung:

* Rounded corner
* Hover effect
* Pressed effect
* Custom color
* Custom typography

---

## 🔢 Layout Tombol

Kalkulator menggunakan **grid 5 × 5** yang terdiri dari tombol fungsi, angka, operator, dan tombol hasil.

| Kolom 1 | Kolom 2 | Kolom 3 | Kolom 4 | Kolom 5 |
| :-----: | :-----: | :-----: | :-----: | :-----: |
|    √    |    x²   |    AC   |    ⌫   |    ÷    |
|   sin   |    7    |    8    |    9    |    ×    |
|   cos   |    4    |    5    |    6    |    −    |
|   tan   |    1    |    2    |    3    |    +    |
|   log   |    ±    |    0    |    .    |    =    |

### 🎨 Kategori Tombol

| Kategori          | Tombol                                | Fungsi                        |
| ----------------- | ------------------------------------- | ----------------------------- |
| 🔢 **Angka**      | `0–9`                                 | Memasukkan angka              |
| 🔵 **Operator**   | `+`, `−`, `×`, `÷`                    | Operasi aritmatika            |
| 🧪 **Scientific** | `√`, `x²`, `sin`, `cos`, `tan`, `log` | Operasi matematika ilmiah     |
| ⚙️ **Control**    | `AC`, `⌫`, `±`                        | Mengontrol dan mengubah input |
| 🟢 **Result**     | `=`                                   | Menampilkan hasil kalkulasi   |
| 🔹 **Decimal**    | `.`                                   | Memasukkan angka desimal      |

Layout tombol didefinisikan menggunakan array dua dimensi pada source code:

```java
String[][] layout = {
    {"√", "x²", "AC", "⌫", "÷"},
    {"sin", "7", "8", "9", "×"},
    {"cos", "4", "5", "6", "-"},
    {"tan", "1", "2", "3", "+"},
    {"log", "±", "0", ".", "="}
};
```

Array tersebut digunakan untuk menyusun tombol secara teratur menggunakan `GridLayout(5, 5)`.

---

## ⚙️ Cara Kerja Kalkulasi

Secara umum, alur pemrosesan input kalkulator adalah sebagai berikut:

```text
User Input
    │
    ▼
processCommand()
    │
    ├── Number
    │     └── handleNumber()
    │
    ├── Decimal
    │     └── handleDecimal()
    │
    ├── Operator
    │     └── handleBinaryOperator()
    │
    ├── =
    │     └── handleEquals()
    │
    └── Scientific Function
          └── handleUnaryOperation()
```

Alur tersebut menggambarkan bagaimana input diproses berdasarkan jenis perintah, mulai dari angka dan operator hingga fungsi matematika ilmiah.

---

## 🛡️ Error Handling

Aplikasi dirancang untuk menangani kondisi matematika yang tidak valid.

### Division by Zero

Contoh input:

```text
10 ÷ 0
```

Hasil yang diharapkan:

```text
Error
```

### Negative Square Root

Contoh input:

```text
√(-10)
```

Hasil yang diharapkan:

```text
Error
```

### Invalid Logarithm

Contoh input:

```text
log(0)
log(-10)
```

Hasil yang diharapkan:

```text
Error
```

---

## ▶️ Cara Menjalankan

### Requirements

Pastikan **Java Development Kit (JDK)** sudah terpasang di komputer.

Periksa instalasi Java melalui terminal atau command prompt:

```bash
java -version
javac -version
```

### 1. Download Project

Unduh repository ini melalui GitHub atau gunakan Git:

```bash
git clone https://github.com/allaulltsaqiif-oss/Kalkulator-OOP-java.git
```

Masuk ke folder project dan pastikan file `Calculator.java` tersedia.

### 2. Compile

Jalankan perintah berikut di terminal pada folder yang berisi file Java:

```bash
javac Calculator.java
```

### 3. Run

Setelah proses kompilasi berhasil, jalankan aplikasi menggunakan:

```bash
java Calculator
```

Aplikasi kalkulator akan terbuka dalam jendela desktop jika proses kompilasi berhasil dan konfigurasi source code sesuai.

---

## 📁 Struktur Project

Struktur file project:

```text
Kalkulator-OOP-java/
│
├── Calculator.java
└── README.md
```

`Calculator.java` berisi source code aplikasi, sedangkan `README.md` berisi dokumentasi project.

---

## 📊 Format Angka

Hasil kalkulasi menggunakan format angka:

```java
DecimalFormat("#.##########")
```

Format ini membatasi jumlah digit desimal yang ditampilkan sehingga hasil perhitungan lebih mudah dibaca.

---

## 💡 Contoh Penggunaan

### Aritmatika

```text
25 × 4
↓
100
```

### Trigonometri

```text
sin(90)
↓
1
```

### Pangkat Dua

```text
12 → x²
↓
144
```

### Akar Kuadrat

```text
144 → √
↓
12
```

Contoh tersebut menggambarkan penggunaan tombol kalkulator untuk menjalankan berbagai operasi matematika.

---

## 🎯 Tujuan Project

Project ini dibuat sebagai sarana pembelajaran untuk memahami:

* ☕ Java Programming
* 🖥️ Java Swing
* 🎨 GUI Development
* ⚡ Event Handling
* 🔘 `ActionListener`
* ⌨️ `InputMap`
* ⌨️ `ActionMap`
* 🧩 Object-Oriented Programming
* 🏗️ Custom Swing Components
* 🧮 Mathematical Operations
* 🎨 Dasar UI/UX pada aplikasi desktop

---

## 🔮 Pengembangan Selanjutnya

Beberapa fitur yang berpotensi ditambahkan pada pengembangan berikutnya:

* [ ] `π` (Pi)
* [ ] `e` (Euler's number)
* [ ] `xʸ` (Pangkat)
* [ ] `1/x` (Kebalikan bilangan)
* [ ] Faktorial
* [ ] Modulo
* [ ] `ln` (Logaritma natural)
* [ ] Mode Radian
* [ ] Memory Calculator
* [ ] Light/Dark Theme
* [ ] Export History
* [ ] Shortcut untuk fungsi scientific

---

## 📝 Catatan

Seluruh implementasi aplikasi saat ini dirancang berada dalam satu file utama:

```text
Calculator.java
```

Komponen UI khusus seperti `RoundedPanel` dan `RoundedButton` digunakan untuk mendukung tampilan antarmuka kalkulator.

---

## 👥 Identitas Tim Pengembang

Berikut merupakan identitas anggota tim yang mengembangkan project Calculator.

## 👥 Identitas Tim Pengembang

| No. | Nama Anggota       |       NIM       |
| :-: | ------------------ | :-------------: |
|  1  | Al Aul Tsaqif      | 250810701100034 |
|  2  | M Farras Munawwir  | 250810701100004 |
|  3  | Imam Assadiq       | 250810701100079 |
|  4  | Syella Zikra Arifa | 250810701100014 |
---

## 🛠️ Teknologi yang Digunakan

| Ikon | Teknologi                | Penggunaan                                |
| :--: | ------------------------ | ----------------------------------------- |
|   ☕  | **Java**                 | Bahasa pemrograman utama                  |
|  🖥️ | **Java Swing**           | Membuat antarmuka grafis (GUI)            |
|  🎨  | **AWT**                  | Mendukung grafis, komponen, dan event     |
|  🧮  | **Math API**             | Menjalankan operasi matematika            |
|  🔢  | **DecimalFormat**        | Memformat hasil perhitungan               |
|  🔲  | **RoundRectangle2D**     | Mendukung bentuk UI dengan sudut membulat |
|  ⌨️  | **InputMap / ActionMap** | Mengatur shortcut keyboard                |
|  🐙  | **GitHub**               | Menyimpan dan membagikan source code      |

---

<div align="center">

### 🧮 Calculator

**Simple Calculation. Scientific Functions. Modern Interface.**

Developed with ❤️ by **Calculator Development Team**

Built using ☕ Java Swing · Hosted on 🐙 GitHub

</div>
