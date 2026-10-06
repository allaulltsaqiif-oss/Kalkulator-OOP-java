# 🧮 Scientific Calculator

<div align="center">

**Aplikasi kalkulator ilmiah berbasis Java Swing dengan UI modern Dark Theme**

![Java](https://img.shields.io/badge/Java-Swing-orange?style=for-the-badge\&logo=openjdk)
![UI](https://img.shields.io/badge/UI-Obsidian%20Dark%20Theme-6366F1?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completed-10B981?style=for-the-badge)

</div>

---

## 📑 Daftar Isi

* [✨ Tentang Project](#-tentang-project)
* [🎨 Tampilan & Konsep UI](#-tampilan--konsep-ui)

  * [🌑 Color Palette](#-color-palette)
* [🚀 Fitur](#-fitur)

  * [Basic Arithmetic](#1-basic-arithmetic)
  * [Scientific Functions](#2-scientific-functions)
  * [Calculation History](#calculation-history)
* [⌨️ Keyboard Support](#️-keyboard-support)
* [🧩 Struktur Program](#-struktur-program)
* [🏗️ Komponen Utama](#️-komponen-utama)

  * [`ScientificCalculator`](#scientificcalculator)
  * [`RoundedPanel`](#roundedpanel)
  * [`RoundedButton`](#roundedbutton)
* [🔢 Layout Tombol](#-layout-tombol)
* [⚙️ Cara Kerja Kalkulasi](#️-cara-kerja-kalkulasi)
* [🛡️ Error Handling](#️-error-handling)
* [▶️ Cara Menjalankan](#️-cara-menjalankan)

  * [Requirements](#requirements)
  * [Compile](#2-compile)
  * [Run](#3-run)
* [📁 Struktur Project](#-struktur-project)
* [📊 Format Angka](#-format-angka)
* [💡 Contoh Penggunaan](#-contoh-penggunaan)
* [🎯 Tujuan Project](#-tujuan-project)
* [🔮 Pengembangan Selanjutnya](#-pengembangan-selanjutnya)
* [📝 Catatan](#-catatan)
* [👨‍💻 Teknologi](#️-teknologi)

---

## ✨ Tentang Project

**Scientific Calculator** adalah aplikasi kalkulator desktop yang dibuat menggunakan **Java Swing**.

Aplikasi menyediakan operasi aritmatika dasar serta fungsi matematika seperti `sin`, `cos`, `tan`, `log`, akar kuadrat, dan pangkat dua.

---

## 🎨 Tampilan & Konsep UI

Aplikasi menggunakan konsep **Obsidian Dark Theme** dengan layout dua bagian:

* 🧮 Panel kalkulator
* 📜 Panel riwayat kalkulasi

Desain menggunakan rounded panel dan rounded button untuk memberikan tampilan yang lebih modern.

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

Mendukung:

* ➕ Penjumlahan
* ➖ Pengurangan
* ✖️ Perkalian
* ➗ Pembagian

Contoh:

```text
10 + 5 = 15
20 - 8 = 12
6 × 7 = 42
100 ÷ 4 = 25
```

### 2. Scientific Functions

Tersedia beberapa fungsi matematika:

| Tombol | Fungsi                  |
| ------ | ----------------------- |
| `√`    | Akar kuadrat            |
| `x²`   | Pangkat dua             |
| `sin`  | Sinus                   |
| `cos`  | Cosinus                 |
| `tan`  | Tangen                  |
| `log`  | Logaritma basis 10      |
| `±`    | Mengubah tanda bilangan |

### Calculation History

Setiap kalkulasi yang berhasil akan disimpan pada panel **Riwayat Kalkulasi**.

Contoh:

```text
10 + 20 = 30
√144 = 12
sin(90) = 1
5 × 8 = 40
```

---

## ⌨️ Keyboard Support

Aplikasi dapat dikontrol menggunakan keyboard.

| Tombol      | Fungsi               |
| ----------- | -------------------- |
| `0-9`       | Input angka          |
| `.`         | Desimal              |
| `+`         | Penjumlahan          |
| `-`         | Pengurangan          |
| `*`         | Perkalian            |
| `/`         | Pembagian            |
| `=`         | Menghitung           |
| `Enter`     | Menghitung           |
| `Backspace` | Hapus angka terakhir |
| `Escape`    | Clear / AC           |

---

## 🧩 Struktur Program

```text
ScientificCalculator.java
│
├── ScientificCalculator
│   ├── UI Initialization
│   ├── Button Creation
│   ├── Keyboard Binding
│   ├── Command Processing
│   ├── Number Handling
│   ├── Operator Handling
│   ├── Calculation
│   ├── Scientific Operations
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

### `ScientificCalculator`

Class utama aplikasi yang menangani:

* Window
* UI
* Button
* Input
* Kalkulasi
* History

### `RoundedPanel`

Custom panel untuk membuat container dengan sudut membulat.

### `RoundedButton`

Custom button dengan:

* Rounded corner
* Hover effect
* Pressed effect
* Custom color
* Custom typography

---

## 🔢 Layout Tombol

```text
┌─────┬─────┬─────┬─────┬─────┐
│  √  │ x²  │ AC  │  ⌫  │  ÷  │
├─────┼─────┼─────┼─────┼─────┤
│ sin │  7  │  8  │  9  │  ×  │
├─────┼─────┼─────┼─────┼─────┤
│ cos │  4  │  5  │  6  │  -  │
├─────┼─────┼─────┼─────┼─────┤
│ tan │  1  │  2  │  3  │  +  │
├─────┼─────┼─────┼─────┼─────┤
│ log │  ±  │  0  │  .  │  =  │
└─────┴─────┴─────┴─────┴─────┘
```

---

## ⚙️ Cara Kerja Kalkulasi

Alur input:

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

---

## 🛡️ Error Handling

Aplikasi menangani beberapa kondisi matematika yang tidak valid.

### Division by Zero

```text
10 ÷ 0
```

Hasil:

```text
Error
```

### Negative Square Root

```text
√-10
```

Hasil:

```text
Error
```

### Invalid Logarithm

```text
log(0)
log(-10)
```

Hasil:

```text
Error
```

---

## ▶️ Cara Menjalankan

### Requirements

Pastikan **JDK** sudah terinstall.

```bash
java -version
javac -version
```

### 1. Compile

```bash
javac ScientificCalculator.java
```

### 2. Run

```bash
java ScientificCalculator
```

---

## 📁 Struktur Project

```text
scientific-calculator/
│
├── ScientificCalculator.java
└── README.md
```

---

## 📊 Format Angka

Hasil kalkulasi menggunakan format:

```java
DecimalFormat("#.##########")
```

Sehingga hasil tidak menampilkan angka desimal yang terlalu panjang.

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

### Pangkat

```text
12 → x²
↓
144
```

### Akar

```text
144 → √
↓
12
```

---

## 🎯 Tujuan Project

Project ini dapat digunakan untuk mempelajari:

* Java Swing
* GUI Development
* Event Handling
* `ActionListener`
* `InputMap`
* `ActionMap`
* Object-Oriented Programming
* Custom Swing Components
* Mathematical Operations
* UI/UX dasar pada Java Desktop

---

## 🔮 Pengembangan Selanjutnya

Beberapa fitur yang dapat ditambahkan:

* [ ] `π`
* [ ] `e`
* [ ] `xʸ`
* [ ] `1/x`
* [ ] Faktorial
* [ ] Modulo
* [ ] `ln`
* [ ] Mode Radian
* [ ] Memory Calculator
* [ ] Light/Dark Theme
* [ ] Export History
* [ ] Shortcut untuk fungsi scientific

---

## 📝 Catatan

Seluruh implementasi saat ini berada dalam satu file:

```text
ScientificCalculator.java
```

UI custom dibuat menggunakan `RoundedPanel` dan `RoundedButton`.

---

## 👨‍💻 Teknologi

| Teknologi               | Penggunaan         |
| ----------------------- | ------------------ |
| ☕ Java                  | Bahasa pemrograman |
| 🖥️ Java Swing          | GUI                |
| 🎨 AWT                  | Graphics & Event   |
| 🧮 Math API             | Operasi matematika |
| 🔢 DecimalFormat        | Format angka       |
| 🔲 RoundRectangle2D     | Rounded UI         |
| ⌨️ InputMap / ActionMap | Keyboard shortcut  |

---

<div align="center">

### 🧮 Scientific Calculator

**Simple calculation. Scientific functions. Modern interface.**

Made with ❤️ using Java Swing.

</div>
